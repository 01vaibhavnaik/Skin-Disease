
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ener yr name");
        String name=sc.next();
        Scanner s=new Scanner(System.in);
        System.out.println("enter Gender");
        char gender=s.next().charAt(0);
        Scanner sy=new Scanner(System.in);
        System.out.println("enter age");
        int age=sy.nextInt();
        Scanner sn=new Scanner(System.in);
        System.out.println("enter ph no");
        long phone=sn.nextLong();
        System.out.println("--------------------------------");
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Ph no:"+phone);

    }
       
}
