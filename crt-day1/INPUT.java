//In this program we are going to explore importing and creating Scanner object to take input dynamically
//Question :
/*
    Each saturday Ramu sells 'a' copies of special edition newspapers for rupees 'b' per each copy,
    the printing cst of each news paper is rupees 'c'. He pays a fixed cost of rupees 100 for storage, 
    travel and so on. Now your task is to find the profit amount on every saturday.
*/

/* 
Sample i/p: 1000
            2
            1


Sample o/p: 900
*/

import java.util.Scanner;
class INPUT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of copies: ");
        int a = sc.nextInt();
        System.out.print("Enter the selling price of each paper: ");
        int b = sc.nextInt();
        System.out.print("Enter the printing cost of each paper: ");
        int c = sc.nextInt();
        int profit = (a*b) - (a*c) - 100;
        System.out.println("Profit: "+ profit);
    }
}