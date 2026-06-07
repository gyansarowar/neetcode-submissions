class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []pre=new int[nums.length];
        int []post=new int[nums.length];
        int preProduct=1;
        int postProduct=1;
        pre[0]=1;
        post[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            preProduct*=nums[i-1];
            pre[i]=preProduct;
        }
        for(int i=nums.length-2;i>=0;i--){
            postProduct*=nums[i+1];
            post[i]=postProduct;
        }
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=pre[i]*post[i];
        }
        return ans;
        
    }
}  
