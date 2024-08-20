import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] alphbet = s.split("");
        
        alphbet = Arrays.stream(alphbet).sorted(Collections.reverseOrder()).toArray(String[] :: new);
        
        for(String str : alphbet){
            answer += str;
        }
        
        return answer;
    }
}