// t, p : 숫자 문자열 배열
// t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
    
        // 반복 횟수 구하기
        // 수식의 간결화 및 가독성(직관적이게)을 위해 기존 int lengthNumber = t.length() - (p.length() - 1); 계산방식에서 아래 방식으로 변경함
        int lengthNumber = t.length() - p.length() + 1;
        
        for(int i = 0 ; i < lengthNumber ; i++){
            long tNumber = Long.parseLong(t.substring(i,i + p.length()));
            long pNumber = Long.parseLong(p);
            if(tNumber <= pNumber){
                answer++;
            }
        }
        
        return answer;
    }
}
