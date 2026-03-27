import java.util.logging.Logger;

/**
 * MyBigNumber is a class that calculates the sum of large numbers represented as strings.
 * @author Johanna Nguyen
 * @version 0.0.2
 * @see <a href ="https://github.com/johanna-nguyen/MyBigNumber">My Big Number</a>
 *
 */

public class MyBigNumber {
    private static final Logger logger = Logger.getLogger(MyBigNumber.class.getName());

    /**
     * Default constructor
     */
    public MyBigNumber(){}

    /**
     * Adds two large numbers represented as strings.
     * @param stn1 the first input number in string format
     * @param stn2 the second input number in string format
     * @return the sum of the two numbers as a string
     */
    public static String sum(String stn1, String stn2) {

        logger.info("Start sum: " + stn1 + " + " + stn2);
        int carry = 0;
        String result = "";

        for (int  i = stn1.length() - 1, j = stn2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int a = 0;
            int b = 0;

            if (i >= 0) {
                a = Integer.parseInt(stn1.substring(i, i+1));
            }

            if (j >= 0) {
                b = Integer.parseInt(stn2.substring(j, j+1));
            }

            int sum = a + b + carry;
            logger.info( "a=" + a + ", b=" + b + ", carry= " + carry + ", sum=" + sum);


            int save = sum % 10;
            carry = sum / 10;

            result =  save + result;
        }
        if (carry != 0){
            result = carry + result;
        }
        return result;

    }
}
