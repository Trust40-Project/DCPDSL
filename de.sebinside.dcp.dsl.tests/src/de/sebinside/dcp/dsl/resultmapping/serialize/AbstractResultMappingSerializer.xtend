package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.generator.GlobalConstants
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import de.sebinside.dcp.dsl.resultmapping.generate.ResultMapping
import de.sebinside.dcp.dsl.resultmapping.generate.Violation

abstract class AbstractResultMappingSerializer implements ResultMappingSerializer {

	protected Converter crossPlatformConverter

	package new() {
	}

	override serialize(String caseName, ResultMapping resultMapping) {
		var constraintCounter = 1
		this.crossPlatformConverter = resultMapping.targetModelCompliantConverter

		'''�makeTitle("General")�

Case name: �escape(caseName)�
Constraint count: �resultMapping.evaluatedConstraints.length�

�FOR constraint : resultMapping.evaluatedConstraints SEPARATOR "\n\n"�
�makeTitle('''Constraint �constraintCounter++�''')�

Constraint name: �escape(constraint.constraintName)�
Violations found: �constraint.violations.length�

�makeSubTitle("Constraint Details")�

�FOR selector : constraint.attributeSelectors BEFORE "Data Characteristics: " + advancedEnumHeader("Characteristic", "Value") SEPARATOR advancedEnumSeparator��mapCharacteristicTypeSelector(selector)��ENDFOR�
�FOR selector: constraint.attributeClasses BEFORE "Data Classes: " SEPARATOR ", "��mapCharacteristicClass(selector)��ENDFOR�
Condition: �highlight(constraint.statement.modality.name)� �highlight(constraint.statement.type.name)�
�FOR selector : constraint.propertySelectors BEFORE "Destination Characteristics: " + advancedEnumHeader("Characteristic", "Value") SEPARATOR advancedEnumSeparator��mapCharacteristicTypeSelector(selector)��ENDFOR�
�FOR selector: constraint.propertyClasses BEFORE "Destination Classes: " SEPARATOR ", "��mapCharacteristicClass(selector)��ENDFOR�
�FOR selector: constraint.nodeIdentities BEFORE "Destination Identity: " SEPARATOR ", "��mapNodeIdentity(selector)��ENDFOR�

�makeSubTitle("Constraint Violations")�

�FOR i : 0..(constraint.violations.size - 1) SEPARATOR "\n"�
�i+1�. Parameter �getParameterOrCallState(constraint.violations.get(i))� is not allowed to be �highlight(mapQueryType(constraint.violations.get(i).queryType))� in operation �escape(constraint.violations.get(i).operation)�.
�FOR entry: constraint.violations.get(i).callStack BEFORE "\t- Call Stack: " + indent(advancedEnumHeader("Node")) SEPARATOR advancedEnumSeparator��indent(mapCallStackEntry(entry))��ENDFOR�
�FOR variable: constraint.violations.get(i).classVariables.keySet BEFORE "\t- Characteristic Classes: " + indent(advancedEnumHeader("Parameter", "Class", "Value")) SEPARATOR advancedEnumSeparator��indent(mapClassVariable(variable, constraint.violations.get(i).classVariables.get(variable)))��ENDFOR�
�ENDFOR�
�ENDFOR�
'''
	}

	protected def getParameterOrCallState(Violation violation) {
		val variable = violation.parameter.isPresent ? violation.parameter.get : violation.callState.get
		escape(crossPlatformConverter.convertVariable(variable))
	}

	protected def mapQueryType(String queryType) {

		// TODO: Add special palladio escaping
		val typeCandidates = GlobalConstants.QueryTypes.values.filter[value|value.toString.equals(queryType)]

		if (typeCandidates.length != 1) {
			throw new RuntimeException("Illegal query type.")
		}

		switch (typeCandidates.head) {
			case CALL_ARGUMENT: "call argument"
			case RETURN_VALUE: "return value"
			case PRE_CALL_STATE: "call state"
			case POST_CALL_STATE: "call state"
		}
	}

	protected def String mapNodeIdentity(NodeIdentitiySelector selector) {
		escape(crossPlatformConverter.createQualifiedName(selector))
	}

	protected def String mapCharacteristicClass(CharacteristicClass clazz) {
		escape(clazz.name)
	}

	protected def String mapCallStackEntry(String entry) {
		escape(crossPlatformConverter.resolveQualifiedName(entry))
	}

	protected def String indent(String value) {
		'''�"\t"��value.lines.toArray.join("\n\t")��if(value.lines.toArray.size > 1) "\n" else ""�'''
	}

	abstract protected def String mapClassVariable(CharacteristicTypeSelector variable, String value)

	abstract protected def String advancedEnumHeader(String... entries)

	abstract protected def String advancedEnumSeparator()

	abstract protected def String makeTitle(String value)

	abstract protected def String makeSubTitle(String value)

	abstract protected def String mapCharacteristicTypeSelector(CharacteristicTypeSelector selector)

	abstract protected def String escape(String value)

	abstract protected def String highlight(String value)

}