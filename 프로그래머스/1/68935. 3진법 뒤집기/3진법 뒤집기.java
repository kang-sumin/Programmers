import java.util.Stack;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        while(n != 0 ){
            stack.push(n%3);
            n/=3;
        }
        
        while(!stack.isEmpty()){
            answer += stack.pop() * Math.pow(3,count);
            count++;
        }
        
        return answer;
    }
}