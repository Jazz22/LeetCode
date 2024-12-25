
public class MergeArray {
/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be
stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where
the first m elements denote the elements that should be merged, and the last n elements
are set to 0 and should be ignored. nums2 has a length of n.
* */
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if(n == 0)return;
            int len1 = nums1.length;
            int end_idx = len1-1;
            while(n > 0 && m > 0){
                if(nums2[n-1] >= nums1[m-1]){
                    nums1[end_idx] = nums2[n-1];
                    n--;
                }else{
                    nums1[end_idx] = nums1[m-1];
                    m--;
                }
                end_idx--;
            }
            while (n > 0) {
                nums1[end_idx] = nums2[n-1];
                n--;
                end_idx--;
            }
        }

        /* My code with more complexity and runtime
        public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0;j<n;j++){
            boolean replace = false;
            int temp = 0;
            for(int i=0;i<(m+n);i++){

                if(replace){
                    int temp2= nums1[i];
                    nums1[i]= temp;
                    temp= temp2;

                }else if(nums1[i]==0 && (i+(n-j))==(m+n) && !replace){
                    nums1[i]=nums2[j];
                    break;
                }
                else if(nums1[i]>nums2[j] && !replace){
                    temp = nums1[i];
                    nums1[i]= nums2[j];
                    replace = true;
                }



            }
        }
    }
        * */

}
