/*
 * Test data strategy for org.softlang.model.Employee.
 *
 * Generated by JMLUnitNG 1.3 (103), 2012-08-21 11:25 -0300.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

 
package org.softlang.model.Employee_JML_Data;

import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;

/**
 * Test data strategy for org.softlang.model.Employee. Provides
 * test values for parameter "String paddress" 
 * of method "Employee(String, String, double)". 
 * 
 * @author JMLUnitNG 1.3 (103)
 * @version 2012-08-21 11:25 -0300
 */
public class Employee__String_pname__String_paddress__double_psalary__20__paddress
  extends ClassStrategy_java_lang_String {
  /**
   * @return local-scope values for parameter 
   *  "String paddress".
   */
  public RepeatedAccessIterator<?> localValues() {
  	return new ObjectArrayIterator<Object>
  	(new Object[]
  	 { /* add local-scope java.lang.String values or generators here */ });
  }
}