public class AlternativSum {
    static int Sum(int num){
        if(num==0){
            return 0;
        }
        return Sum(num-1)+num;
    }
    static int AlternatSum(int num){
        if(num==0) return 0;
        if(num%2==0){
            return AlternatSum(num-1)-num;
        }else{
            return AlternatSum(num-1)+num;
        } 
     }
    public static void main(String[] args) {
        System.out.println(Sum(10));
        System.out.println(AlternatSum(4));
    }
    
}
