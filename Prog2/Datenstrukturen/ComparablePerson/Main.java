package ComparablePerson;

import java.util.Arrays;
import java.util.Comparator;


public class Main {

   

    public static void main(String[] args) {

        Person[] family = new Person[] {
                new Person("Mandy", 30),
                new Person("Andy", 24),
                new Person("Candy", 12)
        };

        System.out.println("Vorher: " + Arrays.toString(family));

       

        
        bubbleSort(family, new Comparator<Person>() {

        	@Override
            public int compare(Person o1, Person o2) {
        		if(o1.getName().equals(o2.getName())) {
        			 return o1.getAlter() - o2.getAlter();
        		} else {
        			return 0;
        		}
				
               
            }
        });
        System.out.println("Nachher: " + Arrays.toString(family));
        
    }
    
    
    public static <T > void bubbleSort(T[] a, Comparator<T> c) {
        for (int n = a.length; n > 1; n--) {
            for (int i = 0; i < n - 1; i++) {
                if (c.compare(a[i], a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                }
            }
        }
    }
    
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



    public static void sort(Person[] people, Comparator<Person> comparator) {
        for (int i = people.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(people[j], people[j + 1]) > 0) {
                    // Dreieckstausch
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }
}