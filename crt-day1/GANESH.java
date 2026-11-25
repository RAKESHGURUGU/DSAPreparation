import java.util.Scanner;
class GANESH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the shirt price, discount and shipping charges in Flipcart: ");
        int fp = sc.nextInt();
        float fd = sc.nextInt();
        float fs = sc.nextInt();
        System.out.print("Enter the shirt price, discount and shipping charges in Snapdeal: ");
        int sp = sc.nextInt();
        float sd = sc.nextInt();
        float ss = sc.nextInt(); 
        System.out.print("Enter the shirt price, discount and shipping charges in Amazon: ");
        int ap = sc.nextInt();
        float ad = sc.nextInt();
        float as = sc.nextInt(); 
        float ffp = fp-((fp*fd)/100f) + fs;
        float sfp = sp-((sp*sd)/100f) + ss;
        float afp = ap-((ap*ad)/100f) + as;
        System.out.println("In Flipcart Rs."+ffp);
        System.out.println("In Snapdeal Rs."+sfp);
        System.out.println("In Amazon Rs."+afp);
        if(ffp<=sfp && ffp<=afp) {
            System.out.print("Choose Flipcart");
        } else if(sfp<ffp && sfp<=afp) {
            System.out.print("Choose Snapdeal");
        } else if(afp<sfp && afp<=ffp) {
            System.out.print("Choose Amazon");
        }
    }
}