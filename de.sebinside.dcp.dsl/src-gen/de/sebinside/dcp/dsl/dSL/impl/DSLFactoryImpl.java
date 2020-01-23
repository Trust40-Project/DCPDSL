/**
 * generated by Xtext 2.20.0
 */
package de.sebinside.dcp.dsl.dSL.impl;

import de.sebinside.dcp.dsl.dSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSLFactoryImpl extends EFactoryImpl implements DSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLFactory init()
  {
    try
    {
      DSLFactory theDSLFactory = (DSLFactory)EPackage.Registry.INSTANCE.getEFactory(DSLPackage.eNS_URI);
      if (theDSLFactory != null)
      {
        return theDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DSLPackage.MODEL: return createModel();
      case DSLPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case DSLPackage.DATA_TYPE: return createDataType();
      case DSLPackage.VALUE_SET: return createValueSet();
      case DSLPackage.CHARACTERISTICS_TYPE: return createCharacteristicsType();
      case DSLPackage.ATTRIBUTE_TYPE: return createAttributeType();
      case DSLPackage.PROPERTY_TYPE: return createPropertyType();
      case DSLPackage.CHARACTERISTIC_CLASS: return createCharacteristicClass();
      case DSLPackage.CHARACTERISTIC_SELECTOR: return createCharacteristicSelector();
      case DSLPackage.CONSTRAINT: return createConstraint();
      case DSLPackage.RULE: return createRule();
      case DSLPackage.DATA_SELECTOR: return createDataSelector();
      case DSLPackage.ATTRIBUTE_SELECTOR: return createAttributeSelector();
      case DSLPackage.ATTRIBUTE_CLASS_SELECTOR: return createAttributeClassSelector();
      case DSLPackage.DESTINATION_SELECTOR: return createDestinationSelector();
      case DSLPackage.PROPERTY_SELECTOR: return createPropertySelector();
      case DSLPackage.PROPERTY_CLASS_SELECTOR: return createPropertyClassSelector();
      case DSLPackage.STATEMENT: return createStatement();
      case DSLPackage.STATEMENT_TYPE: return createStatementType();
      case DSLPackage.STATEMENT_MODALITY: return createStatementModality();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValueSet createValueSet()
  {
    ValueSetImpl valueSet = new ValueSetImpl();
    return valueSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharacteristicsType createCharacteristicsType()
  {
    CharacteristicsTypeImpl characteristicsType = new CharacteristicsTypeImpl();
    return characteristicsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeType createAttributeType()
  {
    AttributeTypeImpl attributeType = new AttributeTypeImpl();
    return attributeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyType createPropertyType()
  {
    PropertyTypeImpl propertyType = new PropertyTypeImpl();
    return propertyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharacteristicClass createCharacteristicClass()
  {
    CharacteristicClassImpl characteristicClass = new CharacteristicClassImpl();
    return characteristicClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharacteristicSelector createCharacteristicSelector()
  {
    CharacteristicSelectorImpl characteristicSelector = new CharacteristicSelectorImpl();
    return characteristicSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataSelector createDataSelector()
  {
    DataSelectorImpl dataSelector = new DataSelectorImpl();
    return dataSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeSelector createAttributeSelector()
  {
    AttributeSelectorImpl attributeSelector = new AttributeSelectorImpl();
    return attributeSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeClassSelector createAttributeClassSelector()
  {
    AttributeClassSelectorImpl attributeClassSelector = new AttributeClassSelectorImpl();
    return attributeClassSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DestinationSelector createDestinationSelector()
  {
    DestinationSelectorImpl destinationSelector = new DestinationSelectorImpl();
    return destinationSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertySelector createPropertySelector()
  {
    PropertySelectorImpl propertySelector = new PropertySelectorImpl();
    return propertySelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyClassSelector createPropertyClassSelector()
  {
    PropertyClassSelectorImpl propertyClassSelector = new PropertyClassSelectorImpl();
    return propertyClassSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StatementType createStatementType()
  {
    StatementTypeImpl statementType = new StatementTypeImpl();
    return statementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StatementModality createStatementModality()
  {
    StatementModalityImpl statementModality = new StatementModalityImpl();
    return statementModality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLPackage getDSLPackage()
  {
    return (DSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DSLPackage getPackage()
  {
    return DSLPackage.eINSTANCE;
  }

} //DSLFactoryImpl
