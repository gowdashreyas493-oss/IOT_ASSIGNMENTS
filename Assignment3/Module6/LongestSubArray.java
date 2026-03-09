package Assignment3.Module6;
public class LongestSubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,5};
        int k = 5;
        int maxLength = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                if(sum == k){
                    int length = j-i+1;
                    if(length > maxLength)
                        maxLength = length;
                }
            }
        }
        System.out.println("Longest Length = "+maxLength);
    }
}
