package PersonException;


public class Person {
	
	private String name;
	private Person verheiratet;
	
	public Person(String name) {
		this.name = name;
		this.verheiratet = null; 
		
	}
	
	public String toString() {	
		return name;
	}
	
	public void schlafen() {
		System.out.println("Zzzzz");
	}
	
	public void heiraten(Person p) {
		
		if (p == null) {
			throw new IllegalArgumentException("Man kann nicht niemanden heiraten");
			
		}
		
		this.verheiratet = p;
		System.out.println(this + " ist nun mit " + p + " verheiratet.");
		
	}
	
	public void schlafen(Person p) throws Exception {
		if (this.verheiratet != null && p != this.verheiratet)  {  // Wir sind verheiratet und die Perosn die wir bekommen ist aber nicht die mit der wir verheiratet sind  
			throw new Exception(this + " hat mit " + p + " geschlafen.");			
		}
		System.out.println("...(Privatsphäre)");

	}
}
