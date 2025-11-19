import java.util.ArrayList;
import java.util.List;

public class Blocksatzbildung {
    private static final int BLOCK_SIZE = 10;

    public static void main(String[] args) {
        int[] folge = {6, 2, 5, 2, 7, 7, 7, 4, 7, 9, 2, 9, 1, 5};
        List<int[]> result = optimalBlockung(folge, BLOCK_SIZE);
        
        // Ausgabe der Blöcke und der Gesamtbewertung
        int totalBewertung = 0;
        for (int[] block : result) {
            int blockSum = 0;
            for (int value : block) {
                System.out.print(value + " ");
                blockSum += value;
            }
            int abweichung = (BLOCK_SIZE - blockSum) * (BLOCK_SIZE - blockSum);
            totalBewertung += abweichung;
            System.out.println("(Summe: " + blockSum + ", Abweichung: " + abweichung + ")");
        }
        System.out.println("Gesamtbewertung: " + totalBewertung);
    }

    public static List<int[]> optimalBlockung(int[] folge, int blockSize) {
        int n = folge.length;
        List<int[]> blöcke = new ArrayList<>();
        int i = 0;
        
        while (i < n) {
            int blockSum = 0;
            List<Integer> currentBlock = new ArrayList<>();
            
            while (i < n && blockSum + folge[i] <= blockSize) {
                currentBlock.add(folge[i]);
                blockSum += folge[i];
                i++;
            }
            
            // Block zum Ergebnis hinzufügen
            blöcke.add(currentBlock.stream().mapToInt(Integer::intValue).toArray());
        }
        
        return blöcke;
    }
}
