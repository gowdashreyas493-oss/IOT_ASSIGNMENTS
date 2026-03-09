package Assignment3.Module6;

public class KadaneAlgo {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(currentSum + arr[i] > arr[i])
                currentSum = currentSum + arr[i];
            else
                currentSum = arr[i];
            if(currentSum > maxSum)
                maxSum = currentSum;
        }
        System.out.println("Maximum Sum = " + maxSum);
    }
}
