import java.util.Scanner;

public class leapYr {
    public static void main(String[] args) {
        int num;
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter year:");
        num= sc.nextInt();
        
        if (num%4==0 && num%100!=0 || num%400==0){
            System.out.print(" its a leap year");
        }else{
            System.out.println("its not a leap year");
        }
    }  
}
