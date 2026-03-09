package Assignment3.Module6;
public class EvenIndexEvenNum {
    public static void main(String[] args) {
        int arr[] = {3,6,12,1,5,8};
        int result[] = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                result[evenIndex] = arr[i];
                evenIndex += 2;
            }
            else{
                result[oddIndex] = arr[i];
                oddIndex += 2;
            }
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}