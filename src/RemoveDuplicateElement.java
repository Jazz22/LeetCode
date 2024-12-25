import java.util.HashMap;

public class RemoveDuplicateElement {

    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        for (int i=0;i<nums.length;i++){
            if(map.get(nums[i])== null){
                nums[count++] = nums[i];
                map.put(nums[i],1);
            }
        }
        return map.size();
    }

    // removing from sorted ascending input array
    public int removeDuplicatesLessRuntime(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[j]=nums[i];
                j+=1;
            }
        }
        return j;


    }
}
