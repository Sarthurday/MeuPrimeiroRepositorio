import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Objective of exercise:
        // Ask user about how many lines and columns he/she want to the program do.
        // Print the matrix
        // Use integer numbers
        Scanner scanner = new Scanner(System.in);

        int L, C;

        System.out.println("How many lines do you want for your matrix?");
        L = scanner.nextInt();

        System.out.println("How many columns do you want for your matrix?");
        C = scanner.nextInt();

        int[][] mat = new int[L][C];

        for (int i = 0; i < L; i++){
            for (int j = 0; j < C; j++){
                System.out.println("Typed element: " + " [ " + i  +  j + " ] : ");
                mat[i][j] = scanner.nextInt();

            }
        } for (int i = 0; i < L; i++){
            for (int j = 0; j < C; j++){
              System.out.println(mat[i][j]);
            }
            System.out.println();
        }



    }
}
