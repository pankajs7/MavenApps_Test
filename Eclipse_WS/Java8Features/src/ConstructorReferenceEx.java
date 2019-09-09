class Sample{
public Sample(){
	System.out.println("Sample 0-param constructor");
}
}
interface InterfConstructor{
	public Sample get();
}
public class ConstructorReferenceEx {
public static void main(String[] args) {
	InterfConstructor intr=Sample::new;
	Sample sample1=intr.get();
	Sample sample2=intr.get();
}
}
