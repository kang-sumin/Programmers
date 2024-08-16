//짝수의 합
class Solution {
    public int solution(int n) {
        int answer = 0;
        if(0<n && n<=1000){
            for(int i=2;i<=n;i+=2){
                answer+=i;
            }
            return answer;
        }
        else{
            System.out.println("n은 0~1000사이의 정수여야 합니다.");
            return 0;
        }
    }
}