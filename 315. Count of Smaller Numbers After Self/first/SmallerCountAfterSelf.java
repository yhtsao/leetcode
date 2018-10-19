package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallerCountAfterSelf {

    public List<Integer> countSmaller(int[] nums) {
        return countSmallerBinaryIndexedTree(nums);
    }

    /* ---------------------------------------------------------------
     * Merge Sort solution
     * ---------------------------------------------------------------*/
    public List<Integer> countSmallerMergeSort(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new int[]{i, nums[i]};
            res.add(0);
        }
        mergesort(pairs, res);
        return res;
    }

    private int[][] mergesort(int[][] nums, List<Integer> smaller) {
        if (nums.length <= 1) return nums;

        int mid = nums.length / 2;
        int[][] left = mergesort(Arrays.copyOfRange(nums, 0, mid), smaller);
        int[][] right = mergesort(Arrays.copyOfRange(nums, mid, nums.length), smaller);

        for (int i = 0, j = 0; i < left.length || j < right.length; ) {
            if (j == right.length || (i < left.length && left[i][1] <= right[j][1])) {
                nums[i + j] = left[i];
                smaller.set(left[i][0], smaller.get(left[i][0]) + j);
                i++;
            } else {
                nums[i + j] = right[j];
                j++;
            }
        }
        return nums;
    }

    /* ---------------------------------------------------------------
     * Binary search tree solution
     * ---------------------------------------------------------------*/
    private class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        int index;
        int lsize;

        TreeNode(int index, int val) {
            this.index = index;
            this.val = val;
            this.lsize = 0;
        }
    }

    public List<Integer> countSmallerBinarySearchTree(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums.length == 0) return res;
        int[] count = new int[nums.length];
        TreeNode root = new TreeNode(nums.length - 1, nums[nums.length - 1]);
        TreeNode cur;
        for (int i = nums.length - 2; i >= 0; i--) {
            cur = root;
            while (cur != null) {
                if (nums[i] <= cur.val) {
                    cur.lsize++;
                    if (cur.left == null) {
                        cur.left = new TreeNode(i, nums[i]);
                        break;
                    }
                    cur = cur.left;
                } else {
                    count[i] += cur.lsize + 1;
                    if (cur.right == null) {
                        cur.right = new TreeNode(i, nums[i]);
                        break;
                    }
                    cur = cur.right;
                }
            }
        }

        for (int c : count) res.add(c);
        return res;
    }

    /* ---------------------------------------------------------------
     * Binary indexed tree solution (Fenwick Tree)
     * ---------------------------------------------------------------*/
    public List<Integer> countSmallerBinaryIndexedTree(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums.length == 0) return res;

        // Find minimum value of nums
        // Ex: nums = [5, 3, 6, -2, 1]
        // min = -2
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
            min = Math.min(min, nums[i]);

        // Shift array to make sure every element in array is larger than 0
        // nums = [8, 6, 9, 1, 2]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] - min + 1;
            max = Math.max(max, nums[i]);
        }

        // Update Binary index tree and count the smaller number
        int[] tree = new int[max + 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            res.add(0, getSum(tree, nums[i] - 1));
            update(tree, nums[i], 1);
        }
        return res;
    }

    private void update(int[] tree, int index, int val) {
        while (index < tree.length) {
            tree[index] += val;
            index += index & (-index);
        }
    }

    private int getSum(int[] tree, int index) {
        int sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= index & (-index);
        }
        return sum;
    }
}
