// 제일 작은 수 제거하기
class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr[0];
        int minIndex = 0;
        
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length -1];
        
        // 작은 수의 인덱스 값 구하기
        for(int i =0 ; i< arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        
        // 작은 수를 제외한 나머지 값 배열에 넣어주기
        int index = 0;
        for(int i =0 ;i< arr.length; i++){
            if(i == minIndex){
                continue;
            }else{
                answer[index++]=arr[i];
            }
        }
        
        return answer;
    }
}