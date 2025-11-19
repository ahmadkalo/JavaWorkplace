package Person;

public class PersonMain {
	
	public static void main(String[] args) {
		
		
		
		Stud Ahmed = new Stud("Ahmed", 1999);
		Boxer Ben = new Boxer("Ben", 2002, 88.5);
		Stud Anna = new Stud("Ahmed", 1999);
		Boxer sarah = new Boxer("Sarah", 2002, 100.1);
		
		if(Ahmed.equals(Anna)) {
			System.out.println("gleich");
		}else {
				System.out.println("nicht gleich");
			}
		
		System.out.println(Ahmed);
		System.out.println(Ben);
		System.out.println(Anna);
		System.out.println(sarah);
	}
	
	

}
