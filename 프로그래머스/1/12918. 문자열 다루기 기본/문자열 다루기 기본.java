class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        
        // 문자열 길이는 4 or 6 
        if(str.length == 4 || str.length ==6){
            for(int i = 0 ; i < str.length ; i++){
                if(48 <= str[i] && str[i] <= 57){
                    answer = true;
                }else{
                    answer = false;
                    break;
                }
            }
        }else{
            answer = false;
        }
        
        return answer;
    }
}