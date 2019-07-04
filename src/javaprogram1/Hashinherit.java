package javaprogram1;

class Hashinherit {

	
	int roll;
	int salary;
   String name2;
   
   
   
   
   
public Hashinherit(int roll, int salary, String name2) {
	   
	super();
	this.roll=roll;
	   this.salary=salary;
	   this.name2=name2;
	   //System.out.println(roll +salary+name2);
	  
}





@Override
public String toString() {
	return "Hashinherit [roll=" + roll + ", salary=" + salary + ", name2=" + name2 + "]";
}





public int getRoll() {
	return roll;
}





public void setRoll(int roll) {
	this.roll = roll;
}





public int getSalary() {
	return salary;
}





public void setSalary(int salary) {
	this.salary = salary;
}





public String getName2() {
	return name2;
}





public void setName2(String name2) {
	this.name2 = name2;
}





}
