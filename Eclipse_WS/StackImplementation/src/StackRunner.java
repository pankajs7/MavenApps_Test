
public class StackRunner {
public static void main(String[] args) {
	Stack stack=new Stack();
	stack.push(5);
	stack.push(10);
	stack.push(7);
	stack.publish();
System.out.println("Pop : "+stack.pop());
stack.publish();
System.out.println("stack peek "+stack.peek());
}
}
