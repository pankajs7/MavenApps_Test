class A{
	
}
class B extends A{
	
}
public class DiffInstanceOfIsInstance {
public static void main(String[] args) throws ClassNotFoundException {
	A a=new A();
	B b=new B();
	
	System.out.println(a instanceof A);
	System.out.println(b instanceof A);
	System.out.println(Class.forName("A").isInstance(b));
	
	int x=4;
	int y=++x;
	int z=++x;
	System.out.println("y : "+y);
	System.out.println("z : "+z);
	System.out.println(x);
	
}
}
