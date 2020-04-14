/**
 * generated by Xtext 2.21.0
 */
package de.sebinside.dcp.dsl.dSL.impl;

import de.sebinside.dcp.dsl.dSL.AbstractElement;
import de.sebinside.dcp.dsl.dSL.AttributeClassSelector;
import de.sebinside.dcp.dsl.dSL.AttributeSelector;
import de.sebinside.dcp.dsl.dSL.CharacteristicClass;
import de.sebinside.dcp.dsl.dSL.CharacteristicType;
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector;
import de.sebinside.dcp.dsl.dSL.Constraint;
import de.sebinside.dcp.dsl.dSL.DSLFactory;
import de.sebinside.dcp.dsl.dSL.DSLPackage;
import de.sebinside.dcp.dsl.dSL.DataSelector;
import de.sebinside.dcp.dsl.dSL.DestinationSelector;
import de.sebinside.dcp.dsl.dSL.Include;
import de.sebinside.dcp.dsl.dSL.Model;
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector;
import de.sebinside.dcp.dsl.dSL.PropertyClassSelector;
import de.sebinside.dcp.dsl.dSL.PropertySelector;
import de.sebinside.dcp.dsl.dSL.Rule;
import de.sebinside.dcp.dsl.dSL.Statement;
import de.sebinside.dcp.dsl.dSL.StatementModality;
import de.sebinside.dcp.dsl.dSL.StatementType;
import de.sebinside.dcp.dsl.dSL.TargetModelType;
import de.sebinside.dcp.dsl.dSL.TargetModelTypeDef;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.allocation.AllocationPackage;

import org.palladiosimulator.pcm.core.CorePackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;

import org.palladiosimulator.pcm.parameter.ParameterPackage;

import org.palladiosimulator.pcm.protocol.ProtocolPackage;

import org.palladiosimulator.pcm.qosannotations.QosannotationsPackage;

import org.palladiosimulator.pcm.qosannotations.qos_performance.QosPerformancePackage;

import org.palladiosimulator.pcm.qosannotations.qos_reliability.QosReliabilityPackage;

import org.palladiosimulator.pcm.reliability.ReliabilityPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage;

import org.palladiosimulator.pcm.seff.SeffPackage;

