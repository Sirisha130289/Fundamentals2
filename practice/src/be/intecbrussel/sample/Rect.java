package be.intecbrussel.sample;

public class Rect {
    
    private int l;
    private int w;




    public final String DESC = "RECT";

    public boolean unlucky1(int[] nums) {

        if (nums.length <2){
            return false;
        }

        if(nums.length < 3){
            if(nums[0] ==1 && nums[1] ==3)
            {
                return true;
            }
        }

        if(nums[0] ==1 && nums[1] ==3 || (nums[1] == 1 && nums[2] == 3)){
            return true;
        }

        if (nums.length > 3){

            if((nums[nums.length-2] == 1 && nums[nums.length-1] == 3)){
                return true;
            }
        }



        return false;
    }




    public static void main(String[] args) {

    }

}
