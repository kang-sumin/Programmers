//두 수의 합
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if((-50000<=num1 && num1<=50000)&&(-50000<=num2 && num2<=50000)){
            answer=num1+num2;
            return answer;
        }
        else{
            System.out.println("num1과 num2는 -50000~50000사이의 정수여야 합니다.");
            return 0;
        }
        
    }
}