import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {
    @Test
    public void test01() {
        int[] nums = new int[]{1, 3, 5, 6};
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int target = 5;
        int position = searchInsertPosition.searchInsert(nums, target);
        Assertions.assertEquals(2, position);

        target = 2;
        position = searchInsertPosition.searchInsert(nums, target);
        Assertions.assertEquals(1, position);

        target = 7;
        position = searchInsertPosition.searchInsert(nums, target);
        Assertions.assertEquals(4, position);

        target = 0;
        position = searchInsertPosition.searchInsert(nums, target);
        Assertions.assertEquals(0, position);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{};
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int target = 5;
        int position = searchInsertPosition.searchInsert(nums, target);
        Assertions.assertEquals(0, position);
    }
}
