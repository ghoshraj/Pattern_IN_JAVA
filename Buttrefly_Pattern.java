package pattern;

import java.util.Scanner;

public class Buttrefly_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sp = (n * 2)-2;
        int st = 1;
        for (int i = 1; i <= n * 2; i++){
            for (int j = 1; j <= st; j++){
                System.out.print("* ");
            }
            for (int j = 1; j <= sp; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= st; j++){
                System.out.print("* ");
            }
            System.out.println();
            if (i == n)
                continue;
            if (i > n){
                sp+=2;
                st--;
            }
            else {
                st++;
                sp -= 2;
            }
        }
    }
}
