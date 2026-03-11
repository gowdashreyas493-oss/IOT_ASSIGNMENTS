import java.util.Arrays;
class Node {
    int val, id;
    Node(int v, int i) { val = v; id = i; }
    public String toString() { return val + "(id:" + id + ")"; }
}
public class StabilityDemo {
    public static void selectionSort(Node[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].val < arr[min].val) min = j;
            }
            Node temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Node[] arr = { new Node(2, 1), new Node(2, 2), new Node(1, 1) };
        System.out.println("Before: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After:  " + Arrays.toString(arr)); 
    }
}





/*

Algorithm                               Stability                                               Why?

Bubble Sort                              Stable                         Only swaps if A[j]>A[j+1]. Equal values stay put.
Merge Sort                               Stable                         "During the merge step, it prioritizes the left element if values are equal."
Insertion Sort                           Stable                         It only moves an element past another if it is strictly greater.
Selection Sort                          Unstable                        A long-distance swap can jump an element over an identical one.
Quick Sort                              Unstable                        The partitioning process involves swaps that don't account for original order.

*/