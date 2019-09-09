import java.util.ArrayList;
import java.util.List;

class Employee{
	private String name;
	private int age;
	private int salary;
	public Employee(){
		
	}
	public Employee(String name,int age, int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String toString(){
		return name+" "+age+" "+salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int compareTo(Object obj){
		Employee e2=(Employee)obj;
		Integer sal2=e2.getSalary();
		Integer sal1=this.salary;
		return sal1.compareTo(sal2);
	}
	public int compare(Object obj1,Object obj2){
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		if(e1.salary>e2.salary)
			return 1;
		else if(e1.salary<e2.salary)
			return -1;
		else 
			return 0;
	}
}
public class MaxMinOfCustomize {
public static void main(String[] args) {
	Employee e1=new Employee("P",30,10045);
	Employee e2=new Employee("Pa",31,1001);
	Employee e3=new Employee("Pan",32,900000);
	Employee e4=new Employee("Pank",33,100);
	Employee e5=new Employee("Pankaj",34,1000);
	List list=new ArrayList();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	list.add(e5);
	
	//Employee emp=(Employee) list.stream().max((E1,E2)->{return ((Employee) E1).compareTo(E2);}).get();
	//list.stream().min((N1,N2)->{Employee em1=(Employee)N1;int sal1=()};)
	
	System.out.println(list);
	//System.out.println(emp);
	
	
}
}
