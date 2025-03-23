//here we have to find the sum of pair index to that matches the target.. and pair always exists..

//brute-force attack 
//[2,7,15,11]

public class pairsum{

    public int [] findPairSum(int [] nums, int target){
        int numsize=nums.length;
        int [] indexArray= new int [2];
        for(int i=0; i<numsize;i++){
            for(int j=i+1;j<numsize;j++){
                 if(nums[i]+nums[j]==target){
                    indexArray[0]=i;
                    indexArray[1]=j;
                    return indexArray;
                 };
            }
        }
        return indexArray;
    };

 public static void main(String[] args){
     pairsum PairSum=new pairsum();
    int [] data= PairSum.findPairSum(new int [] {2,7,15,11},26);
      for(int num :data){
        System.out.println(num);
      }

 }    
}