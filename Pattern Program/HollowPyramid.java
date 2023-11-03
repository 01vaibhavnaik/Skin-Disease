
public class HollowPyramid {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if(n==i){
                for(int j=1;j<=n;j++){
                    System.out.print("*"); 
                }
            }
            else{
                System.out.print("*");
            }
            if(n!=i){
                for(int k=1;k<=i-1;k++){
                    System.out.print(" "); 
                }
            }  
            
            if(n!=i){
                 for(int k=1;k<=i-1;k++){
                    System.out.print(" "); 
                }
                
            }
            
            if(n==i){
                for(int j=1;j<=i-1;j++){
                    System.out.print("*"); 
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
 
    }



        


    



