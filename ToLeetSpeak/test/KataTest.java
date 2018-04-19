import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KataTest {

    private Kata kata;

    @Before
    public void testSetup() throws Exception {
        kata = new Kata();
    }

    @Test
    public void shouldToLeetSpeak() throws Exception {

        //given
        final String input1 = "LEET";
        final String input2 = "CODEWARS";
        final String input3 = "LOREM IPSUM DOLOR SIT AMET";

        //when
        String result1 = kata.toLeetSpeak(input1);
        String result2 = kata.toLeetSpeak(input2);
        String result3 = kata.toLeetSpeak(input3);
        //then
        String expected1 = new String("1337");
        String expected2 = new String("(0D3W@R$");
        String expected3 = new String("10R3M !P$UM D010R $!7 @M37");

        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}