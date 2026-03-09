package Assignment3.Module6;

public class DifferenceArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int l = 1;
        int r = 3;
        int val = 5;
        for(int i=l;i<=r;i++){
            arr[i] = arr[i] + val;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
