package DVL;

public class MainDVL {

	public static void main(String[] args) {

		DVL<Integer> myList = new DVL<Integer>();
		
		myList.insert(5);
		myList.insert(10);
		myList.insert(15);
		myList.insert(20);
		myList.insert(25);

		myList.append(1);

		System.out.println(myList);
		myList.swap(25, 15);
		System.out.println(myList);
		
		System.out.println("Aktuelle Liste: " + myList);

		System.out.println("Größe der Liste: " + myList.size());

		System.out.println("Ist die Liste leer? " + myList.isEmpty());

		System.out.println("Das erste Element: " + myList.getFirst());
		System.out.println("Das letzte Element: " + myList.getLast());

		System.out.println("Enthält die Liste die Zahl 10? " + (myList.contains(10) ? "Ja" : "Nein"));



		myList.removeFirst();
		myList.removeLast();
		myList.delete(20);

		System.out.println("Aktualisierte Liste nach dem Entfernen des ersten und letzten Elements: " + myList);

		System.out.println("Größe der Liste nach dem Entfernen: " + myList.size());

	}
}
