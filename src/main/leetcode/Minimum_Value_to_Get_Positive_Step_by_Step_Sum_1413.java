public class Minimum_Value_to_Get_Positive_Step_by_Step_Sum_1413 {
    public int minStartValue(int[] nums) {
        int[] pref = new int[nums.length+1];
        pref[0] = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= nums.length; i++){
            pref[i] = pref[i-1] + nums[i-1];
            if(pref[i] < min){
                min = pref[i];
            }
        }
        if(min < 0){
            min = (min - 1) * -1;
        }
        else{
            min = 1;
        }
        return min;
    }

    public static void main(String[] args) {

    }
}
