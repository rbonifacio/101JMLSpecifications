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
 * test values for parameter "String name" 
 * of method "void setName(String)". 
 * 
 * @author JMLUnitNG 1.3 (103)
 * @version 2012-08-19 16:19 -0300
 */
public class setName__String_name__10__name
  extends ClassStrategy_java_lang_String {
  /**
   * @return local-scope values for parameter 
   *  "String name".
   */
  public RepeatedAccessIterator<?> localValues() {
  	return new ObjectArrayIterator<Object>
  	(new Object[]
  	 { /* add local-scope java.lang.String values or generators here */ });
  }
}
