/*두 수의 곱 함수*/
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if((0<=num1 && num1<=100)&&(0<=num2 && num2 <=100)){
            answer=num1*num2;
            return answer;
        }
        else{
            System.out.println("num1과 num2는 0~100사이의 값이어야 합니다.");
            return 0;
        }
    }
}