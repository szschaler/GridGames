/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage
 * @generated
 */
public class GridGameAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GridGamePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GridGameAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GridGamePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GridGameSwitch<Adapter> modelSwitch =
    new GridGameSwitch<Adapter>()
    {
      @Override
      public Adapter caseGridGame(GridGame object)
      {
        return createGridGameAdapter();
      }
      @Override
      public Adapter caseCellSpecification(CellSpecification object)
      {
        return createCellSpecificationAdapter();
      }
      @Override
      public Adapter caseCellMember(CellMember object)
      {
        return createCellMemberAdapter();
      }
      @Override
      public Adapter caseCellDisplaySpec(CellDisplaySpec object)
      {
        return createCellDisplaySpecAdapter();
      }
      @Override
      public Adapter caseVarSpec(VarSpec object)
      {
        return createVarSpecAdapter();
      }
      @Override
      public Adapter caseCellVarSpec(CellVarSpec object)
      {
        return createCellVarSpecAdapter();
      }
      @Override
      public Adapter caseGlobalCellStateSpec(GlobalCellStateSpec object)
      {
        return createGlobalCellStateSpecAdapter();
      }
      @Override
      public Adapter caseParamSpec(ParamSpec object)
      {
        return createParamSpecAdapter();
      }
      @Override
      public Adapter caseCellStateSpec(CellStateSpec object)
      {
        return createCellStateSpecAdapter();
      }
      @Override
      public Adapter caseLocalCellStateSpec(LocalCellStateSpec object)
      {
        return createLocalCellStateSpecAdapter();
      }
      @Override
      public Adapter caseCellStateSpecReference(CellStateSpecReference object)
      {
        return createCellStateSpecReferenceAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseIntValue(IntValue object)
      {
        return createIntValueAdapter();
      }
      @Override
      public Adapter caseVarRefValue(VarRefValue object)
      {
        return createVarRefValueAdapter();
      }
      @Override
      public Adapter caseCellState(CellState object)
      {
        return createCellStateAdapter();
      }
      @Override
      public Adapter caseTransitionSpec(TransitionSpec object)
      {
        return createTransitionSpecAdapter();
      }
      @Override
      public Adapter caseTransitionTriggerSpec(TransitionTriggerSpec object)
      {
        return createTransitionTriggerSpecAdapter();
      }
      @Override
      public Adapter caseMouseTrigger(MouseTrigger object)
      {
        return createMouseTriggerAdapter();
      }
      @Override
      public Adapter caseContextTrigger(ContextTrigger object)
      {
        return createContextTriggerAdapter();
      }
      @Override
      public Adapter caseCellStateBehaviour(CellStateBehaviour object)
      {
        return createCellStateBehaviourAdapter();
      }
      @Override
      public Adapter caseBehaviourReference(BehaviourReference object)
      {
        return createBehaviourReferenceAdapter();
      }
      @Override
      public Adapter caseDirectBehaviour(DirectBehaviour object)
      {
        return createDirectBehaviourAdapter();
      }
      @Override
      public Adapter caseEndGameBehaviour(EndGameBehaviour object)
      {
        return createEndGameBehaviourAdapter();
      }
      @Override
      public Adapter caseGlobalAction(GlobalAction object)
      {
        return createGlobalActionAdapter();
      }
      @Override
      public Adapter caseFieldSpecification(FieldSpecification object)
      {
        return createFieldSpecificationAdapter();
      }
      @Override
      public Adapter caseOptionSpecification(OptionSpecification object)
      {
        return createOptionSpecificationAdapter();
      }
      @Override
      public Adapter caseAllowRestartMenu(AllowRestartMenu object)
      {
        return createAllowRestartMenuAdapter();
      }
      @Override
      public Adapter caseStartFieldDeclaration(StartFieldDeclaration object)
      {
        return createStartFieldDeclarationAdapter();
      }
      @Override
      public Adapter caseGenerationalContexts(GenerationalContexts object)
      {
        return createGenerationalContextsAdapter();
      }
      @Override
      public Adapter caseGlobalFieldInitialisation(GlobalFieldInitialisation object)
      {
        return createGlobalFieldInitialisationAdapter();
      }
      @Override
      public Adapter caseFieldInitialisations(FieldInitialisations object)
      {
        return createFieldInitialisationsAdapter();
      }
      @Override
      public Adapter caseFieldInitialisationsRef(FieldInitialisationsRef object)
      {
        return createFieldInitialisationsRefAdapter();
      }
      @Override
      public Adapter caseLocalFieldInitialisations(LocalFieldInitialisations object)
      {
        return createLocalFieldInitialisationsAdapter();
      }
      @Override
      public Adapter caseFieldInitialisation(FieldInitialisation object)
      {
        return createFieldInitialisationAdapter();
      }
      @Override
      public Adapter caseDefaultInitialisation(DefaultInitialisation object)
      {
        return createDefaultInitialisationAdapter();
      }
      @Override
      public Adapter caseRandomInitialisation(RandomInitialisation object)
      {
        return createRandomInitialisationAdapter();
      }
      @Override
      public Adapter caseContextInitialisation(ContextInitialisation object)
      {
        return createContextInitialisationAdapter();
      }
      @Override
      public Adapter caseContextExpression(ContextExpression object)
      {
        return createContextExpressionAdapter();
      }
      @Override
      public Adapter caseAtomicExpression(AtomicExpression object)
      {
        return createAtomicExpressionAdapter();
      }
      @Override
      public Adapter caseFilterExpression(FilterExpression object)
      {
        return createFilterExpressionAdapter();
      }
      @Override
      public Adapter caseStateFilterExpression(StateFilterExpression object)
      {
        return createStateFilterExpressionAdapter();
      }
      @Override
      public Adapter caseCountExpression(CountExpression object)
      {
        return createCountExpressionAdapter();
      }
      @Override
      public Adapter caseNotEmptyExpression(NotEmptyExpression object)
      {
        return createNotEmptyExpressionAdapter();
      }
      @Override
      public Adapter caseEmptyExpression(EmptyExpression object)
      {
        return createEmptyExpressionAdapter();
      }
      @Override
      public Adapter caseNoOpBehaviour(NoOpBehaviour object)
      {
        return createNoOpBehaviourAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame <em>Grid Game</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame
   * @generated
   */
  public Adapter createGridGameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification <em>Cell Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification
   * @generated
   */
  public Adapter createCellSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellMember <em>Cell Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellMember
   * @generated
   */
  public Adapter createCellMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec <em>Cell Display Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec
   * @generated
   */
  public Adapter createCellDisplaySpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarSpec <em>Var Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarSpec
   * @generated
   */
  public Adapter createVarSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec <em>Cell Var Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec
   * @generated
   */
  public Adapter createCellVarSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec <em>Global Cell State Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec
   * @generated
   */
  public Adapter createGlobalCellStateSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec <em>Param Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec
   * @generated
   */
  public Adapter createParamSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpec <em>Cell State Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpec
   * @generated
   */
  public Adapter createCellStateSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec <em>Local Cell State Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec
   * @generated
   */
  public Adapter createLocalCellStateSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference <em>Cell State Spec Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference
   * @generated
   */
  public Adapter createCellStateSpecReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue
   * @generated
   */
  public Adapter createIntValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue <em>Var Ref Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue
   * @generated
   */
  public Adapter createVarRefValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState <em>Cell State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState
   * @generated
   */
  public Adapter createCellStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec <em>Transition Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec
   * @generated
   */
  public Adapter createTransitionSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionTriggerSpec <em>Transition Trigger Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionTriggerSpec
   * @generated
   */
  public Adapter createTransitionTriggerSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.MouseTrigger <em>Mouse Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.MouseTrigger
   * @generated
   */
  public Adapter createMouseTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger <em>Context Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger
   * @generated
   */
  public Adapter createContextTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateBehaviour <em>Cell State Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateBehaviour
   * @generated
   */
  public Adapter createCellStateBehaviourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.BehaviourReference <em>Behaviour Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.BehaviourReference
   * @generated
   */
  public Adapter createBehaviourReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.DirectBehaviour <em>Direct Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.DirectBehaviour
   * @generated
   */
  public Adapter createDirectBehaviourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.EndGameBehaviour <em>End Game Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.EndGameBehaviour
   * @generated
   */
  public Adapter createEndGameBehaviourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction <em>Global Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction
   * @generated
   */
  public Adapter createGlobalActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification <em>Field Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification
   * @generated
   */
  public Adapter createFieldSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.OptionSpecification <em>Option Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.OptionSpecification
   * @generated
   */
  public Adapter createOptionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.AllowRestartMenu <em>Allow Restart Menu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.AllowRestartMenu
   * @generated
   */
  public Adapter createAllowRestartMenuAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration <em>Start Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration
   * @generated
   */
  public Adapter createStartFieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GenerationalContexts <em>Generational Contexts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GenerationalContexts
   * @generated
   */
  public Adapter createGenerationalContextsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation <em>Global Field Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation
   * @generated
   */
  public Adapter createGlobalFieldInitialisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations <em>Field Initialisations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations
   * @generated
   */
  public Adapter createFieldInitialisationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisationsRef <em>Field Initialisations Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisationsRef
   * @generated
   */
  public Adapter createFieldInitialisationsRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalFieldInitialisations <em>Local Field Initialisations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalFieldInitialisations
   * @generated
   */
  public Adapter createLocalFieldInitialisationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation <em>Field Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation
   * @generated
   */
  public Adapter createFieldInitialisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation <em>Default Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation
   * @generated
   */
  public Adapter createDefaultInitialisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation <em>Random Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation
   * @generated
   */
  public Adapter createRandomInitialisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation <em>Context Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation
   * @generated
   */
  public Adapter createContextInitialisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression <em>Context Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression
   * @generated
   */
  public Adapter createContextExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.AtomicExpression <em>Atomic Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.AtomicExpression
   * @generated
   */
  public Adapter createAtomicExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression <em>Filter Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression
   * @generated
   */
  public Adapter createFilterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression <em>State Filter Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression
   * @generated
   */
  public Adapter createStateFilterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression <em>Count Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression
   * @generated
   */
  public Adapter createCountExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression <em>Not Empty Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression
   * @generated
   */
  public Adapter createNotEmptyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.EmptyExpression <em>Empty Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.EmptyExpression
   * @generated
   */
  public Adapter createEmptyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.NoOpBehaviour <em>No Op Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.NoOpBehaviour
   * @generated
   */
  public Adapter createNoOpBehaviourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GridGameAdapterFactory
