// 약수의 개수와 덧셈
// 약수의 개수를 구하는 변수를 이용해야 겠다.
// 이중 for문을 사용해서 약수의 개수를 구해야 겠다.
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left ; i <= right ; i++){
            int count = 0;
            for(int j = 1 ; j <= i ; j++){
                if(i % j == 0){
                    count++;
                }
            }
            answer += (count%2==0) ? i : -i;
        }
        
        return answer;
    }
}