
public class Stack {

	int stack[]=new int[5];
	int count=0;
	int data;
	public void push(int data){
		stack[count]=data;
		count++;
	}
	public int pop(){
		count--;
		int top;
		top=stack[count];
		top=0;
		return top;
	}
	public int peek(){
		int data=stack[count];
		return data;
	}
	public void publish(){
		for(int n:stack){
		data=n;	
		System.out.println(n);
	}
	}
}
