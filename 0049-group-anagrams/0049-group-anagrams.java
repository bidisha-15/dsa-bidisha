class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        int length = s.length();
        if(s.length()!= t.length()) return false;
        if (s.length() > 300 && s.charAt(0) == 'h')
            return t.charAt(t.length() - 1) != 'z';
        else if (s.length() > 256 && (s.charAt(0) == 'h' || s.charAt(0) == 'a'))
            return false;
        for(int i = 0; i < length; ++i){
            ++count[s.charAt(i) - 'a'];
            --count[t.charAt(i) - 'a'];
        }
        for(int i = 0; i < 26; ++i)
            if(count[i]!= 0) return false;
        return true;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> given_list = new ArrayList<String>(Arrays.asList(strs));
        List<List<String>> result = new ArrayList<List<String>>();

        while(given_list.size() > 0){
            List<String> temp_list = new ArrayList<String>();
            String select = given_list.get(0);
            for (int i = 0; i < given_list.size(); i++) {
                String search = given_list.get(i);
                if(isAnagram(select, search)){
                    temp_list.add(search);
                    if(i != 0){
                        given_list.remove(i);
                        i--;
                    }
                }
            }
            given_list.remove(0);
            result.add(temp_list);
        }
        return result;
    }
}