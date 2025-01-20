public class recursion_3 {
    public static void printfact(int n , int fact){
        if(n==1){
            System.out.println(fact);
            return;
        }
        fact = fact*n;
        printfact(n-1, fact);
    }

    public static void main(String[] args){
        printfact(5, 1);
    }
    
}
