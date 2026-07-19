class Solution {
    
    public static boolean isAnagram(String s, String t) {

        char[] s_arr = s.toCharArray();
        Arrays.sort(s_arr);
        String s_new = new String(s_arr);

        char[] t_arr = t.toCharArray();
        Arrays.sort(t_arr);
        String t_new = new String(t_arr);

        return s_new.equals(t_new);
    }
}
