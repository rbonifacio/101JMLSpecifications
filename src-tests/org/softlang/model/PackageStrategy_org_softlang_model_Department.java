/*
 * Test data strategy for package org.softlang.model.
 *
 * Generated by JMLUnitNG 1.3 (103), 2012-08-21 11:21 -0300.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

 package org.softlang.model;

import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;
import org.jmlspecs.jmlunitng.strategy.ObjectStrategy;

/**
 * Test data strategy for package org.softlang.model. Provides
 * package-scope test values for type org.softlang.model.Department.
 * 
 * @author JMLUnitNG 1.3 (103)
 * @version 2012-08-21 11:21 -0300
 */
public class PackageStrategy_org_softlang_model_Department 
  extends ObjectStrategy {
  /**
   * @return package-scope values for type org.softlang.model.Department.
   */
  public RepeatedAccessIterator<?> packageValues() {
    return new ObjectArrayIterator<Object>
    (new Object[] 
     { /* add package-scope org.softlang.model.Department values or generators here */ });
  }

  /**
   * Constructor. 
   * The use of reflection can be controlled here for method 
   * parameters of type org.softlang.model.Department
   * in this package by changing the parameters to <code>setReflective</code>
   * and <code>setMaxRecursionDepth<code>.
   * In addition, the data generators used can be changed by adding 
   * additional data class lines, or by removing some of the automatically 
   * generated ones. Note that lower-level strategies can override any 
   * behavior specified here by calling the same control methods in 
   * their own constructors.
   *
   * @see NonPrimitiveStrategy#addDataClass(Class<?>)
   * @see NonPrimitiveStrategy#clearDataClasses()
   * @see ObjectStrategy#setReflective(boolean)
   * @see ObjectStrategy#setMaxRecursionDepth(int)
   */
  public PackageStrategy_org_softlang_model_Department() {
    super(org.softlang.model.Department.class);
    setReflective(false);
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}
