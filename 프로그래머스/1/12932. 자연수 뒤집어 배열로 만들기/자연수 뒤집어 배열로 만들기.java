//자연수 뒤집어 배열로 만들기
class Solution {
    public int[] solution(long n) {
        //n의 자릿수만큼 배열 크기 생성
        int[] answer = new int[(int)(Math.log10(n)+1)];
        if(n<=10000000000L){
            for(int i=0;i<answer.length;i++){
                answer[i]=(int)(n%10);
                n/=10;
            }
            return answer;
        }
        else{
            System.out.println("n은 10000000000이하의 자연수 여야 합니다.");
            return new int[0];
        }
    }
}