
import java.util.Scanner;

public class tst {
    public static void main(String[] args) {
        int n1,n2,res;
        String op;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter f num");
        n1=sc.nextInt();
        System.out.println("enter S num");
        n2=sc.nextInt();
        System.out.println("add or sub");
        op=sc.next();
        switch (op) {
            case "+":
                System.out.println(n1+n2);
                break;
                case "-":
                System.out.println(n1-n2);
                break;
                case "/":
                System.out.println(n1/n2);
                break;
           default:
           System.out.println("invalid");
        }
        

    }
    
    
}
