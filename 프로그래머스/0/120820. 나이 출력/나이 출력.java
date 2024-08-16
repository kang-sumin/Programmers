// 나이 출력 2022년 기준 나이로 출생연도 출력
class Solution {
    public int solution(int age) {
        int answer = 0;
        //제한 사항
        if(0<=age && age<=120){
            answer = 2022-age+1;
            return answer;
        }
        else{
            System.out.println("나이는 0~120사이 정수여야 합니다.");
            return 0;
        }
        
        
    }
}