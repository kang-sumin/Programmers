//두 수의 나눗셈
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double result =0;
        if((0<num1 && num1<=100)&&(0<num2 && num2<=100)){
            result = num1/(double)num2*1000;
            answer=(int)result;
            return answer;
        }
        else{
            System.out.println("num1과 num2는 0보다 크고 100이하의 정수여야 합니다.");
            return 0;
        }
    }
}