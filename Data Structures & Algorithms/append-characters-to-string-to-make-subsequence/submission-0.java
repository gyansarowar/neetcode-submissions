class Solution {
    public int appendCharacters(String s, String t) {
        int tptr=0;
        int sptr=0;
        while(sptr<s.length() && tptr<t.length()){
            if(s.charAt(sptr)==t.charAt(tptr)){
                tptr++;
                sptr++;
            }else{
                sptr++;
            }
        }
        return t.length()-tptr;
        
    }
}