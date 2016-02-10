public boolean has12(int[] nums) {
  boolean hasOne = false;
  boolean answer = false;
  for(int i = 0;i<nums.length;i++){
    if(nums[i]==1){
      hasOne = true;
    }
    if(nums[i]==2 && hasOne){
      answer = true;
    } 
  }
  return answer;
}
