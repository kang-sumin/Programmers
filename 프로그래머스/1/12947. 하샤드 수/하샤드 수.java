//하샤드 수
import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int[] intArray = new int[5];
        int num =0;
        int sum =0;
        int harshad = x;
        int j=0;;
        if(1<=x && x<=10000){
            while(x!=0){
                num = x%10;
                intArray[j] = num;
                j++;
                x/=10;                
            }
            for(int i=0;i<j;i++){
                sum+=intArray[i];
            }
            if(harshad%sum ==0){
                System.out.println(harshad + "의 모든 자릿수의 합은 "+ sum+"입니다. " + harshad +"은 "+sum+"로 나누어 떨어지므로 "+ harshad+"은 하샤드 수입니다.");
                    return answer;
            }
            else{
                answer=false;
                return answer;
            }
            
            
        }
        else{
            System.out.println("x는 1~10000사이 정수여야 합니다.");
            answer=false;
            return answer;
        }
    }
}