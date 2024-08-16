//핸드폰 번호 가리기

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] charPhoneNumber = phone_number.toCharArray();
        int length = charPhoneNumber.length;
        for(int i=0;i<length;i++){
            if(i<length-4){
                charPhoneNumber[i]='*';
            }
        }
        answer = String.valueOf(charPhoneNumber);
        //answer = charPhoneNumber;
        return answer;
    }
}