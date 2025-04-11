class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        String[] temp = new String[words.length];
        int k = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            boolean inFirst = true, inSecond = true, inThird = true;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (first.indexOf(ch) == -1) inFirst = false;
                if (second.indexOf(ch) == -1) inSecond = false;
                if (third.indexOf(ch) == -1) inThird = false;
            }
            if (inFirst || inSecond || inThird) {
                temp[k++] = words[i]; 
            }
        }
        String[] new_words = new String[k];
        for (int i = 0; i < k; i++) {
            new_words[i] = temp[i];
        }

        return new_words;
    }
}
