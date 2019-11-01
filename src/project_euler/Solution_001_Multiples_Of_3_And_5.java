package project_euler;

import java.util.Scanner;

public class Solution_001_Multiples_Of_3_And_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong()-1;
            System.out.println((n-n%3)*(n/3+1)/2 + (n-n%5)*(n/5+1)/2 - (n-n%15)*(n/15+1)/2);
        }
    }
}
