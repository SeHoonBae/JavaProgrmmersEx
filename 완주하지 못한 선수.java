import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) { //선수들 이름, 완주한 선수들 이름
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i;
        
        for(i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i]))
                return participant[i];
        }

		
        
        return participant[i];
    }
}