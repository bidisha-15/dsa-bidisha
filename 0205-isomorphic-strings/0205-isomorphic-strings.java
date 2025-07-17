class Solution {
    public boolean isIsomorphic(String s, String t) {
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        HashMap<Character, Character> ht = new HashMap<>();
        HashMap<Character, Character> ht1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if (ht.containsKey(s1[i]) && ht.get(s1[i]) != t1[i]) {
                return false;
            }
            if (ht1.containsKey(t1[i]) && ht1.get(t1[i]) != s1[i]) {
                return false;
            }
            // if((ht.containsKey(t.charAt(i)) && ht.get(t.charAt(i)) == t.charAt(i))){return false;}
            ht.put(s1[i], t1[i]);
            ht1.put(t1[i], s1[i]);
            
        }
        return true;
    }
}