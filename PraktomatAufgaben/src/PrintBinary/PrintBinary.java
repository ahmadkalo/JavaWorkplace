package PrintBinary;
public class PrintBinary {
	
    public static void main(String[] args) {
		
        for (int i = 0; i < 256; i++) {
			
            String binaryString = Integer.toBinaryString(i);
            int decimal = Integer.parseInt(binaryString, 2);
			
	
            System.out.println("Dec:"+ binaryString + "-> Bin: " + decimal);
        }
    }
}
