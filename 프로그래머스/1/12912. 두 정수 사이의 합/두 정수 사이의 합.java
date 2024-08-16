//두 정수 사이의 합
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int min = 0;
        int max = 0;
        //큰 수와 작은 수 구분
        if(b>=a){
            min = a;
            max = b;
        }else{
            min = b;
            max = a;
        }
        
        //작은 수부터 차례로 합함
        for(int i=min;i<=max;i++){
            answer+=i;
        }
        return answer;
        
        
    }
}