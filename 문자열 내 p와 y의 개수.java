class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;
        
        
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P' ){
                pCount++;
            }
            else if(s.charAt(i) == 'Y' || s.charAt(i) == 'y' ){
                yCount++;
            }
        }
        if(pCount == yCount){
            answer = true;
        }
        else{
            answer = false;
        }

        return answer;
    }
}