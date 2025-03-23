
public class Optimized{
    public int []  PairSum(int [] nums, int target){
       int i=0; int j=nums.length-1;
       int [] ResultArrayIndex= new int [2];
       for(int k=0;k<nums.length;k++){
       if(nums[i]+nums[j]<target){
            i++;
       }else if(nums[i]+nums[j]>target){
          j--;
       }
       else{
            ResultArrayIndex[0]=i;
            ResultArrayIndex[1]=j;
            return ResultArrayIndex;
        }
    }
    return ResultArrayIndex;
    }

    public static void main(String [] args){
        Optimized pairsum=new Optimized();
       int [] data= pairsum.PairSum(new int [] {2,7,15,11},26);
        for(int num: data){
            System.out.println(num);
        }
    }
}
// since here the single loop has been used so it will be have the O(n) time complexity and O(1) space complexity. 