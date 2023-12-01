import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int loopCount = 1;
        Scanner scan = new Scanner(System.in);
        while(loopCount <= 10){
            System.out.println("Enter String " + loopCount);
            scan.nextLine();
            loopCount++;
        }
    }
}