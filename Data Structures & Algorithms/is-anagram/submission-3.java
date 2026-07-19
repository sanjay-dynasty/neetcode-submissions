class Solution {
    public boolean isAnagram(String s, String t) {

        if(s == null || t == null)
            return false;
        if(s.length() != t.length())
            return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        int i=0;
        while(i<sArr.length && i<tArr.length){
            if(sArr[i] != tArr[i])
                return false;
            i++;
        }
        return true;

    }
}
