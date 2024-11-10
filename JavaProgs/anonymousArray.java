public class anonymousArray {
    public static void main(String[] args) {
        anonymousArray.sum(new int[]{20,30});
    }
    static void sum(int[] no){
        int total=0;
        for(int i:no){
            total=total+i;
        }
        System.out.println(total);
    }
    
}
