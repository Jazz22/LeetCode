import java.util.HashMap;

public class RemoveThirdDuplicateElement {


    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        for (int i=0;i<nums.length;i++){
            if(map.getOrDefault(nums[i],0)<= 1 ){
                nums[count++] = nums[i];
                map.put(nums[i],(map.getOrDefault(nums[i],0)+1));
            }

        }
        return count;
    }


    public int removeDuplicatesLessRuntime(int[] nums) {

        int l = 0;
        int r = 0;

        while(r < nums.length) {
            int count = 1;
            while(r + 1 < nums.length && nums[r] == nums[r+1]) {
                r += 1;
                count++;
            }
            int k = Math.min(2, count);

            for(int i=0; i<k; i++) {
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}
