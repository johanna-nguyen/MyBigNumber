import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * MyBigNumberTest is a unit test class that validates the correctness of
 * operations implemented in the MyBigNumber class.
 * @author Johanna Ngyen
 * @version 0.0.2
 * @see <a href ="https://github.com/johanna-nguyen/MyBigNumber">My Big Number</a>
 */
public class MyBigNumberTest {
    @Test
    public void testSum(){
        MyBigNumber myBigNumber = new MyBigNumber();
        assertEquals("2131",  myBigNumber.sum("1234", "897"));
        assertEquals("1000", myBigNumber.sum("999", "1"));
        assertEquals("0", myBigNumber.sum("0", "0"));
        assertEquals("10", myBigNumber.sum("5", "5"));

    }

}
