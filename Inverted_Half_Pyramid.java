package pattern;

import java.util.Scanner;

public class Inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            int k = 1;
            for (int j = i; j <= n; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
