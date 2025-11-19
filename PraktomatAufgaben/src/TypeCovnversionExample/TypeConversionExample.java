package TypeCovnversionExample;
public class TypeConversionExample {
	
    public static void main(String[] args) {
        for (int i = 10; i <= 200; i += 20) {
            int intValue = i;
            byte byteValue = (byte) i;
            float floatValue = (float) i;

            System.out.println("Int Value: " + intValue);
            System.out.println("Byte Value: " + byteValue);
            System.out.println("Float Value: " + floatValue);
            System.out.println("-----------------------");
        }
    }
}
