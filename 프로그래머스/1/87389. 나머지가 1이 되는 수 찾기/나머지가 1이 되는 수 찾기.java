//나머지가 1이 되는 가장 작은 수 찾기
class Solution {
    public int solution(int n) {
        int answer = 0;
        if(3<=n && n<=1000000){
            for(int i=1;i<=n;i++){
                if(n%i==1){
                    answer=i;
                    break;
                }
            }
            return answer;
        }
        else{
            System.out.println("n은 3~1000000 사이의 자연수여야합니다.");
            return 0;
        }
    }
}