/*
 * Test data strategy for org.softlang.model.Company.
 *
 * Generated by JMLUnitNG 1.3 (103), 2012-08-21 11:21 -0300.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

 
package org.softlang.model.Company_JML_Data;

import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;

/**
 * Test data strategy for org.softlang.model.Company. Provides
 * test values for parameter "Department department" 
 * of method "void addDepartment(Department)". 
 * 
 * @author JMLUnitNG 1.3 (103)
 * @version 2012-08-21 11:21 -0300
 */
public class addDepartment__Department_department__19__department
  extends ClassStrategy_org_softlang_model_Department {
  /**
   * @return local-scope values for parameter 
   *  "Department department".
   */
  public RepeatedAccessIterator<?> localValues() {
  	return new ObjectArrayIterator<Object>
  	(new Object[]
  	 { /* add local-scope org.softlang.model.Department values or generators here */ });
  }

  /**
   * Constructor.
   * The use of reflection can be controlled here for  
   * "Department department" of method "void addDepartment(Department)" 
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
  public addDepartment__Department_department__19__department() {
    super();
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}
