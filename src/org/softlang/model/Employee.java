package org.softlang.model;

import java.io.Serializable;

/**
 * An employee has a name, an address, and a salary. 
 */
public class Employee implements Serializable {

    private static final Double MIN_SALARY = 50.0; 

    private static final long serialVersionUID = -210889592677165250L;

    private /*@ spec_public non_null @*/ String name;
    private /*@ spec_public non_null @*/ String address;
    private /*@ spec_public @*/double salary;

    //@public invariant salary > 0; 

    public Employee() {
	name = "";
	address = "";
	salary = MIN_SALARY;
    }

    /*@
      @ requires pname != null && paddress != null && psalary > 0.0;
      @ ensures name == pname 
      @      && address == paddress
      @      && salary == psalary;
      @*/
    public Employee(String pname, String paddress, double psalary) {
	name = pname;
	address = pname;
	salary = psalary;
    }

    public /*@ pure @*/ String getName() {
	return name;
    }

    public /*@ pure @*/ String getAddress() {
	return address;
    }

    public /*@ pure @*/ double getSalary() {
	return salary;
    }

    /*@
      @ requires pname != null && !pname.trim().equals("");
      @*/
    public void setName(String pname) {
	this.name = pname;
    }

    /*@
      @ requires paddress != null && !paddress.trim().equals("");
      @*/
    public void setAddress(String paddress) {
	this.address = paddress;
    }
    
    /*@
      @ requires psalary > 0;
      @*/
    public void setSalary(double psalary) {
	this.salary = psalary;
    }

    /*@
      @ requires salary > 0;
      @ ensures \old(salary) == salary * 2;
      @*/
    public void cut() {
	setSalary(getSalary() / 2);
    }	
}