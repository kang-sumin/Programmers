// number : 정수 배열
// 3개의 정수를 합쳐서 0이되는 조합의 개수 구하기

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        // 3중 for문을 이용해 합의 조합 만들어서 확인하기
        for(int i = 0 ; i < number.length; i++){
            for(int j = i + 1 ; j < number.length ; j++){
                for(int k = j + 1 ; k < number.length; k++){
                    if(number[i] + number[j] + number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}