//가운데 글자 가져오기
class Solution {
    public String solution(String s) {
        //문자열을 문자열 배열로 한글자씩 넣어주기
        String answer = "";
        String[] answerWord = s.split("");
        int middleIndex = 0;
        
        //가운데 인덱스값 구하고 해당 인덱스 값 문자열에 넣어주기
        // if(answerWord.length % 2 ==0){
        //     middleIndex = answerWord.length/2-1;
        //     answer = answerWord[middleIndex];
        //     answer += answerWord[middleIndex+1];
        // }else{
        //     middleIndex = answerWord.length/2;
        //     answer = answerWord[middleIndex];
        // }
        
        //substring 메서드 사용
        if(answerWord.length % 2 ==0){
            middleIndex = answerWord.length/2-1;
            answer = s.substring(middleIndex,middleIndex+2);
        }else{
            middleIndex = answerWord.length/2;
            answer = s.substring(middleIndex,middleIndex+1);
        }
        
        
        return answer;
    }
}