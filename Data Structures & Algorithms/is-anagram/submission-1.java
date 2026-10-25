class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
         char[] t1 = t.toCharArray();
        if(s1.length != t1.length){
            return false;
        }

        int[] h = new int[26];
 
        for(int i=0;i<s1.length;i++){
            h[ s1[i] - 97]++;
        }

        for(int j=0;j<s1.length;j++){
            h[t1[j] - 97]--;
        }

        for(int k=0;k<h.length;k++){
            if(h[k] != 0){
                return false;
            }
        }
        return true;
    }
}
