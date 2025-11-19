package FolgePaar;

import Paar.Paar;
import Person.Boxer;
import Person.Person;
import Person.Stud;


import Folge.Folge;
import Folge.FolgeAlsDynArray;

public class FolgePaar<T> {
	

	public static <T> Folge<Paar<T, T>> erzeugePaare(Folge<? extends T> a, Folge<? extends T> b) {
		if(a.size() != b.size()) throw new IllegalArgumentException("Folgen müssen gleich lang sein");
		Folge<Paar<T,T>> paare = new FolgeAlsDynArray<>();
		
		for(int i = 0; i< a.size(); i++) {
			Paar<T,T> paar = new Paar<>(a.get(i), b.get(i));
			paare.addLast(paar);
			 
		}
		
		return paare;
	}

	public static void main(String[] args) {
		
		// Mit Boxer und Student
		Folge<Boxer> boxers = new FolgeAlsDynArray<Boxer>();
		boxers.addLast(new Boxer("ben", 1990, 75.0));
		boxers.addLast(new Boxer("bob", 1992, 80.0));
		boxers.addLast(new Boxer("bibi", 1994, 65.0));

		Folge<Stud> students = new FolgeAlsDynArray<Stud>();
		students.addLast(new Stud("susi", 2000));
		students.addLast(new Stud("sam", 2001));
		students.addLast(new Stud("sepp", 2002));
		
		Folge<Paar<Person,Person>> paare = erzeugePaare(boxers,students);
		System.out.println(paare);
		
		
		// Mit Integer und String
		Folge<Integer> iFolge = new FolgeAlsDynArray<Integer>();
		iFolge.addFirst(42);

		Folge<String> sFolge = new FolgeAlsDynArray<String>();
		sFolge.addFirst("Telmaaaan");
		
		Folge<Paar<Object,Object>> oPaare = erzeugePaare(iFolge,sFolge);
		System.out.println(oPaare);
		
		
		
		
	}
}
