package Person;

public class Person {

	 String name;
	 int geburtsjahr;
	
	public Person(String name, int geburtsjahr) {
		
		this.name = name;
		this.geburtsjahr = geburtsjahr;
	}

	public String getName() {
		return name;
	}


	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	
	@Override
	public String toString() {
		return this.name + " " + " (" +  this.geburtsjahr + ") ";
	}



	@Override
	  public boolean equals(Object obj) {
        return obj instanceof Person && name.equals(((Person) obj).name) && geburtsjahr == ((Person) obj).geburtsjahr;
    }
	

}

	
