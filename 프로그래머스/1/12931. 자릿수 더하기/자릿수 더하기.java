//자릿수 더하기
import java.util.*;
public class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] nums= new int[10];
        int num=0;
        if(n<=100000000){
            while(n>0){
                // nums[num]=n%10;
                // answer+=nums[num++];
                // n/=10;
                //간단한 코드
                answer+=n%10;
                n/=10;
            }
            return answer;
        }
        else{
            System.out.println("n은 100000000이하의 자연수여야 합니다.");
            return 0;
        }
    }
}