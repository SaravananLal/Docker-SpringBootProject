package com.mycomp.firstapp.api.dto;

import java.util.Objects;

public class Customer {
   private int id;
   private String name;
   private String dept;
   private String desg;
   private double sal;
public Customer() {
	super();
	
}
public Customer(int id, String name, String dept, String desg, double sal) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.desg = desg;
	this.sal = sal;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", dept=" + dept + ", desg=" + desg + ", sal=" + sal + "]";
}
@Override
public int hashCode() {
	return Objects.hash(dept, desg, id, name, sal);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	return Objects.equals(dept, other.dept) && Objects.equals(desg, other.desg) && id == other.id
			&& Objects.equals(name, other.name) && Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
}


   
}
