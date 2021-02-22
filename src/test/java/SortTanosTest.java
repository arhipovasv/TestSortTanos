import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTanosTest {

    @Test
    void tanosSort() {
        int [] exprcted = {1, 2, 3, 4, 5, 6};
        int [] nums = {1,4,6,3,2,5};
        int [] actual = SortTanos.tanosSort(nums);
        assertArrayEquals(exprcted, actual);
    }

    @Test
    void union() {
        int[] expectedUnion = {1, 2, 3, 4, 5, 6};
        int[] left = {1, 2, 3};
        int[] right = {4, 5, 6};
        int[] actual = SortTanos.union(left, right);
        assertArrayEquals(expectedUnion, actual);
    }

    @Test
    void notEqualsAverage() {
        int expectedAverage = 1;
        int[] nums = {1,2,3,4};
        int actual = SortTanos.average(nums);
        assertNotEquals(expectedAverage, actual);
    }

    @Test
    void equalsAverage() {
        int expectedAverage = 2;
        int[] nums = {1,2,3,4};
        int actual = SortTanos.average(nums);
        assertEquals(expectedAverage, actual);
    }

    @Test
    void equalsSum() {
        int expectedSum = 10;
        int[] nums = {1,2,3,4};
        int actual = SortTanos.sum(nums);
        assertEquals(expectedSum, actual);
    }

    @Test
    void notEqualsSum() {
        int expectedSum = 15;
        int[] nums = {1,2,3,4};
        int actual = SortTanos.sum(nums);
        assertNotEquals(expectedSum, actual);
    }
}