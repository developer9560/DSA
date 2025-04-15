public class ReverseInteger {
    public static void main(String[] args) {
        int x = 153434;
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);
        System.out.println(x);

        int reversedX = 0;

        // Reverse the digits
        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before updating reversedX
            if (reversedX > (Integer.MAX_VALUE - digit) / 10) {
                 // Overflow will occur
                 System.out.println("overflow condition");
            }

            reversedX = reversedX * 10 + digit;
            x = x / 10;
        }

        // Apply the sign
        reversedX *= sign;

        System.out.println(reversedX);

       
    }
}
