public class bitwiseoperator {

    public static void main(String[] args) {
        int p = 9, q= 10;

        System.out.println(p|q);// bitwise OR
        System.out.println(p&q);// bitwize and
        System.out.println(p^q);// bitwise exlusive OR  or  XOR
        System.out.println(~p);// complement
        System.out.println(p<<1);// left shift by 1
        System.out.println(p<<2);// left shift by 2
        System.out.println(p>>1);//  Right shift by 1
        System.out.println(p>>2);// Right shift by 2
    }
}