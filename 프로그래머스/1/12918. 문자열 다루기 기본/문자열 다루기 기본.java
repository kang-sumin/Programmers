class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        
        if(str.length != 4 && str.length !=6){
            answer = false;
        }
        
        for(int i=0;i<str.length;i++){
            if(48<=str[i] && str[i]<=57){
                continue;
            }else{
                answer = false;
            }
        }
        return answer;
    }
}