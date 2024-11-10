public class palindrome {
    public static void main(String[] args) {

        int no=12421;
        int tem=no;
        int rev=0,rem;

        while(tem!=0){
            rem=tem%10;
            rev=rev*10+rem;
            tem=tem/10;
        }
        if(no==rev){
            System.out.println("num is palindrome");
        }else{
            System.out.println("num is not a palindrome");
        }
    }
    
}
