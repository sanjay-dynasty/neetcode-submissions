class Solution {
    List<String> res = new ArrayList<>();
    StringBuilder temp = new StringBuilder();
    static Map<Character, String> map = new HashMap<>();
    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    void backtrack(int idx, String digits) {
        if (idx == digits.length()) {
            res.add(temp.toString());
            return;
        }

        char ch = digits.charAt(idx);
        String str = map.get(ch);

        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backtrack(idx + 1, digits);
            temp.deleteCharAt(temp.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0)
            return res;

        backtrack(0, digits);
        return res;
    }
}
