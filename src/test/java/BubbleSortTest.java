import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    private int[] arrayToBeSorted = {5, 22, -10, 7, 2, 71};
    private int[] arraySorted = {-10, 2, 5, 7, 22, 71};

    @Test
    public void testBubbleSort() throws Exception {
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(arrayToBeSorted);
        assertArrayEquals(arraySorted, result);
    }
}