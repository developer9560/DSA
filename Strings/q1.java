public class q1 {
    public static void main(String[] args) {
        String s = "bb";
        String str = "";
        if (s.length() <= 1) {
            System.out.println(s);
        }
        String pal = "";
        String rev = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                str = s.substring(i, j);

            }

            for (int k = 0; k < str.length(); k++) {
                char ch = str.charAt(k);
                rev = ch + rev;
            }

            if (str.equals(rev)) {
                if (str.length() >= pal.length()) {
                    pal = str;
                }
            }
            rev = "";
            str = "";

        }
        System.out.println(pal);

    }
}
