import java.util.Stack;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        // 3진법으로 변환하여 stack 에 저장
        while(n != 0 ){
            stack.push(n%3);
            n/=3;
        }
        
        // Stack 자료구조의 LIFO(Last In First Out) 구조사용해 10진법으로 변환 
        while(!stack.isEmpty()){
            answer += stack.pop() * Math.pow(3,count);
            count++;
        }
        
        return answer;
    }
}