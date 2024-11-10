import java.util.Scanner;

class GreatLess{
    int GreaterLesser(int a,int b){
        if (a<b)
            return a ;
        else
            return b;

    }
 
}
public class test1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("print first num:");
        a= sc.nextInt();
        System.out.print("print second num:");
        b= sc.nextInt();

        GreatLess obj= new GreatLess();
        int ans =obj.GreaterLesser(a,b);
        System.out.println(ans);

    }
    
}
