package JC;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fac(6));
    }
    static int fac(int n){
        if(n == 1)
            return 1;

            return n * fac(n - 1);

    }
}
