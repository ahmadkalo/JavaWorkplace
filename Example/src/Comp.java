import java.util.Comparator;

public class Comp {
	

	public static void main(String[] args) {

		Student1[] people = {new Student1(23, "Ahmed"), new Student1(15, "Delyar"), new Student1(12, "Telman"), new Student1(21, "Lava")};
		
		Comparator<Student1> com = new Comparator<>() {

			@Override
			public int compare(Student1 o1, Student1 o2) {
				
				return o1.alter % 10 > o2.alter % 10 ? 1 : -1;
			}
			
		};

		sort(people, com);
		
		for(Student1 i : people) {
			System.out.println(i);
		}

	
	}
	
	
	public static void sort(Student1[] people, Comparator<Student1> comparator) {
        for (int i = people.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(people[j], people[j + 1]) > 0) {
                    // Dreieckstausch
                	Student1 temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

}