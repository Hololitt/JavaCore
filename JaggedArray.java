import java.util.Random;

public class JaggedArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] ar = new int[8][];
        for(int i = 0; i<ar.length;i++){
            ar[i] = new int[random.nextInt(0,100)];
            System.out.println(ar[i].length);
        }
        }
    }
