/*
최대공약수 : 약수 -> 공약수 -> 최대값 -> 최대 공약수
ex)
3 약수 : 1, 3
12 약수 : 1, 2, 3, 4, 6, 12 
3과 12의 최대 공약수 : 3

최소공배수 : 배수 -> 공배수 -> 최소값 -> 최소 공배수
3 배수 : 3, 6, 9, 12, 15 ...
12 배수 : 12, 24, 36, 48 ...
3과 12의 최소 공배수 : 12

최소 공배수 : n *m/최대공약수
*/


class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        // 최대 공약수
        answer[0] = gcd(max,min);
        // 최소 공배수
        answer[1] = (n*m)/answer[0];
        
        return answer;
    }
    
    // 유클리드 호제법
    public static int gcd(int p, int q){
        if(q==0) return p;
        return gcd(q, p%q);
    }
}