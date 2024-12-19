import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 문자열 자르기
        String[] words = s.split("");
        System.out.println(Arrays.toString(words)); // 확인용 출력
        
        // 제한사항 : 문자열의 인덱스가 아닌, 단어의 공백 기준별로 짝/홀수 인덱스 판단
        int idx_count = 0;
        for(String word : words){
            idx_count = word.contains(" ") ? 0 : idx_count+1;
            if(idx_count % 2 == 0){
                answer += word.toLowerCase();
                System.out.println(answer); // 확인용 출력
            }else{
                answer += word.toUpperCase();
                System.out.println(answer); // 확인용 출력
            }
        }
        
        return answer;
    }
}