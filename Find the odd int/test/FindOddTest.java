import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FindOddTest {

    private FindOdd findOdd;

    @Before
    public void testSetup() throws Exception {
        findOdd = new FindOdd();
    }

    @Test
    public void shouldFindOdd() throws Exception {

        //given
        final int array1[] = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        final int array2[] = {5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};
        final int array3[] = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        final int array4[] = {1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};

        //when
        int result1 = findOdd.findIt(array1);
        int result2 = findOdd.findIt(array2);
        int result3 = findOdd.findIt(array3);
        int result4 = findOdd.findIt(array4);


        //then
        int expected1 = -1;
        int expected2 = 1;
        int expected3 = 5;
        int expected4 = 10;

        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
    }
}