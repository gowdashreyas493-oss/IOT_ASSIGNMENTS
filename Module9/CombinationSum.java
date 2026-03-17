package Module9;
import java.util.*;
public class CombinationSum {
        public static void backtrack(int[] arr,int target,int start,List<Integer> current,List<List<Integer>> result){
            if(target==0){
                result.add(new ArrayList<>(current));
                return;
            }
            for(int i=start;i<arr.length;i++){

                if(arr[i]>target) continue;

                current.add(arr[i]);
                backtrack(arr,target-arr[i],i,current,result);
                current.remove(current.size()-1);
            }
        }
        public static List<List<Integer>> combinationSum(int[] arr,int target){

            List<List<Integer>> result=new ArrayList<>();
            backtrack(arr,target,0,new ArrayList<>(),result);
            return result;
        }

        public static void main(String[] args){

            int[] arr={2,3,6,7};
            int target=7;

            System.out.println(combinationSum(arr,target));
        }
    }

