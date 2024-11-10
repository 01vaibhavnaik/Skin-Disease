public class diamond {
    public static void main(String[] args) {
        int no=3,num=4;
        for(int i=0;i<=no;i++){
            for(int j=0;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<=num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=4-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
