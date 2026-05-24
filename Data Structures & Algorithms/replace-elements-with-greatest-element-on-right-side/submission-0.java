class Solution {
    public int[] replaceElements(int[] arr) {
        int indx=0;
        int max=0;
        int[] ans=new int[arr.length];
        while(indx<arr.length-1){
            int maxsofar=Integer.MIN_VALUE;
            for(int maxindx=indx+1;maxindx<arr.length;maxindx++){
                if(arr[maxindx]>maxsofar){
                    maxsofar=arr[maxindx];
                }
            }
            ans[indx]=maxsofar;
            indx++;


        }
        ans[arr.length-1]=-1;
        return ans;
    }
}