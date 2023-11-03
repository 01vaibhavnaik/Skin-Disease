import java.util.Scanner;

public class GreaterNumber {
 public static int Greater( int a,int b){
    int ans ;
   if(a>b){
        ans=a;
    }    
    else
    { 
        ans=b;
    }
    return ans;
 }
 
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=Greater(a, b);
        System.out.println("the 2 greater num are: "+ans);
    }
         
      }
 

