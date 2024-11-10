
import java.util.Scanner;

class clac{
     int add(int a, int b){
        int sum=a+b;
        return sum;

    }
}
public class test {
    public static void main(String[] args) {
         
        System.out.println("enter the num");
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        clac cal= new clac();
        int calcu=cal.add(a,b);
        System.out.println(calcu);
    }
    
}
