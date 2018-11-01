package first;

public class MyCalendarThreeV2 {
    class SegmentTreeNode {
        int start, end;
        SegmentTreeNode left, right;
        int booked, maxBooked;

        public SegmentTreeNode(int start, int end) {
            this.start = start;
            this.end = end;
            this.booked = 0;
            this.maxBooked = 0;
        }
    }

    private SegmentTreeNode root;

    private void add(SegmentTreeNode node, int start, int end) {
        if (node.start > end || node.end <= start) return;
        if (start <= node.start && end >= node.end) { // whole range included
            node.booked++;
            node.maxBooked++;
            return;
        }
        int mid = node.start + (node.end - node.start) / 2;
        if (start < mid) {
            if (node.left == null) node.left = new SegmentTreeNode(node.start, mid);
            add(node.left, start, end);
        }
        if (end > mid) {
            if (node.right == null) node.right = new SegmentTreeNode(mid, node.end);
            add(node.right, start, end);
        }
        node.maxBooked = node.booked + Math.max(getMax(node.left), getMax(node.right));
    }

    private int getMax(SegmentTreeNode node) {
        if (node == null) return 0;
        return node.maxBooked;
    }

    public MyCalendarThreeV2() {
        this.root = new SegmentTreeNode(0, 1000000000);
    }

    public int book(int start, int end) {
        add(root, start, end);
        return root.maxBooked;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */
