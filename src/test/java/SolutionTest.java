import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void restoreArrayTest1() {
        int[][] adjacentPairs = {
                {2, 1},
                {3, 4},
                {3, 2},
        };
        int[] expected = {1, 2, 3, 4};
        int[] actual = new Solution().restoreArray(adjacentPairs);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void restoreArrayTest2() {
        int[][] adjacentPairs = {
                {4, -2},
                {1, 4},
                {-3, 1},
        };
        int[] expected = {-2, 4, 1, -3};
        int[] actual = new Solution().restoreArray(adjacentPairs);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void restoreArrayTest3() {
        int[][] adjacentPairs = {
                {100000, -100000},

        };
        int[] expected = {100000, --100000};
        int[] actual = new Solution().restoreArray(adjacentPairs);

        Assert.assertArrayEquals(expected, actual);
    }
}
