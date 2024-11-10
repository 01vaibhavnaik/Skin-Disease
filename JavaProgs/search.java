
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int[] a={2,3,4,5,6,8};
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        for(int i=0;i<a.length;i++){
        }
        
            for(int j=0;j<a.length;j++){
                if(a[j]==num){
                    System.out.println("num exits position at"+" "+(j+1));
                }
            }

    }    
}
