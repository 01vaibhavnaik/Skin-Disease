public class bitPyramid_2 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+(i+1));
            }
            System.out.println();
        }
    }
    
}
