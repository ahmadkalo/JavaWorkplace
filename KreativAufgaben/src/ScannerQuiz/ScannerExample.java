package ScannerQuiz;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you guess my name?");
        String answer = scanner.nextLine();
        
        	if (answer.equalsIgnoreCase("Ahmed")) { 
        	System.out.println("not bad");

        	} else { 
            System.out.println("wrong bro");
          	}
        	
        	System.out.println("now i want you to do me a favor are you ready?");
           	String answer2 = scanner.nextLine();
        	
        	if (answer2.equals ("yes")) { 
                System.out.println("nice");
                
        	} else {
        		System.out.println("goodbye then");
                System.exit(0); 
        	}
        	
    
        	System.out.println("are you good at Math?");
           	String answer3 = scanner.nextLine();

           	if (answer3.equals ("yes") || answer3.equals("yes i am")) {
           		System.out.println("glad to hear that, now i will give a task");
           		System.out.println("what is the result of 2/2");
           		String Mathtask1 = scanner.nextLine();
           		if (Mathtask1.equals ("1")) {
           			System.out.println("you are goddamn right");
           		} else {
           			System.out.println("bro you are bad at math, let us switch to another question");
           			System.out.println("well, then will give you a text task");   
           			System.out.println("when ended world war 2?");
           			String TextTask1 = scanner.nextLine();
               	
               	if (TextTask1.equals("1945")) {
               		System.out.println("correct");
               		
               	} else {
               		System.out.println("wrong");   
               		}       	     
           		}
           	
           	} else {
            	System.out.println("well, then will give you a text task");   
       			System.out.println("when ended world war 2?");
       			String TextTask1 = scanner.nextLine();
       			
       			if (TextTask1.equals("1945")) {
               		System.out.println("correct");
               		
               	} else {
               		System.out.println("wrong");   
               	}
           	}
           	
           	System.out.println("now i will change the task\ni want you to pick one of those numbers");
           	for(int i = 0; i <= 15; i++)
           	System.out.println(i);
   			int MathTask2 = scanner.nextInt();
   			if (MathTask2 <= 15) {
   				
   	           	System.out.println("you passed the taks, so easly isnt it?");

   			} else { 
   				System.out.println("i said 1 - 15");
   			}
   			
   			scanner.close();

        
   				
   				
   				
   				
	}
}
