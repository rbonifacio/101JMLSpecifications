/*
 * Test data strategy for org.softlang.model.Department.
 *
 * Generated by JMLUnitNG 1.3 (103), 2012-08-19 16:19 -0300.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

 
package org.softlang.model.Department_JML_Data;

import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;

/**
 * Test data strategy for org.softlang.model.Department. Provides
 * test values for parameter "Employee manager" 
 * of method "void setManager(Employee)". 
 * 
 * @author JMLUnitNG 1.3 (103)
 * @version 2012-08-19 16:19 -0300
 */
public class setManager__Employee_manager__19__manager
  extends ClassStrategy_org_softlang_model_Employee {
  /**
   * @return local-scope values for parameter 
   *  "Employee manager".
   */
  public RepeatedAccessIterator<?> localValues() {
  	return new ObjectArrayIterator<Object>
  	(new Object[]
  	 { /* add local-scope org.softlang.model.Employee values or generators here */ });
  }

  /**
   * Constructor.
   * The use of reflection can be controlled here for  
   * "Employee manager" of method "void setManager(Employee)" 
   * by changing the parameters to <code>setReflective</code>
   * and <code>setMaxRecursionDepth<code>.
   * In addition, the data generators used can be changed by adding 
   * additional data class lines, or by removing some of the automatically 
   * generated ones. Since this is the lowest level of strategy, the 
   * behavior will be exactly as you specify here if you clear the existing 
   * list of classes first.
   *
   * @see NonPrimitiveStrategy#addDataClass(Class<?>)
   * @see NonPrimitiveStrategy#clearDataClasses()
   * @see ObjectStrategy#setReflective(boolean)
   * @see ObjectStrategy#setMaxRecursionDepth(int)
   */
  public setManager__Employee_manager__19__manager() {
    super();
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}
