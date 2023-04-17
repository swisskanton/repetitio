/*
Assume that the data elements of the linked list argument will always be in non-descending order.

 Input Format
The first line contains an integer, N, the number of nodes to be inserted.
The N subsequent lines each contain an integer describing the data value of a node
 being inserted at the list's tail.

 Output Format
The removeDuplicates function deletes any duplicate nodes from the list and
 returns the head of the updated list.

 Sample Input:
        6 1 2 2 3 3 4
 Sample Output:
        1 2 3 4
 */
package removeDuplicates;

import java.util.Scanner;

public class Main {

    public static Node removeDuplicates(Node head) {
        if (head != null) {
            Node node = head;
            while (node.next != null) {
                Node nextNode = node.next;
                if (node.data == nextNode.data)
                    node.next = nextNode.next;
                else
                    node = nextNode;
            }
        }
        return head;
    }

    public static  Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else if(head.next == null)
            head.next = newNode;
        else {
            Node node = head;
            while(node.next != null)
                node = node.next;
            node.next = newNode;
        }
        return head;
    }

    public static void display(Node head) {
        Node node = head;
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int n = sc.nextInt();
        while(n-- > 0) {
            int num = sc.nextInt();
            head = insert(head, num);
        }
        head = removeDuplicates(head);
        display(head);
    }
}