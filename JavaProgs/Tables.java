
import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {
        String yn;
        do {
            System.out.println("Enter the no");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(+num + " x " + i + " = " + (num * i));
            }
            System.out.println("y for continue and n for no");
            yn = sc.next();
        } while (yn.equals("y") || yn.equals("Y"));
    }
}
