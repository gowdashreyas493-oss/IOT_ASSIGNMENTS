package Assignment3.Module6;
public class MissingNum {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int n = 5;
        for(int i=1;i<=n;i++){
            boolean found = false;
            for(int j=0;j<arr.length;j++){
                if(arr[j] == i)
                    found = true;
            }
            if(!found){
                System.out.println("Missing Number = "+i);
            }
        }
    }
}