//없는 숫자 더하기
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp = 0;
        int sum = 0;
        
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<10;j++){
                if(numbers[i]==j){
                    temp += numbers[i];
                } 
            }
        }
        for(int i=0;i<10;i++){
            sum+=i;
        }
        answer = sum - temp;
        return answer;
    }
}