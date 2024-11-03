import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if(i == j || i + j == number - 1){
                    System.out.print(" " + "X" + " ");
                }else {
                    System.out.print("    ");
                }

            }
            System.out.println(" ");
        }
    }
}
