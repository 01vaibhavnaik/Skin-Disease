
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int num;
        boolean b=true;
        System.out.println("enter no");
        Scanner sc=new Scanner(System.in);
        num= sc.nextInt();

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                b=false;
                System.out.println("not prime");
                break;
            }
        }
        if(b)
        System.out.println("prime");
    
    }
}
