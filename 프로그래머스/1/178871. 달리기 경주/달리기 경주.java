// 선수가 바로 앞 선수를 추월할 때 : 해설진이 이름을 부름
// players 배열 : 등수 순서대로 담긴 문자열 배열
// callings 배열 : 해설진이 부른 이름이 담긴 문자열 배열

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        // map 자료구조 사용
        Map<String, Integer> ranking = new HashMap<>();
        
        // map 자료구조에 데이터 넣기
        for(int i = 0 ; i< players.length; i++){
            ranking.put(players[i], i);
        }
        
        // 경주 순위 계산
        for(String name : callings){
            // 해설진이 부른 이름의 value 값 가져오기
            int record = ranking.get(name);
            
            // 불려진 선수의 앞 선수와 순위 바꾸기
            // 앞 선수 이름 가져오기
            String frontPlayerName = answer[record-1];
            // 순위 바꾸기
            answer[record-1] = answer[record];
            ranking.replace(answer[record-1], record-1);
            
            answer[record] = frontPlayerName;
            ranking.replace(answer[record], record);
            
        }
        
        return answer;
    }
}