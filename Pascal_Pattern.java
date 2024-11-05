package pattern;

import java.util.Scanner;

public class Pascal_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n - 1;
        int number;
        for(int i = 0; i < n; i++){
            for (int j = 1; j <= sp; j++){
                System.out.print(" ");
            }
            number = 1;
            for (int j = 0; j <= i; j++){
                System.out.print(number + " ");
                number = number * (i-j)/(j+1);
            }
            sp--;
            System.out.println();
        }
    }
}
