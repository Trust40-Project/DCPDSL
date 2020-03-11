/*
 * generated by Xtext 2.20.0
 */
package de.sebinside.dcp.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.sebinside.dcp.dsl.ide.contentassist.antlr.internal.InternalDSLParser;
import de.sebinside.dcp.dsl.services.DSLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getAlternatives_2(), "rule__CharacteristicTypeSelector__Alternatives_2");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getAlternatives_2_1_2(), "rule__CharacteristicTypeSelector__Alternatives_2_1_2");
			builder.put(grammarAccess.getDataSelectorAccess().getAlternatives(), "rule__DataSelector__Alternatives");
			builder.put(grammarAccess.getDestinationSelectorAccess().getAlternatives(), "rule__DestinationSelector__Alternatives");
			builder.put(grammarAccess.getCharacteristicTypeAccess().getGroup(), "rule__CharacteristicType__Group__0");
			builder.put(grammarAccess.getCharacteristicClassAccess().getGroup(), "rule__CharacteristicClass__Group__0");
			builder.put(grammarAccess.getCharacteristicClassAccess().getGroup_4(), "rule__CharacteristicClass__Group_4__0");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup(), "rule__CharacteristicTypeSelector__Group__0");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_0(), "rule__CharacteristicTypeSelector__Group_2_0__0");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1(), "rule__CharacteristicTypeSelector__Group_2_1__0");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1_2_0(), "rule__CharacteristicTypeSelector__Group_2_1_2_0__0");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1_2_1(), "rule__CharacteristicTypeSelector__Group_2_1_2_1__0");
			builder.put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
			builder.put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup_1(), "rule__Rule__Group_1__0");
			builder.put(grammarAccess.getRuleAccess().getGroup_4(), "rule__Rule__Group_4__0");
			builder.put(grammarAccess.getAttributeSelectorAccess().getGroup(), "rule__AttributeSelector__Group__0");
			builder.put(grammarAccess.getAttributeClassSelectorAccess().getGroup(), "rule__AttributeClassSelector__Group__0");
			builder.put(grammarAccess.getPropertySelectorAccess().getGroup(), "rule__PropertySelector__Group__0");
			builder.put(grammarAccess.getPropertyClassSelectorAccess().getGroup(), "rule__PropertyClassSelector__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
			builder.put(grammarAccess.getModelAccess().getElementsAssignment(), "rule__Model__ElementsAssignment");
			builder.put(grammarAccess.getCharacteristicTypeAccess().getNameAssignment_1(), "rule__CharacteristicType__NameAssignment_1");
			builder.put(grammarAccess.getCharacteristicTypeAccess().getRefAssignment_3(), "rule__CharacteristicType__RefAssignment_3");
			builder.put(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1(), "rule__CharacteristicClass__NameAssignment_1");
			builder.put(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3(), "rule__CharacteristicClass__MembersAssignment_3");
			builder.put(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1(), "rule__CharacteristicClass__MembersAssignment_4_1");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getRefAssignment_0(), "rule__CharacteristicTypeSelector__RefAssignment_0");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedAssignment_2_0_0(), "rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_0_1(), "rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_1(), "rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_2_0_1(), "rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_0_1");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getConjunctedAssignment_2_1_2_1_0(), "rule__CharacteristicTypeSelector__ConjunctedAssignment_2_1_2_1_0");
			builder.put(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_2_1_1(), "rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1_1");
			builder.put(grammarAccess.getIncludeAccess().getImportURIAssignment_1(), "rule__Include__ImportURIAssignment_1");
			builder.put(grammarAccess.getConstraintAccess().getNameAssignment_1(), "rule__Constraint__NameAssignment_1");
			builder.put(grammarAccess.getConstraintAccess().getRuleAssignment_3(), "rule__Constraint__RuleAssignment_3");
			builder.put(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0(), "rule__Rule__DataSelectorsAssignment_0");
			builder.put(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1(), "rule__Rule__DataSelectorsAssignment_1_1");
			builder.put(grammarAccess.getRuleAccess().getStatementAssignment_2(), "rule__Rule__StatementAssignment_2");
			builder.put(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3(), "rule__Rule__DestinationSelectorsAssignment_3");
			builder.put(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1(), "rule__Rule__DestinationSelectorsAssignment_4_1");
			builder.put(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1(), "rule__AttributeSelector__RefAssignment_1");
			builder.put(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_1(), "rule__AttributeClassSelector__RefAssignment_1");
			builder.put(grammarAccess.getPropertySelectorAccess().getRefAssignment_1(), "rule__PropertySelector__RefAssignment_1");
			builder.put(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_1(), "rule__PropertyClassSelector__RefAssignment_1");
			builder.put(grammarAccess.getStatementAccess().getModalityAssignment_0(), "rule__Statement__ModalityAssignment_0");
			builder.put(grammarAccess.getStatementAccess().getTypeAssignment_1(), "rule__Statement__TypeAssignment_1");
			builder.put(grammarAccess.getStatementTypeAccess().getNameAssignment(), "rule__StatementType__NameAssignment");
			builder.put(grammarAccess.getStatementModalityAccess().getNameAssignment(), "rule__StatementModality__NameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DSLGrammarAccess grammarAccess;

	@Override
	protected InternalDSLParser createParser() {
		InternalDSLParser result = new InternalDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
