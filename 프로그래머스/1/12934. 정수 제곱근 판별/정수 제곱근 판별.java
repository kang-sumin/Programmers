//정수 제곱근 판별
class Solution {
    public long solution(long n) {
        long answer = 0;
        long result = (long)Math.sqrt(n);
        if(n==(long)Math.pow(result,2)){
            answer=(long)Math.pow(result+1,2);
        }
        else{
            answer = -1;
        }
        return answer;
    }
}