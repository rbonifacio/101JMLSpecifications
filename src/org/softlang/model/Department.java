package org.softlang.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * A department has a name, a manager, employees, and subdepartments.
 */
public class Department implements Serializable {

    private static final long serialVersionUID = -2008895922177165250L;
	
    private /*@ spec_public non_null @*/ String name;
    private /*@ spec_public non_null @*/ Employee manager;
    private /*@ spec_public non_null @*/ List<Department> subdepts = new LinkedList<Department>();
    private /*@ spec_public non_null @*/ List<Employee> employees = new LinkedList<Employee>();

    //@ public invariant !name.trim().equals("");
    
    public Department() {
	name = "";
	manager = new Employee();
    }

    /*@
      @ requires pname != null;
      @ requires pmanager != null;
      @ ensures name == pname;
      @ ensures pmanager == manager;
      @*/
    public Department(String pname, Employee pmanager) {
	this.name = pname;
	this.manager = pmanager;
    }
 
    public /*@ pure @*/ String getName() {
	return name;
    }

    /*@
      @ ensures pname != null && !pname.trim().equals("");
      @*/
    public void setName(String pname) {
	this.name = pname;
    }
    
    public /*@ pure @*/ Employee getManager() {
	return manager;
    }

    /*@
      @ ensures pmanager != null;
      @*/
    public void setManager(Employee pmanager) {
	this.manager = pmanager;
    }

    public /*@ pure @*/ List<Department> getSubdepts() {
	return subdepts;
    }

    public /*@ pure @*/ List<Employee> getEmployees() {
	return employees;
    }
 
    /*@
      @ requires department != null; 
      @ requires (\forall Department d;
      @                   subdepts.contains(d);
      @                   department != d);
      @*/
    public void addDept(Department department) {
	subdepts.add(department);
    }

    /*@ requires manager != null && employee != null;
      @ requires manager.getSalary() > employee.getSalary();
      @ requires (\forall Employee e;
      @                   employees.contains(e);
      @                   employee != e);
      @*/
    public void addEmployee(Employee employee) {
	employees.add(employee);
    }

    public /*@ pure @*/ double total() {
	double total = 0;
	total += getManager().getSalary();
	for (Department s : getSubdepts())
	    total += s.total();
	for (Employee e : getEmployees())
	    total += e.getSalary();
	return total;		
    }	
    
    /*@
      @ requires manager != null && subdepts != null && employees != null;
      @ ensures \old(total()) == 2 * total();
      @*/
    public void cut() {
	getManager().cut();
	for (Department s : getSubdepts())
	    s.cut();
	for (Employee e : getEmployees())
	    e.cut();
    }	
}