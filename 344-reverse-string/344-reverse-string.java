class Solution {
    public void reverseString(char[] s) {
        reverse(s,0);
        
    }
    
    void reverse(char[] s,int p){
        int l=s.length;
        if(p<l/2){
            char c=s[p];
            s[p]=s[l-1-p];
            s[l-1-p]=c;
            reverse(s,p+1);
        }
            
        
    }
}