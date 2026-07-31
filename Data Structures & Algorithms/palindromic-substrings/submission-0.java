class Solution {
    public static int expandAroundCenter(String str, int l, int r){
        int n = str.length();
        int count = 0;
        while(l >= 0 && r<n && str.charAt(l) == str.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }
    public int countSubstrings(String s) {

        if(s == null || s.length() == 0)
            return 0;

        int res = 0;
        int n = s.length()-1;
        for(int i=0; i<n; i++){
            res += expandAroundCenter(s, i, i) + expandAroundCenter(s,i,i+1);
        }
        return res+1;
        
    }
}
