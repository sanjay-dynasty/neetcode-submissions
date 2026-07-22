class Solution {
    public int numDecodings(String s) {

        int n = s.length();
        if(s == null || n == 0 || s.charAt(0) == '0')
            return 0;
        
        int oneBack = 1;
        int twoBack = 1;

        for(int i=2; i<=n; i++){
            int curr = 0;

            int singleDigit = s.charAt(i-1) - '0';
            if(singleDigit >=1 && singleDigit <=9){
                curr += oneBack;
            }

            int twoDigits = Integer.parseInt(s.substring(i-2, i));
            if(twoDigits >= 10 && twoDigits <= 26){
                curr += twoBack;
            }

            if(curr == 0){
                return 0;
            }

            twoBack = oneBack;
            oneBack = curr;
        }

        return oneBack;
        
    }
}