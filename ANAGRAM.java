import java.util.Scanner;

class ANAGRAM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings to check anagrams or not: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length() != s2.length()) {
            System.out.println("Not anagrams");
            return;
        }
        int[] ch = new int[26];
        for(int i=0;i<s1.length();i++) {
            ch[s1.charAt(i) - 'a']++;
            ch[s2.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++) {
            if(ch[i] != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Strings are Anagrams");
    }
}