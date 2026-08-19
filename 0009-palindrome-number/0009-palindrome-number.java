class Solution {
    public boolean isPalindrome(int x) {
        int lastdigit=0;
        int rev=0;
        int temp=x;
        while(temp>0){
            lastdigit=temp%10;
            rev=rev*10+lastdigit;
            temp=temp/10;

        }
        if(rev==x){
            return true;
        }
        return false;
        
    }
}