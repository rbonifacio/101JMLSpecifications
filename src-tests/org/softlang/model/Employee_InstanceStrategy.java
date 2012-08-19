/*
 * Test data strategy for org.softlang.model.Employee.
 *
 * Generated by JMLUnitNG 1.3 (103), 2012-08-19 16:01 -0300.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

package org.softlang.model;

import java.util.LinkedList;
import java.util.List;

import org.jmlspecs.jmlunitng.iterator.InstantiationIterator;
import org.jmlspecs.jmlunitng.iterator.IteratorAdapter;
import org.jmlspecs.jmlunitng.iterator.NonNullMultiIterator;
import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;
import org.jmlspecs.jmlunitng.strategy.ObjectStrategy;

/**
 * Test data strategy for org.softlang.model.Employee. Provides
 * instances of org.softlang.model.Employee for testing, using
 * parameters from constructor tests.
 * 
 * @author JMLUnitNG 1.3 (103)
 * @version 2012-08-19 16:01 -0300
 */
public class Employee_InstanceStrategy extends ObjectStrategy {
  /**
   * @return local-scope instances of Employee.
   */
  public RepeatedAccessIterator<?> localValues() {
    return new ObjectArrayIterator<Object>
    (new Object[]
     { /* add org.softlang.model.Employee values or generators here */ });
  }

  /**
   * @return default instances of Employee, generated
   *  using constructor test parameters.
   */ 
  public RepeatedAccessIterator<org.softlang.model.Employee> defaultValues() {
    final List<RepeatedAccessIterator<org.softlang.model.Employee>> iters = 
      new LinkedList<RepeatedAccessIterator<org.softlang.model.Employee>>();

    // an instantiation iterator for the default constructor
    // (if there isn't one, it will fail silently)
    iters.add(new InstantiationIterator<org.softlang.model.Employee>
      (org.softlang.model.Employee.class, 
       new Class<?>[0], 
       new ObjectArrayIterator<Object[]>(new Object[][]{{}})));

    return new NonNullMultiIterator<org.softlang.model.Employee>(iters);
  }

  /**
   * Constructor. The boolean parameter to <code>setReflective</code>
   * determines whether or not reflection will be used to generate
   * test objects, and the int parameter to <code>setMaxRecursionDepth</code>
   * determines how many levels reflective generation of self-referential classes
   * will recurse.
   *
   * @see ObjectStrategy#setReflective(boolean)
   * @see ObjectStrategy#setMaxRecursionDepth(int)
   */
  public Employee_InstanceStrategy() {
    super(org.softlang.model.Employee.class);
    setReflective(false);
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}
