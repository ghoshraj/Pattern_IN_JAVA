package pattern;

import java.util.Scanner;

public class Zigzag_Number_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            int x = ((i - 1) * n) + 1;
            if (i % 2 != 0){
                for (int j = 1; j <= n; j++){
                    System.out.print(x + " ");
                    x++;
                }
            }
            else {
                int y = n * i;
                for (int j = 1; j <= n; j++) {
                    System.out.print(y + " ");
                    y--;
                }
            }
            System.out.println();
        }
    }
}
