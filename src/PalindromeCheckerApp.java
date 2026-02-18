import java.util.Scanner;
public class PalindromeCheckerApp {
    void show(){
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully");
    }
    boolean checkpalin(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sample=input.nextLine();
        String rev="";

        for (int i=sample.length()-1;i>=0;i--){
            rev+=sample.charAt(i);
        }
        return sample.equals(rev);
    }
    public static void main(String []args){
        PalindromeCheckerApp ob=new PalindromeCheckerApp();
        ob.show();
        System.out.println("Is it a Palindrome: " +ob.checkpalin());
    }
}

