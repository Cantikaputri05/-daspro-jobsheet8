import java.util.Scanner;

public class Tugas105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n minimal 1.");
        } else {
            int total = 0;
            for (int i = 1; i <= n; i++) {          // rows
                for (int j = 1; j <= i; j++) {      // numbers in the row
                    if (j > 1) {
                        System.out.print(" ");
                    }
                    System.out.print(j);
                    total++;
                }
                System.out.println();
            }
            System.out.println("Total angka tercetak: " + total);
        }
        sc.close();
    }
}
