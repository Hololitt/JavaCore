import java.util.Random;

public class Training40 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws InterruptedException {
        String[] ar = {ANSI_BLACK, ANSI_RED, ANSI_CYAN, ANSI_BLUE, ANSI_YELLOW, ANSI_GREEN,
                       ANSI_WHITE, ANSI_PURPLE};
        Random random = new Random();
        while(true){
            Thread.sleep(400);
            System.out.println(ar[random.nextInt(0,ar.length)] + "Hi!" + ANSI_RESET);
        }
        }
    }
