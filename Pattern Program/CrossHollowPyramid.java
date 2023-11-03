public class CrossHollowPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
        if(i!=1){
            for(int k=1;k<i-1;k++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        
            System.out.println();

        }
        int m=5;
         for(int j=1;j<m;j++){
            for(int k=1;k<j+1;k++){
                System.out.print(" ");
            }
            
        if(j!=m-1){
            System.out.print("*");
            for(int k=1;k<m-j-1;k++){
                System.out.print(" ");
            }    
        }
        System.out.print("*");
            System.out.println();
    }
}
}