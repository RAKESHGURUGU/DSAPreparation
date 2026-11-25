import java.util.Scanner;

class REMOVEDUPLICATES {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int[] alpha = new int[26];
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            if(alpha[str.charAt(i) - 'a'] != -1) {
                res.append(str.charAt(i));
            }
            alpha[str.charAt(i) - 'a'] = -1;
        }
        System.out.println(res.toString());
    }
}