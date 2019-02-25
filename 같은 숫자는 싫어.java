import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        answerList.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            
                if(answerList.get(answerList.size()-1)!=arr[i])
                    answerList.add(arr[i]);
        }
        answer=new int[answerList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=answerList.get(i);
        }

        return answer;
	}
}