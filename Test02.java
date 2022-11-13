public class Test02 {
    /**
     * 两数之和
     */
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] arr = new int[2];
        arr = twoSum(nums,target);
        System.out.print("[" + arr[0] + "," + arr[1] + "]");
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int i,j;
        for(i=0;i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
