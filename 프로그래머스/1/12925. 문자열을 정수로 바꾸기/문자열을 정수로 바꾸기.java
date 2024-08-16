//문자열을 정수로 바꾸기
class Solution {
    public int solution(String s) {
        int answer = 0;
        if(1<=s.length() && s.length()<=5){
            answer = Integer.valueOf(s);
            return answer;
        }
        else{
            return 0;
        }
    }
}