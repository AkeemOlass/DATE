import org.junit.Assert;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class MyDateTest {
    @org.junit.Test
    public void DDate() throws Exception {
        String [] milli = {"Wed Dec 31 19:00:01 EST 1969",
        "Wed Dec 31 19:00:10 EST 1969",
        "Wed Dec 31 19:01:40 EST 1969",
       " Wed Dec 31 19:16:40 EST 1969",
       "Wed Dec 31 21:46:40 EST 1969",
        "Thu Jan 01 22:46:40 EST 1970",
        "Mon Jan 12 08:46:40 EST 1970",
        "Sat Jan 17 02:41:05 EST 1970",
        "Wed Jan 14 20:42:32 EST 1970"};

        /**BigInteger[] milli = {new BigInteger("10000"), new BigInteger("100000"), new BigInteger("1000000"),
                new BigInteger("10000000"), new BigInteger("100000000"),
                new BigInteger("1000000000"), new BigInteger("10000000000"),
                new BigInteger("100000000000")};*/
        //for (int i=0; i < milli.length-1; i++){
            Assert.assertEquals(milli[8], MyDate.DDate(1000, 8));
        }

    }
