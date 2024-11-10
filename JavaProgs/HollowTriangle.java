public class HollowTriangle {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<=5-i;j++){
                System.out.print(" ");
            }         
            for (int j=0;j<=i*2;j++) {
                if(j==0||j==i*2||i==4)
                
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    
}
