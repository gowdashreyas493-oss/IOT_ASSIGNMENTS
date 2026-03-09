package Assignment3.Module6;

public class NegativeBfrPositive {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-4,5,-6};
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
