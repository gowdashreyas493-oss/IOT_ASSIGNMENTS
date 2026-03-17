package Module11;
import java.util.*;
class SlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            while(!dq.isEmpty() && dq.peekFirst() < j - k + 1)
                dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[j])
                dq.pollLast();
            dq.addLast(j);
            if(j >= k - 1){
                res[i++] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}