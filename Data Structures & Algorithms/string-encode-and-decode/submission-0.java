class Solution {

    public String encode(List<String> strs) {
        String ans="";
        for(String s:strs){
            ans+=s.length();
            ans+="#";
            ans+=s;
        }
        return ans;

    }

    public List<String> decode(String str) {
        List<String>ans=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            String word=str.substring(j+1,j+1+len);
            ans.add(word);
            i=j+1+len;
        }
        return ans;

    }
}
