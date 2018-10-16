package first.tree;

public class MedianFinder {
    int size;
    TreeNode root;

    class TreeNode {
        int val;
        int lsize, rsize;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.lsize = 0;
            this.rsize = 0;
        }
    }

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        this.size = 0;
    }

    public void addNum(int num) {
        size++;
        if (root == null) {
            root = new TreeNode(num);
            return;
        }
        TreeNode cur = root;
        while (cur != null) {
            if (num <= cur.val) {
                cur.lsize++;
                if (cur.left == null) {
                    cur.left = new TreeNode(num);
                    break;
                }
                cur = cur.left;
            } else {
                cur.rsize++;
                if (cur.right == null) {
                    cur.right = new TreeNode(num);
                    break;
                }
                cur = cur.right;
            }
        }
    }

    public double findMedian() {
        int mid = size / 2;
        double median = findKthValInBST(root, mid);
        if (size % 2 == 0)
            median = (median + findKthValInBST(root, mid - 1)) / 2;
        return median;
    }

    private int findKthValInBST(TreeNode cur, int k) {
        if (k == cur.lsize) return cur.val;
        if (k > cur.lsize)
            return findKthValInBST(cur.right, k - cur.lsize - 1);
        else
            return findKthValInBST(cur.left, k);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */