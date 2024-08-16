import java.util.Arrays;
//정수 내림차순으로 배치하기
class Solution {
    public long solution(long n) {
        String answer = "";
        int[] result = new int[(int)(Math.log10(n)+1)];
        for(int i=0;i<result.length;i++){
            result[i]=(int)(n%10);
            n/=10;
            System.out.println(result[i]);
        }
        System.out.println(Arrays.toString(result));
        for(int i=0;i<result.length-1;i++){
            for(int j=0;j<result.length-1;j++){
                if(result[j]<result[j+1]){
                    int tmp = result[j+1];
                    result[j+1]=result[j];
                    result[j]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        
        for(int i=0;i<result.length;i++){
            answer+=result[i];
        }
        
        return Long.parseLong(answer);
        
    }
}