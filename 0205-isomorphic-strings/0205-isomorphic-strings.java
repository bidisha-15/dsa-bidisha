class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.equals(t)){
            return true;
        }
        HashMap<Character, Character> ht = new HashMap<>();
        HashMap<Character, Character> ht1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if (ht.containsKey(s.charAt(i)) && ht.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            if (ht1.containsKey(t.charAt(i)) && ht1.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
            // if((ht.containsKey(t.charAt(i)) && ht.get(t.charAt(i)) == t.charAt(i))){return false;}
            ht.put(s.charAt(i), t.charAt(i));
            ht1.put(t.charAt(i), s.charAt(i));
            
        }
        return true;
    }
}