package Assignment3.Module7;
public class FirstAndLastOccurence {
    static int first(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                result = mid;
                high = mid - 1;
            }
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return result;
    }
    static int last(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                result = mid;
                low = mid + 1;
            }
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,4,5};
        int key = 2;
        System.out.println(first(arr,key));
        System.out.println(last(arr,key));
    }
}