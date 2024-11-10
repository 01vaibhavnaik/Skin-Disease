public class test2 {
    public static void main(String[] args) {
        

        int num[][]=new int[3][4];
        
        for(int i=0;i<3;i++){
            
            for(int j=0;j<4;j++){
               int random=(int)(Math.random()*100);
               System.out.print( " "+random);

              
            }
            System.out.println();
        }
        
    }
    
    
}
