
public class MyClass {

	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void printme(int x){
		for(int i = 0; i < x; i++){
			System.out.println("i = " + i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		MyClass obj = new MyClass();
		obj.printme(19);
	}

}
