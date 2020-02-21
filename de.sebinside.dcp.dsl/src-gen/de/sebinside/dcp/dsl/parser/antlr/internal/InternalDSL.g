/*
 * generated by Xtext 2.20.0
 */
grammar InternalDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.sebinside.dcp.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.sebinside.dcp.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.sebinside.dcp.dsl.services.DSLGrammarAccess;

}

@parser::members {

 	private DSLGrammarAccess grammarAccess;

    public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected DSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0());
			}
			lv_elements_0_0=ruleAbstractElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"de.sebinside.dcp.dsl.DSL.AbstractElement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractElementRule()); }
	iv_ruleAbstractElement=ruleAbstractElement
	{ $current=$iv_ruleAbstractElement.current; }
	EOF;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getDataTypeParserRuleCall_0());
		}
		this_DataType_0=ruleDataType
		{
			$current = $this_DataType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getValueSetParserRuleCall_1());
		}
		this_ValueSet_1=ruleValueSet
		{
			$current = $this_ValueSet_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getCharacteristicsTypeParserRuleCall_2());
		}
		this_CharacteristicsType_2=ruleCharacteristicsType
		{
			$current = $this_CharacteristicsType_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getCharacteristicClassParserRuleCall_3());
		}
		this_CharacteristicClass_3=ruleCharacteristicClass
		{
			$current = $this_CharacteristicClass_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_4());
		}
		this_Constraint_4=ruleConstraint
		{
			$current = $this_Constraint_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatype'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleValueSet
entryRuleValueSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueSetRule()); }
	iv_ruleValueSet=ruleValueSet
	{ $current=$iv_ruleValueSet.current; }
	EOF;

// Rule ValueSet
ruleValueSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='valueset'
		{
			newLeafNode(otherlv_0, grammarAccess.getValueSetAccess().getValuesetKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getValueSetAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueSetRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		this_ASSIGNEMENT_OPERATOR_2=RULE_ASSIGNEMENT_OPERATOR
		{
			newLeafNode(this_ASSIGNEMENT_OPERATOR_2, grammarAccess.getValueSetAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2());
		}
		otherlv_3='['
		{
			newLeafNode(otherlv_3, grammarAccess.getValueSetAccess().getLeftSquareBracketKeyword_3());
		}
		(
			(
				lv_members_4_0=RULE_ID
				{
					newLeafNode(lv_members_4_0, grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueSetRule());
					}
					addWithLastConsumed(
						$current,
						"members",
						lv_members_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getValueSetAccess().getCommaKeyword_5_0());
			}
			(
				(
					lv_members_6_0=RULE_ID
					{
						newLeafNode(lv_members_6_0, grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getValueSetRule());
						}
						addWithLastConsumed(
							$current,
							"members",
							lv_members_6_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
		otherlv_7=']'
		{
			newLeafNode(otherlv_7, grammarAccess.getValueSetAccess().getRightSquareBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleCharacteristicsType
entryRuleCharacteristicsType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCharacteristicsTypeRule()); }
	iv_ruleCharacteristicsType=ruleCharacteristicsType
	{ $current=$iv_ruleCharacteristicsType.current; }
	EOF;

// Rule CharacteristicsType
ruleCharacteristicsType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCharacteristicsTypeAccess().getAttributeTypeParserRuleCall_0());
		}
		this_AttributeType_0=ruleAttributeType
		{
			$current = $this_AttributeType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCharacteristicsTypeAccess().getPropertyTypeParserRuleCall_1());
		}
		this_PropertyType_1=rulePropertyType
		{
			$current = $this_PropertyType_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAttributeType
entryRuleAttributeType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeTypeRule()); }
	iv_ruleAttributeType=ruleAttributeType
	{ $current=$iv_ruleAttributeType.current; }
	EOF;

// Rule AttributeType
ruleAttributeType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='attribute'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getAttributeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAttributeTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		this_ASSIGNEMENT_OPERATOR_2=RULE_ASSIGNEMENT_OPERATOR
		{
			newLeafNode(this_ASSIGNEMENT_OPERATOR_2, grammarAccess.getAttributeTypeAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeTypeRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getAttributeTypeAccess().getValuesetValueSetCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRulePropertyType
entryRulePropertyType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyTypeRule()); }
	iv_rulePropertyType=rulePropertyType
	{ $current=$iv_rulePropertyType.current; }
	EOF;

// Rule PropertyType
rulePropertyType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='property'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertyTypeAccess().getPropertyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPropertyTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		this_ASSIGNEMENT_OPERATOR_2=RULE_ASSIGNEMENT_OPERATOR
		{
			newLeafNode(this_ASSIGNEMENT_OPERATOR_2, grammarAccess.getPropertyTypeAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyTypeRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getPropertyTypeAccess().getValuesetValueSetCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleCharacteristicClass
entryRuleCharacteristicClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCharacteristicClassRule()); }
	iv_ruleCharacteristicClass=ruleCharacteristicClass
	{ $current=$iv_ruleCharacteristicClass.current; }
	EOF;

// Rule CharacteristicClass
ruleCharacteristicClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='class'
		{
			newLeafNode(otherlv_0, grammarAccess.getCharacteristicClassAccess().getClassKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCharacteristicClassAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCharacteristicClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicSelectorParserRuleCall_3_0());
				}
				lv_members_3_0=ruleCharacteristicSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCharacteristicClassRule());
					}
					add(
						$current,
						"members",
						lv_members_3_0,
						"de.sebinside.dcp.dsl.DSL.CharacteristicSelector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicSelectorParserRuleCall_4_1_0());
					}
					lv_members_5_0=ruleCharacteristicSelector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCharacteristicClassRule());
						}
						add(
							$current,
							"members",
							lv_members_5_0,
							"de.sebinside.dcp.dsl.DSL.CharacteristicSelector");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getCharacteristicClassAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleCharacteristicSelector
entryRuleCharacteristicSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCharacteristicSelectorRule()); }
	iv_ruleCharacteristicSelector=ruleCharacteristicSelector
	{ $current=$iv_ruleCharacteristicSelector.current; }
	EOF;

// Rule CharacteristicSelector
ruleCharacteristicSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getCharacteristicSelectorAccess().getRefCharacteristicsTypeCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getCharacteristicSelectorAccess().getFullStopKeyword_1());
		}
		(
			(
				(
					(
						lv_negated_2_0='!'
						{
							newLeafNode(lv_negated_2_0, grammarAccess.getCharacteristicSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
							}
							setWithLastConsumed($current, "negated", true, "!");
						}
					)
				)?
				(
					(
						lv_literals_3_0=RULE_ID
						{
							newLeafNode(lv_literals_3_0, grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
							}
							addWithLastConsumed(
								$current,
								"literals",
								lv_literals_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				otherlv_4='['
				{
					newLeafNode(otherlv_4, grammarAccess.getCharacteristicSelectorAccess().getLeftSquareBracketKeyword_2_1_0());
				}
				(
					(
						lv_literals_5_0=RULE_ID
						{
							newLeafNode(lv_literals_5_0, grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
							}
							addWithLastConsumed(
								$current,
								"literals",
								lv_literals_5_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					(
						otherlv_6=','
						{
							newLeafNode(otherlv_6, grammarAccess.getCharacteristicSelectorAccess().getCommaKeyword_2_1_2_0_0());
						}
						(
							(
								lv_literals_7_0=RULE_ID
								{
									newLeafNode(lv_literals_7_0, grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_2_0_1_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
									}
									addWithLastConsumed(
										$current,
										"literals",
										lv_literals_7_0,
										"org.eclipse.xtext.common.Terminals.ID");
								}
							)
						)
					)*
					    |
					(
						(
							(
								lv_conjuncted_8_0='&'
								{
									newLeafNode(lv_conjuncted_8_0, grammarAccess.getCharacteristicSelectorAccess().getConjunctedAmpersandKeyword_2_1_2_1_0_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
									}
									setWithLastConsumed($current, "conjuncted", true, "&");
								}
							)
						)
						(
							(
								lv_literals_9_0=RULE_ID
								{
									newLeafNode(lv_literals_9_0, grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_2_1_1_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
									}
									addWithLastConsumed(
										$current,
										"literals",
										lv_literals_9_0,
										"org.eclipse.xtext.common.Terminals.ID");
								}
							)
						)
					)*
				)
				otherlv_10=']'
				{
					newLeafNode(otherlv_10, grammarAccess.getCharacteristicSelectorAccess().getRightSquareBracketKeyword_2_1_3());
				}
			)
		)
	)
;

// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	iv_ruleConstraint=ruleConstraint
	{ $current=$iv_ruleConstraint.current; }
	EOF;

// Rule Constraint
ruleConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='constraint'
		{
			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstraintRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConstraintAccess().getRuleRuleParserRuleCall_3_0());
				}
				lv_rule_3_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstraintRule());
					}
					set(
						$current,
						"rule",
						lv_rule_3_0,
						"de.sebinside.dcp.dsl.DSL.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_0_0());
				}
				lv_dataSelectors_0_0=ruleDataSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					add(
						$current,
						"dataSelectors",
						lv_dataSelectors_0_0,
						"de.sebinside.dcp.dsl.DSL.DataSelector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='&'
			{
				newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getAmpersandKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_1_1_0());
					}
					lv_dataSelectors_2_0=ruleDataSelector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleRule());
						}
						add(
							$current,
							"dataSelectors",
							lv_dataSelectors_2_0,
							"de.sebinside.dcp.dsl.DSL.DataSelector");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_2_0());
				}
				lv_statement_3_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"statement",
						lv_statement_3_0,
						"de.sebinside.dcp.dsl.DSL.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_3_0());
				}
				lv_destinationSelectors_4_0=ruleDestinationSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					add(
						$current,
						"destinationSelectors",
						lv_destinationSelectors_4_0,
						"de.sebinside.dcp.dsl.DSL.DestinationSelector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='&'
			{
				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getAmpersandKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_4_1_0());
					}
					lv_destinationSelectors_6_0=ruleDestinationSelector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleRule());
						}
						add(
							$current,
							"destinationSelectors",
							lv_destinationSelectors_6_0,
							"de.sebinside.dcp.dsl.DSL.DestinationSelector");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleDataSelector
entryRuleDataSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataSelectorRule()); }
	iv_ruleDataSelector=ruleDataSelector
	{ $current=$iv_ruleDataSelector.current; }
	EOF;

// Rule DataSelector
ruleDataSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDataSelectorAccess().getAttributeSelectorParserRuleCall_0());
		}
		this_AttributeSelector_0=ruleAttributeSelector
		{
			$current = $this_AttributeSelector_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataSelectorAccess().getAttributeClassSelectorParserRuleCall_1());
		}
		this_AttributeClassSelector_1=ruleAttributeClassSelector
		{
			$current = $this_AttributeClassSelector_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAttributeSelector
entryRuleAttributeSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeSelectorRule()); }
	iv_ruleAttributeSelector=ruleAttributeSelector
	{ $current=$iv_ruleAttributeSelector.current; }
	EOF;

// Rule AttributeSelector
ruleAttributeSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='data.attribute.'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeSelectorAccess().getRefCharacteristicSelectorParserRuleCall_1_0());
				}
				lv_ref_1_0=ruleCharacteristicSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
					}
					set(
						$current,
						"ref",
						lv_ref_1_0,
						"de.sebinside.dcp.dsl.DSL.CharacteristicSelector");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAttributeClassSelector
entryRuleAttributeClassSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeClassSelectorRule()); }
	iv_ruleAttributeClassSelector=ruleAttributeClassSelector
	{ $current=$iv_ruleAttributeClassSelector.current; }
	EOF;

// Rule AttributeClassSelector
ruleAttributeClassSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='data.class.'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0());
		}
		(
			(
				lv_negated_1_0='!'
				{
					newLeafNode(lv_negated_1_0, grammarAccess.getAttributeClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeClassSelectorRule());
					}
					setWithLastConsumed($current, "negated", true, "!");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeClassSelectorRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDestinationSelector
entryRuleDestinationSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDestinationSelectorRule()); }
	iv_ruleDestinationSelector=ruleDestinationSelector
	{ $current=$iv_ruleDestinationSelector.current; }
	EOF;

// Rule DestinationSelector
ruleDestinationSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDestinationSelectorAccess().getPropertySelectorParserRuleCall_0());
		}
		this_PropertySelector_0=rulePropertySelector
		{
			$current = $this_PropertySelector_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1());
		}
		this_PropertyClassSelector_1=rulePropertyClassSelector
		{
			$current = $this_PropertyClassSelector_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePropertySelector
entryRulePropertySelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertySelectorRule()); }
	iv_rulePropertySelector=rulePropertySelector
	{ $current=$iv_rulePropertySelector.current; }
	EOF;

// Rule PropertySelector
rulePropertySelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='node.property.'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertySelectorAccess().getRefCharacteristicSelectorParserRuleCall_1_0());
				}
				lv_ref_1_0=ruleCharacteristicSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertySelectorRule());
					}
					set(
						$current,
						"ref",
						lv_ref_1_0,
						"de.sebinside.dcp.dsl.DSL.CharacteristicSelector");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePropertyClassSelector
entryRulePropertyClassSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyClassSelectorRule()); }
	iv_rulePropertyClassSelector=rulePropertyClassSelector
	{ $current=$iv_rulePropertyClassSelector.current; }
	EOF;

// Rule PropertyClassSelector
rulePropertyClassSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='node.class.'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0());
		}
		(
			(
				lv_negated_1_0='!'
				{
					newLeafNode(lv_negated_1_0, grammarAccess.getPropertyClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyClassSelectorRule());
					}
					setWithLastConsumed($current, "negated", true, "!");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyClassSelectorRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0());
				}
				lv_modality_0_0=ruleStatementModality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"modality",
						lv_modality_0_0,
						"de.sebinside.dcp.dsl.DSL.StatementModality");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getTypeStatementTypeParserRuleCall_1_0());
				}
				lv_type_1_0=ruleStatementType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"de.sebinside.dcp.dsl.DSL.StatementType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStatementType
entryRuleStatementType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementTypeRule()); }
	iv_ruleStatementType=ruleStatementType
	{ $current=$iv_ruleStatementType.current; }
	EOF;

// Rule StatementType
ruleStatementType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0='FLOWS'
			{
				newLeafNode(lv_name_0_0, grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStatementTypeRule());
				}
				setWithLastConsumed($current, "name", lv_name_0_0, "FLOWS");
			}
		)
	)
;

// Entry rule entryRuleStatementModality
entryRuleStatementModality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementModalityRule()); }
	iv_ruleStatementModality=ruleStatementModality
	{ $current=$iv_ruleStatementModality.current; }
	EOF;

// Rule StatementModality
ruleStatementModality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0='NEVER'
			{
				newLeafNode(lv_name_0_0, grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStatementModalityRule());
				}
				setWithLastConsumed($current, "name", lv_name_0_0, "NEVER");
			}
		)
	)
;

RULE_ASSIGNEMENT_OPERATOR : '<-';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
