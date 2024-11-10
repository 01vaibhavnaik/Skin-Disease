
import java.util.Scanner;

        
    
public class AdvanceCal {
    
    public static void main(String[] args) {
        String yn;
        do { 
            int num1,num2;
            String op=" ";
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter f num");
            num1=sc.nextInt();
            System.out.println("enter op(+,-,*,/)");
            op=sc.next();
            System.out.println("enter s num");
            num2=sc.nextInt();
            int res;
            switch (op) {
                case "+":res=num1+num2;
                    System.out.println("Add:"+res);
                    break;
                
                case "-":res=num1-num2;
                    System.out.println("sub:"+res);
                    break;
                case "*":res=num1*num2;
                    System.out.println("mul:"+res);
                    break;
                case "/":res=num1/num2;
                    System.out.println("div:"+res);
                    break;
                default:
                System.out.println("invalid");
            }
            System.out.println("do u wnt to con if yes press y otherwise n");
            yn=sc.next();
        } while (yn.equals("y")||yn.equals("Y"));
   

    }
    
}
