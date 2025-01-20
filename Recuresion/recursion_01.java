public class recursion_01 {

    public static void printnumb(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        n--;
        printnumb(n);
    }
    public static void main(String[] args){
        printnumb(5);
    }
}