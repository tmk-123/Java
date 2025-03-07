import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("*");
            }
        }

        input.close();
    }    
}
