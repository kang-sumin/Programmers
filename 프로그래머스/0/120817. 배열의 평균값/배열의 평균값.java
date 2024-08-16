//배열의 평균값
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        if(1<=numbers.length && numbers.length<=100){
            for(int i=0;i<numbers.length;i++){
                if(0<=numbers[i] && numbers[i]<=1000){
                    answer+=numbers[i];
                }
            }
            answer/=numbers.length;
            return answer;
        }
        else{
            System.out.println("배열의 길이는 1~100사이 여야 합니다.");
            return 0;
        }
        
    }
}