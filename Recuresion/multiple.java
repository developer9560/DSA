public class multiple {
    static void mult(int num , int k){
        if(k==0){
            return;
        }
        mult(num, k-1);
        System.out.println(num*k);
    }

    public static void main(String[] args) {
        mult(5, 5);
            
    }
    
}
