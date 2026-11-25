//Understanding if-else statements
//Donating blood
import java.util.Scanner;
class IF_ELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your weight: ");
        int weight = sc.nextInt();
        if(age>=18 && weight >= 60) {
            System.out.println("Your eligible to donate blood");
        } else {
            System.out.println("Your not eligible to donate blood");
        }
    }
}