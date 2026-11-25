import java.util.Scanner;

class STRINGPALINDROME {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int left = 0, right = str.length()-1;
        while(left< right) {
            if(str.charAt(left) != str.charAt(right)) {
                System.out.println(str + " is not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println(str +" is a palindrome");
    }
}