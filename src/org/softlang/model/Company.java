package org.softlang.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * A company has a name and consists of (possibly nested) departments.
 */
public class Company implements Serializable {

    private static final long serialVersionUID = -200889592677165250L;

    private  /*@ spec_public non_null @*/ String name;
    private  /*@ spec_public non_null @*/ List<Department> depts = new LinkedList<Department>();

     //@ public invariant !name.trim().equals("");

    public Company() {
	this.name = "";
    }

    /*@
      @ requires pname != null;
      @*/
    public Company(String pname) {
	this.name = pname;
    }
    public /*@ pure @*/ String getName() {
	return name;
    }
    
    /*@
      @ requires pname != null;
      @ ensures name == pname;
      @*/
    public void setName(String pname) {
	this.name = pname;
    }

    public /*@ pure @*/ List<Department> getDepts() {
	return depts;
    }

    /*@
      @ requires depts != null;
      @ requires (\forall Department d;
      @           depts.contains(d);
      @           depts != d);
      @*/
    public void addDepartment(Department department) {
	depts.add(department);
    }
    
    public /*@ pure @*/ Double total() {
	double total = 0;
	for (Department d : getDepts())
	    total += d.total();
	return total;
    }	
    
    /*@
      @ requires depts != null;
      @ ensures \old(total()) == 2 * total();
      @*/
    public void cut() {
	for (Department d : getDepts())
	    d.cut();
    }	
}