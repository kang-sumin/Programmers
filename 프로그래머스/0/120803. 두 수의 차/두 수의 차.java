class Solution {
    public int solution(int num1, int num2) {
        //제한사항 조건문으로 설정
        if(-50000<=num1 && num1<=50000 && -50000<=num2 && num2<=50000){
            int answer=num1-num2;
            return answer;
            
        }
        else{
            //제한사항을 위반했을때 error message
            System.out.println("num1 과 num2는 -50000 ~ 50000 사이 숫자여야 합니다.");
            return 0;
        }
            
    }
}