package com.corejava;

public class Employee {
	private String name;
	private int sal;
	public Employee(){
	}
	public Employee(String name, int sal) {
		this.name=name;
		this.sal=sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	 @Override
	    public boolean equals(Object obj) {
	        if (obj == this)
	            return true;
	        if (!(obj instanceof Employee))
	            return false;
	        Employee employee = (Employee) obj;
	        return employee.getSal() == this.getSal()
	                && employee.getName() == this.getName();
	    }
	  @Override
     public int hashCode() {
         int result=17;
         result=31*result+sal;
         result=31*result+(name!=null ? name.hashCode():0);
         return result;
     }

}
