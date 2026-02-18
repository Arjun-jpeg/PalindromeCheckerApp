import java.util.Scanner;
public class PalindromeCheckerApp {

    void show(){
        System.out.println("Welcome to Palindrome Checker Management System");

        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully");
    }

    public static void main(String []args){
        PalindromeCheckerApp ob=new PalindromeCheckerApp();
        ob.show();



    boolean checkpalin(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sample=input.nextLine();
        boolean ispalin=true;

        for (int i=0;i<sample.length();i++){
            if(sample.charAt(i)!=sample.charAt(sample.length()-1-i)){
                ispalin=false;
            }
        }
        return ispalin;
    }
    public static void main(String []args){
        PalindromeCheckerApp ob=new PalindromeCheckerApp();
        System.out.println("Is it a Palindrome: " +ob.checkpalin());

    }
}

