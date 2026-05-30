class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        s=s.strip();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                return ans;
            
            }
            ans++;


        }
        return ans;
        
    }
}