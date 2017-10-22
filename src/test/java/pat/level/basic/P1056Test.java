package pat.level.basic;

import org.junit.Assert;
import org.junit.Test;

public class P1056Test {

    private String input;
    private int output;

    @Test
    public void testPractise() {
        input = "3 5 2 8";
        System.out.println("input example: " + input);
        output = new P1056().practise(input);
        System.out.println("output example: " + output);
        Assert.assertEquals(330, output);

        input = "0 0";
        System.out.println("input example: " + input);
        output = new P1056().practise(input);
        System.out.println("output example: " + output);
        Assert.assertEquals(-1, output);
    }

}
