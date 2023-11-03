public class Practice {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){   
           if(i!=1){

                for(int j=1;j<=i-1;j++)
                    System.out.print(" ");
                

                System.out.print("*");

                for(int k=1;k<=2*n-2*i;k++)
                    System.out.print(" ");

                System.out.print("*");
           
            }
            else{
                 for(int j=1;j<=2*n;j++)
                     System.out.print("*");     
            }                  
            System.out.println();
        }
}
    

}