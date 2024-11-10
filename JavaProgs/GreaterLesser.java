import java.util.Scanner;

public class GreaterLesser {

    public static void main(String[] args) {
        int x,y;
         Scanner sc=new Scanner(System.in);
        System.out.print("print first num:");
        x= sc.nextInt();
        System.out.print("print second num:");
        y= sc.nextInt();
        if (x>y){
            System.out.print("greater num is :" +x);
        }else{
            System.out.println("greater num is :"  +y);
        }
    }
    
}
