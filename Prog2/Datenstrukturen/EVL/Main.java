package EVL;

public class Main {


	public static void main(String[] args) {
		// Erstelle eine Instanz der EVL-Klasse für Integer
		EVL<Integer> myList = new EVL<Integer>();


		myList.insert(5);
		myList.insert(10);
		myList.insert(15);
		myList.insert(20);
		myList.insert(25);
		myList.append(0);
	
		// Drucke die Liste aus
		System.out.println("Aktuelle Liste: " + myList);

		// Überprüfe die Größe der Liste
		System.out.println("Größe der Liste: " + myList.size());

		// Überprüfe, ob die Liste leer ist
		System.out.println("Ist die Liste leer? " + myList.isEmpty());

		System.out.println("Das erste Element: " + myList.getFirst());
		System.out.println("Das letzte Element: " + myList.getLast());

		// Überprüfe, ob ein bestimmtes Element in der Liste enthalten ist
		System.out.println("Enthält die Liste die Zahl 10? " + myList.contains(10));

		// Entferne das erste Element aus der Liste
		myList.removeFirst();
		myList.removeLast();
		myList.delete(15);

		// Drucke die aktualisierte Liste aus
		System.out.println("Aktualisierte Liste nach dem Entfernen des ersten und letzten Elements: " + myList);

		// Überprüfe die Größe der Liste erneut
		System.out.println("Größe der Liste nach dem Entfernen: " + myList.size());

	}
}
