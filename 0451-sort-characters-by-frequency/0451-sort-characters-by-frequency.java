import java.util.Map.Entry;
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(char c:s.toCharArray()){
            h.put(c, h.getOrDefault(c,0)+1);
        }
        List<Entry<Character, Integer>> list = new ArrayList<>(h.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        StringBuilder newstr= new StringBuilder();
        for (Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                newstr.append(ch);
            }
        }

        return newstr.toString();
    }
}