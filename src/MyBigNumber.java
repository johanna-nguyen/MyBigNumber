public class MyBigNumber {


    public static String sum(String stn1, String stn2) {
        int[] n1 = new int[stn1.length()];
        int[] n2 = new int[stn2.length()];
        int carry = 0;
        String result = "";

        for (int i = 0; i < stn1.length(); i++) {
            n1[i] = Integer.parseInt(stn1.substring(i, i + 1));
        }

        for (int i = 0; i < stn2.length(); i++) {
            n2[i] = Integer.parseInt(stn2.substring(i, i + 1));
        }

        for (int  i = n1.length - 1, j = n2.length - 1; i >= 0 || j >= 0; i--, j--) {
            int a = 0;
            int b = 0;

            if (i >= 0) {
                a = n1[i];
            }

            if (j >= 0) {
                b = n2[j];
            }

            int sum = a + b + carry;

            int save = sum % 10;
            carry = sum / 10;

            result =  save + result;
        }
        return result;
    }
}
