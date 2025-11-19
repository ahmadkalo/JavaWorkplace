package Fußballspieler;

public class Test {

	public static void main(String[] args) {
		
		   // Aktionen mit einem Torwart
		   Torwart horn = new Torwart("Timo Horn");
		   horn.gehaltBeziehen(3000000);
		   System.out.println(horn);
		   System.out.println(horn.halten());
		   System.out.println(horn.torSchiessen());

		    // Aktionen mit einem Feldspieler
		   Feldspieler modeste = new Feldspieler("Anthony Modeste");
		   modeste.gehaltBeziehen(5000000);
		   System.out.println(modeste);
		   System.out.println(modeste.torSchiessen());

		    }
		}
