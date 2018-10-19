package first;

import common.TreeLinkNode;

public class PopulateNextRightPtr {

    public void connect(TreeLinkNode root) {
        TreeLinkNode parent = root;
        TreeLinkNode curr;
        while (parent.left != null) {
            curr = parent;
            while (curr != null) {
                curr.left.next = curr.right;
                if (curr.next != null) curr.right.next = curr.next.left;
                curr = curr.next;
            }
            parent = parent.left;
        }
    }
}
