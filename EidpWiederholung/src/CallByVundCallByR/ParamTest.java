package CallByVundCallByR;

public class ParamTest {
    public static void main(String[] args) {
        double[] feld1 = {1.1, 2.2, 3.3};
        double[] feld2 = feld1;
        int a = 0;
        set(feld1, a, 47.11);
        System.out.println("a = " + a);
        System.out.print("feld1[a] = ");
        show(feld1);
        System.out.print("feld2[a] = ");
        show(feld2);
    }

    public static void set(double[] f, int pos, double x) {
        f[pos] = x;
        pos++;
        System.out.println("pos = " + pos);
    }

    public static void show(double[] f) {
        for (int i = 0; i < f.length; i++) {
        	if(f[i] == f[f.length -1] ) {
        		 System.out.print(f[i]);	
        	} else  {
        		
        	
            System.out.print(f[i] + ", ");
        	}
        }
        	
        System.out.println();
    }
}
