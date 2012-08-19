package org.softlang.model;

import java.io.Serializable;

/**
 * An employee has a name, an address, and a salary. 
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = -210889592677165250L;

    private /*@ spec_public  @*/String name;
    private String address;
    private /*@ spec_public @*/ double salary;

    //@ public invariant name != null && !name.equals("");
    //@ public invariant salary >= 0; 

    public Employee(String name, double salary) {
	if(name == null || name.trim().equals("")) {
	    this.name = "Foo";
	}
	this.salary = salary > 0 ? salary : 0.5; 
    }

    public String getName() {
	return name;
    }
    
    public void setName(String name) {
	this.name = name;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }
    
    public /*@ pure @*/ double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }

    /*@
      @ requires salary > 0.0;
      @ assignable salary;
      @ ensures salary == \old(salary) / 2;
      @*/
    public void cut() {
	setSalary(getSalary() / 2);
    }	
}