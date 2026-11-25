import java.util.Scanner;
class ELECTRICITY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of units you consumed: ");
        int units = sc.nextInt();
        if(units<=200) {
            System.out.println("Total charge: " + units*0.50);
        } else if(units <= 400) {
            System.out.println("Total charge: " + units*0.65 + 100);
        } else if(units <= 600) {
            System.out.println("Total charge: " + units*0.80 + 200);
        } else {
            System.out.println("Total charge: " + units*1.25 + 425);
        }
    }
}