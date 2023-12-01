import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        int loopCount = 1;
        int smallest = Integer.MAX_VALUE;
        Scanner scan = new Scanner(System.in);
        while(loopCount <= 10){
            int x = scan.nextInt();
             if (x < smallest) smallest = x;
            loopCount++;
        }
        System.out.println("smallest val " + smallest);
    }
}