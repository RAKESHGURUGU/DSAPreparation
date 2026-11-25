/*
    Doremon is very much interested in gardening and hence he planted more trees in his garden, 
    he planted the trees in a rectangle fashion in order of rows and columns, he numbered the trees 
    in a row wise order and planted the mango trees only in the first row, first column and last column.
    now the tree number , no.of rows and no.of columns will be given as your input. Now your task is to 
    find weather the given tree number is a mango tree or not.

    Sample i/p: 11
    5
    5
    Sample o/p: Yes it is a mango tree.
*/
import java.util.Scanner;
class DOREMON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tree number: ");
        int tn = sc.nextInt();
        System.out.print("Enter the no.of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the no.of columns: ");
        int c = sc.nextInt();
        if(tn > (r*c)) {
            System.out.println("Out of bounds");
            return;
        }if(tn<=c || tn%c==1 || tn%c == 0) {
            System.out.println("Yes it is a mango tree");
        } else {
            System.out.println("It is not a mango tree");
        }
    }
}