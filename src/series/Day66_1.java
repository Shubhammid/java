package series;

public class Day66_1 {

    static class DNode {
        int val;
        DNode prev, next, child;

        DNode(int val) {
            this.val = val;
        }
    }

    static DNode flatten(DNode head) {
        dfs(head);
        return head;
    }

    static DNode dfs(DNode node) {
        DNode curr = node;
        DNode last = null;

        while (curr != null) {
            DNode next = curr.next;

            if (curr.child != null) {
                DNode childTail = dfs(curr.child);

                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;

                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }
                last = childTail;
            } else {
                last = curr;
            }
            curr = next;
        }
        return last;
    }

    static void printList(DNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DNode head = new DNode(1);
        head.next = new DNode(2);
        head.next.prev = head;
        head.next.child = new DNode(3);

        flatten(head);
        printList(head);
    }
}
