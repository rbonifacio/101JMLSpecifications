package org.softlang.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * A company has a name and consists of (possibly nested) departments.
 */
public class Company implements Serializable {

    private static final long serialVersionUID = -200889592677165250L;

    private String name;
    private List<Department> depts = new LinkedList<Department>();

    public Company() {
	this.name = "";
    }

    public Company(String pname) {
	this.name = pname;
    }
    public String getName() {
	return name;
    }
    
    public void setName(String pname) {
	this.name = pname;
    }

    public List<Department> getDepts() {
	return depts;
    }

    public void addDepartment(Department department) {
	depts.add(department);
    }
    
    public Double total() {
	double total = 0;
	for (Department d : getDepts())
	    total += d.total();
	return total;
    }	
    
    public void cut() {
	for (Department d : getDepts())
	    d.cut();
    }	
}