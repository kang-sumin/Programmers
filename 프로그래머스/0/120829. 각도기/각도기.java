//각도기 : 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return
class Solution {
    public int solution(int angle) {
        int answer = 0;
        //제한사항
        if(0<angle && angle<=180){
            if(0<angle && angle<90){
                answer=1;
            }
            else if(angle==90){
                answer=2;
            }
            else if(90<angle && angle<180){
                answer=3;
            }
            else{
                answer=4;
            }
            return answer;    
        }
        else{
            System.out.println("angle은 0~ 180 사이의 정수여야 합니다.");
            return 0;
        }
        
    }
}