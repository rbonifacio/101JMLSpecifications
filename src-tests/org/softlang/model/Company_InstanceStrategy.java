/*
 * Test data strategy for org.softlang.model.Company.
 *
 * Generated by JMLUnitNG 1.3 (103), 2012-08-21 11:21 -0300.
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
 * Test data strategy for org.softlang.model.Company. Provides
 * instances of org.softlang.model.Company for testing, using
 * parameters from constructor tests.
 * 
 * @author JMLUnitNG 1.3 (103)
 * @version 2012-08-21 11:21 -0300
 */
public class Company_InstanceStrategy extends ObjectStrategy {
  /**
   * @return local-scope instances of Company.
   */
  public RepeatedAccessIterator<?> localValues() {
    return new ObjectArrayIterator<Object>
    (new Object[]
     { /* add org.softlang.model.Company values or generators here */ });
  }

  /**
   * @return default instances of Company, generated
   *  using constructor test parameters.
   */ 
  public RepeatedAccessIterator<org.softlang.model.Company> defaultValues() {
    final List<RepeatedAccessIterator<org.softlang.model.Company>> iters = 
      new LinkedList<RepeatedAccessIterator<org.softlang.model.Company>>();

    // an instantiation iterator for the default constructor
    // (if there isn't one, it will fail silently)
    iters.add(new InstantiationIterator<org.softlang.model.Company>
      (org.softlang.model.Company.class, 
       new Class<?>[0], 
       new ObjectArrayIterator<Object[]>(new Object[][]{{}})));

    return new NonNullMultiIterator<org.softlang.model.Company>(iters);
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
  public Company_InstanceStrategy() {
    super(org.softlang.model.Company.class);
    setReflective(false);
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}
