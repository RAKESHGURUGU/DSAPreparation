//Simple interest = (p*t*r)/100;
/*
    Ravi wanted to start a business and he was looking for a venture captalist,
    through his friend he met the owner of a construction company who is ready to invest in his emerging business,
    he took 'X' rupees for 'Y' period of time with 'r' % interest, while after the loan tenure is completed ravi returned 
    back to repay teh loan amount. The owner was very much impressed by the proper repayment and decided to give 2% discount on 
    interest, Now your task is to compute the final settlement amount that ravi need to pay.
*/

import java.util.Scanner;
class SIMPLE_INTEREST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int x = sc.nextInt();
        System.out.print("Enter the time period(in years): ");
        int y = sc.nextInt();
        System.out.print("Enter the interest rate: ");
        float r = sc.nextFloat();
        float i = (x*y*r)/100f;
        System.out.println("interest :"+ i);
        float total = x+i;
        System.out.println("Total amount to pay: "+total);
        float d = 0.02f*i;
        System.out.println("Discount received: "+d);
        total = total-d;
        System.out.println("Total amount to pay after received the discount: "+total);
    }
}