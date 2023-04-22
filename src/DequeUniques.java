import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

/*
In this problem use Deque, you are given N integers. You need to find the maximum number
of unique integers among all the possible contiguous subarrays of size M.
    Input Format
The first line of input contains two integers N and M: representing the total number of integers
and the size of the subarray, respectively. The next line contains N space separated integers.
    Output Format
Print the maximum number of unique integers among all possible contiguous subarrays of size M.
    Sample Input
        6 3
        5 3 5 2 3 2
    Sample Output
        3
 */
public class DequeUniques {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        HashMap<Integer, Integer> uniques = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            if (uniques.containsKey(num))
                uniques.put(num, uniques.get(num) + 1);
            else
                uniques.put(num, 1);
            if (i >= m - 1) {
                if (max < uniques.size())
                    max = uniques.size();
                num = deque.pop();
                if (uniques.get(num) == 1)
                    uniques.remove(num);
                else
                    uniques.put(num, uniques.get(num) - 1);
            }
        }
        System.out.println(max);
    }
}
