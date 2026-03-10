package Assignment3.Module7;
public class BinarySearch {
    static int iterativeSearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    static int recursiveSearch(int arr[], int low, int high, int key) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[mid] > key)
            return recursiveSearch(arr, low, mid - 1, key);
        return recursiveSearch(arr, mid + 1, high, key);
    }
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60};
        int key = 40;
        System.out.println(iterativeSearch(arr, key));
        System.out.println(recursiveSearch(arr,0,arr.length-1,key));
    }
}