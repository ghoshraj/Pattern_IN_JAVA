package pattern;

import java.util.Scanner;

public class Palindromic_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sp = n - 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= sp; j++){
                System.out.print("  ");
            }
            for (int j = i; j > 1; j--){
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            sp--;
        }
    }
}
