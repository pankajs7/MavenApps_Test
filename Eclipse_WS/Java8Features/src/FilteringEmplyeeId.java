import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Empl0yee {
	int empId;
	String ename;
	public Empl0yee(int empId,String name) {
		this.empId=empId;
		this.ename=ename;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
public class FilteringEmplyeeId {
public static void main(String[] args) {
	List<Empl0yee> list=new ArrayList<Empl0yee>();
	list.add(new Empl0yee(1000,"Pankaj"));
	list.add(new Empl0yee(1001,"Chandan"));
	list.add(new Empl0yee(1002,"Indra"));
	list.add(new Empl0yee(1003,"Priyanka"));
	list.add(new Empl0yee(1004,"Singh"));
	
	List empId=list.stream()
			   .map(Emp -> Emp.getEmpId())
			   .collect(Collectors.toList());
	System.out.println("Employee Id List :"+empId);
}
}