import org.palladiosimulator.pcm.system.SystemPackage;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSLPackageImpl extends EPackageImpl implements DSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetModelTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characteristicTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characteristicClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characteristicTypeSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeClassSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass destinationSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertySelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyClassSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeIdentitiySelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementModalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum targetModelTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DSLPackageImpl()
  {
    super(eNS_URI, DSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link DSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DSLPackage init()
  {
    if (isInited) return (DSLPackage)EPackage.Registry.INSTANCE.getEPackage(DSLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    DSLPackageImpl theDSLPackage = registeredDSLPackage instanceof DSLPackageImpl ? (DSLPackageImpl)registeredDSLPackage : new DSLPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();
    CharacteristicsPackage.eINSTANCE.eClass();
    AllocationPackage.eINSTANCE.eClass();
    CompositionPackage.eINSTANCE.eClass();
    RepositoryPackage.eINSTANCE.eClass();
    SeffPackage.eINSTANCE.eClass();
    UsagemodelPackage.eINSTANCE.eClass();
    IdentifierPackage.eINSTANCE.eClass();
    EntityPackage.eINSTANCE.eClass();
    org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage.eINSTANCE.eClass();
    ResourceenvironmentPackage.eINSTANCE.eClass();
    SystemPackage.eINSTANCE.eClass();
    CorePackage.eINSTANCE.eClass();
    ParameterPackage.eINSTANCE.eClass();
    ReliabilityPackage.eINSTANCE.eClass();
    ResourcetypePackage.eINSTANCE.eClass();
    ProtocolPackage.eINSTANCE.eClass();
    DataPackage.eINSTANCE.eClass();
    QosannotationsPackage.eINSTANCE.eClass();
    StoexPackage.eINSTANCE.eClass();
    QosPerformancePackage.eINSTANCE.eClass();
    QosReliabilityPackage.eINSTANCE.eClass();
    UnitsPackage.eINSTANCE.eClass();
    ProbfunctionPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theDSLPackage.createPackageContents();

    // Initialize created meta-data
    theDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDSLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DSLPackage.eNS_URI, theDSLPackage);
    return theDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_TargetModelType()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTargetModelTypeDef()
  {
    return targetModelTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTargetModelTypeDef_Type()
  {
    return (EAttribute)targetModelTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTargetModelTypeDef_TypeContainer()
  {
    return (EReference)targetModelTypeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTargetModelTypeDef_AllocationModel()
  {
    return (EReference)targetModelTypeDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTargetModelTypeDef_UsageModel()
  {
    return (EReference)targetModelTypeDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCharacteristicType()
  {
    return characteristicTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCharacteristicType_Name()
  {
    return (EAttribute)characteristicTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCharacteristicType_Ref()
  {
    return (EReference)characteristicTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCharacteristicClass()
  {
    return characteristicClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCharacteristicClass_Name()
  {
    return (EAttribute)characteristicClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCharacteristicClass_Members()
  {
    return (EReference)characteristicClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCharacteristicTypeSelector()
  {
    return characteristicTypeSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCharacteristicTypeSelector_Ref()
  {
    return (EReference)characteristicTypeSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCharacteristicTypeSelector_Negated()
  {
    return (EAttribute)characteristicTypeSelectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCharacteristicTypeSelector_Literals()
  {
    return (EReference)characteristicTypeSelectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInclude()
  {
    return includeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInclude_ImportURI()
  {
    return (EAttribute)includeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getConstraint_Name()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConstraint_Rule()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRule_DataSelectors()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRule_Statement()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRule_DestinationSelectors()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDataSelector()
  {
    return dataSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAttributeSelector()
  {
    return attributeSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAttributeSelector_Ref()
  {
    return (EReference)attributeSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAttributeClassSelector()
  {
    return attributeClassSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAttributeClassSelector_Ref()
  {
    return (EReference)attributeClassSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDestinationSelector()
  {
    return destinationSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPropertySelector()
  {
    return propertySelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPropertySelector_Ref()
  {
    return (EReference)propertySelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPropertyClassSelector()
  {
    return propertyClassSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPropertyClassSelector_Ref()
  {
    return (EReference)propertyClassSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNodeIdentitiySelector()
  {
    return nodeIdentitiySelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNodeIdentitiySelector_Name()
  {
    return (EAttribute)nodeIdentitiySelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNodeIdentitiySelector_Assembly()
  {
    return (EReference)nodeIdentitiySelectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNodeIdentitiySelector_Component()
  {
    return (EReference)nodeIdentitiySelectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNodeIdentitiySelector_Seff()
  {
    return (EReference)nodeIdentitiySelectorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStatement_Modality()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStatement_Type()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStatementType()
  {
    return statementTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStatementType_Name()
  {
    return (EAttribute)statementTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStatementModality()
  {
    return statementModalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStatementModality_Name()
  {
    return (EAttribute)statementModalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getTargetModelType()
  {
    return targetModelTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLFactory getDSLFactory()
  {
    return (DSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__TARGET_MODEL_TYPE);
    createEReference(modelEClass, MODEL__ELEMENTS);

    targetModelTypeDefEClass = createEClass(TARGET_MODEL_TYPE_DEF);
    createEAttribute(targetModelTypeDefEClass, TARGET_MODEL_TYPE_DEF__TYPE);
    createEReference(targetModelTypeDefEClass, TARGET_MODEL_TYPE_DEF__TYPE_CONTAINER);
    createEReference(targetModelTypeDefEClass, TARGET_MODEL_TYPE_DEF__ALLOCATION_MODEL);
    createEReference(targetModelTypeDefEClass, TARGET_MODEL_TYPE_DEF__USAGE_MODEL);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);

    characteristicTypeEClass = createEClass(CHARACTERISTIC_TYPE);
    createEAttribute(characteristicTypeEClass, CHARACTERISTIC_TYPE__NAME);
    createEReference(characteristicTypeEClass, CHARACTERISTIC_TYPE__REF);

    characteristicClassEClass = createEClass(CHARACTERISTIC_CLASS);
    createEAttribute(characteristicClassEClass, CHARACTERISTIC_CLASS__NAME);
    createEReference(characteristicClassEClass, CHARACTERISTIC_CLASS__MEMBERS);

    characteristicTypeSelectorEClass = createEClass(CHARACTERISTIC_TYPE_SELECTOR);
    createEReference(characteristicTypeSelectorEClass, CHARACTERISTIC_TYPE_SELECTOR__REF);
    createEAttribute(characteristicTypeSelectorEClass, CHARACTERISTIC_TYPE_SELECTOR__NEGATED);
    createEReference(characteristicTypeSelectorEClass, CHARACTERISTIC_TYPE_SELECTOR__LITERALS);

    includeEClass = createEClass(INCLUDE);
    createEAttribute(includeEClass, INCLUDE__IMPORT_URI);

    constraintEClass = createEClass(CONSTRAINT);
    createEAttribute(constraintEClass, CONSTRAINT__NAME);
    createEReference(constraintEClass, CONSTRAINT__RULE);

    ruleEClass = createEClass(RULE);
    createEReference(ruleEClass, RULE__DATA_SELECTORS);
    createEReference(ruleEClass, RULE__STATEMENT);
    createEReference(ruleEClass, RULE__DESTINATION_SELECTORS);

    dataSelectorEClass = createEClass(DATA_SELECTOR);

    attributeSelectorEClass = createEClass(ATTRIBUTE_SELECTOR);
    createEReference(attributeSelectorEClass, ATTRIBUTE_SELECTOR__REF);

    attributeClassSelectorEClass = createEClass(ATTRIBUTE_CLASS_SELECTOR);
    createEReference(attributeClassSelectorEClass, ATTRIBUTE_CLASS_SELECTOR__REF);

    destinationSelectorEClass = createEClass(DESTINATION_SELECTOR);

    propertySelectorEClass = createEClass(PROPERTY_SELECTOR);
    createEReference(propertySelectorEClass, PROPERTY_SELECTOR__REF);

    propertyClassSelectorEClass = createEClass(PROPERTY_CLASS_SELECTOR);
    createEReference(propertyClassSelectorEClass, PROPERTY_CLASS_SELECTOR__REF);

    nodeIdentitiySelectorEClass = createEClass(NODE_IDENTITIY_SELECTOR);
    createEAttribute(nodeIdentitiySelectorEClass, NODE_IDENTITIY_SELECTOR__NAME);
    createEReference(nodeIdentitiySelectorEClass, NODE_IDENTITIY_SELECTOR__ASSEMBLY);
    createEReference(nodeIdentitiySelectorEClass, NODE_IDENTITIY_SELECTOR__COMPONENT);
    createEReference(nodeIdentitiySelectorEClass, NODE_IDENTITIY_SELECTOR__SEFF);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__MODALITY);
    createEReference(statementEClass, STATEMENT__TYPE);

    statementTypeEClass = createEClass(STATEMENT_TYPE);
    createEAttribute(statementTypeEClass, STATEMENT_TYPE__NAME);

    statementModalityEClass = createEClass(STATEMENT_MODALITY);
    createEAttribute(statementModalityEClass, STATEMENT_MODALITY__NAME);

    // Create enums
    targetModelTypeEEnum = createEEnum(TARGET_MODEL_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    CharacteristicsPackage theCharacteristicsPackage = (CharacteristicsPackage)EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI);
    AllocationPackage theAllocationPackage = (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);
    UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
    RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
    SeffPackage theSeffPackage = (SeffPackage)EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    characteristicTypeEClass.getESuperTypes().add(this.getAbstractElement());
    characteristicClassEClass.getESuperTypes().add(this.getAbstractElement());
    includeEClass.getESuperTypes().add(this.getAbstractElement());
    constraintEClass.getESuperTypes().add(this.getAbstractElement());
    attributeSelectorEClass.getESuperTypes().add(this.getDataSelector());
    attributeClassSelectorEClass.getESuperTypes().add(this.getDataSelector());
    propertySelectorEClass.getESuperTypes().add(this.getDestinationSelector());
    propertyClassSelectorEClass.getESuperTypes().add(this.getDestinationSelector());
    nodeIdentitiySelectorEClass.getESuperTypes().add(this.getDestinationSelector());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_TargetModelType(), this.getTargetModelTypeDef(), null, "targetModelType", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(targetModelTypeDefEClass, TargetModelTypeDef.class, "TargetModelTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTargetModelTypeDef_Type(), this.getTargetModelType(), "type", null, 0, 1, TargetModelTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTargetModelTypeDef_TypeContainer(), theCharacteristicsPackage.getCharacteristicTypeContainer(), null, "typeContainer", null, 0, 1, TargetModelTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTargetModelTypeDef_AllocationModel(), theAllocationPackage.getAllocation(), null, "allocationModel", null, 0, 1, TargetModelTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTargetModelTypeDef_UsageModel(), theUsagemodelPackage.getUsageModel(), null, "usageModel", null, 0, 1, TargetModelTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(characteristicTypeEClass, CharacteristicType.class, "CharacteristicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCharacteristicType_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacteristicType_Ref(), theCharacteristicsPackage.getCharacteristicType(), null, "ref", null, 0, 1, CharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characteristicClassEClass, CharacteristicClass.class, "CharacteristicClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCharacteristicClass_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CharacteristicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacteristicClass_Members(), this.getCharacteristicTypeSelector(), null, "members", null, 0, -1, CharacteristicClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characteristicTypeSelectorEClass, CharacteristicTypeSelector.class, "CharacteristicTypeSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCharacteristicTypeSelector_Ref(), this.getCharacteristicType(), null, "ref", null, 0, 1, CharacteristicTypeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCharacteristicTypeSelector_Negated(), theEcorePackage.getEBoolean(), "negated", null, 0, 1, CharacteristicTypeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacteristicTypeSelector_Literals(), theCharacteristicsPackage.getEnumCharacteristicLiteral(), null, "literals", null, 0, -1, CharacteristicTypeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInclude_ImportURI(), theEcorePackage.getEString(), "importURI", null, 0, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstraint_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_Rule(), this.getRule(), null, "rule", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRule_DataSelectors(), this.getDataSelector(), null, "dataSelectors", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Statement(), this.getStatement(), null, "statement", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_DestinationSelectors(), this.getDestinationSelector(), null, "destinationSelectors", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataSelectorEClass, DataSelector.class, "DataSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeSelectorEClass, AttributeSelector.class, "AttributeSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeSelector_Ref(), this.getCharacteristicTypeSelector(), null, "ref", null, 0, 1, AttributeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeClassSelectorEClass, AttributeClassSelector.class, "AttributeClassSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeClassSelector_Ref(), this.getCharacteristicClass(), null, "ref", null, 0, 1, AttributeClassSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(destinationSelectorEClass, DestinationSelector.class, "DestinationSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertySelectorEClass, PropertySelector.class, "PropertySelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertySelector_Ref(), this.getCharacteristicTypeSelector(), null, "ref", null, 0, 1, PropertySelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyClassSelectorEClass, PropertyClassSelector.class, "PropertyClassSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyClassSelector_Ref(), this.getCharacteristicClass(), null, "ref", null, 0, 1, PropertyClassSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeIdentitiySelectorEClass, NodeIdentitiySelector.class, "NodeIdentitiySelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeIdentitiySelector_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NodeIdentitiySelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeIdentitiySelector_Assembly(), theCompositionPackage.getAssemblyContext(), null, "assembly", null, 0, 1, NodeIdentitiySelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeIdentitiySelector_Component(), theRepositoryPackage.getBasicComponent(), null, "component", null, 0, 1, NodeIdentitiySelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeIdentitiySelector_Seff(), theSeffPackage.getServiceEffectSpecification(), null, "seff", null, 0, 1, NodeIdentitiySelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatement_Modality(), this.getStatementModality(), null, "modality", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Type(), this.getStatementType(), null, "type", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementTypeEClass, StatementType.class, "StatementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatementType_Name(), theEcorePackage.getEString(), "name", null, 0, 1, StatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementModalityEClass, StatementModality.class, "StatementModality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatementModality_Name(), theEcorePackage.getEString(), "name", null, 0, 1, StatementModality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(targetModelTypeEEnum, TargetModelType.class, "TargetModelType");
    addEEnumLiteral(targetModelTypeEEnum, TargetModelType.OPERATION_MODEL);
    addEEnumLiteral(targetModelTypeEEnum, TargetModelType.DATA_CENTRIC_PALLADIO);
    addEEnumLiteral(targetModelTypeEEnum, TargetModelType.EXTENDED_DFD);

    // Create resource
    createResource(eNS_URI);
  }

} //DSLPackageImpl
