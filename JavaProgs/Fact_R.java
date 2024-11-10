

public class Fact_R {
    int factResult=1;
  
    public static void main(String[] args) {
        int no=5;
        Fact_R f=new Fact_R();
        f.calFact(no);
        System.out.println(f.factResult);
    }

    void calFact(int no){
        if(no>=1){
            factResult=factResult*no;
            calFact(no-1);
        }
    }
    
}
