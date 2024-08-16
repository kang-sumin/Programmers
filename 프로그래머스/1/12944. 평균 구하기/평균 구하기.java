//배열 평균 구하기
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        if(1<=arr.length && arr.length<=100){
            for(int i=0;i < arr.length;i++){
                if(-10000<=arr[i] && arr[i]<=10000){
                    answer+=arr[i];
                }
            }
            answer/=arr.length;
            return answer;
        }
        else{
            System.out.println("배열의 길이는 1이상 100이하 여야 합니다.");
            return 0;
        }
        
    }
}