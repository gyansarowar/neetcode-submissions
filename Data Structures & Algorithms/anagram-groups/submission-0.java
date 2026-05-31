class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, ArrayList<String>> hm = new HashMap<>();
        for (String str : strs) {
            char[] tempArr = str.toCharArray();
            Arrays.sort(tempArr);
            String key = Arrays.toString(tempArr);
            if (hm.containsKey(key)) {
                hm.get(key).add(str);
            } else {
                hm.put(key, new ArrayList<String>());
                hm.get(key).add(str);
            }
        }
        for (ArrayList<String> s : hm.values()) {
            ans.add(s);
        }
        return ans;
    }
}
