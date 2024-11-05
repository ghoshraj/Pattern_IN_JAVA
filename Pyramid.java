package pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sp = n - 1;
        for (int i = 1 ; i <= n; i++){
            for (int j = 1; j <= sp; j++){
                System.out.print("  ");
            }
            for (int j = 1 ; j <= i; j++){
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
            sp--;
        }
    }
}
