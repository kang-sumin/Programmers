//x만큼 간격이 있는 n개의 숫자
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0;i<n;i++){
                answer[i]=(long)x*(i+1);
            }
            return answer;   
    }
}