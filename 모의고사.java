class Solution {
    public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		for(int i=0; i<solution(answers).length; i++) System.out.println(solution(answers)[i]);
	}
	
	public static int[] solution(int[] answers) {
        int[] answer = {};
        
        int[][] giveUpMath = {
            {1,2,3,4,5}
            ,{2,1,2,3,2,4,2,5}
            ,{3,3,1,1,2,2,4,4,5,5}
        };
        
        int[] compare = {0,0,0};
        
        for(int i=0; i<answers.length; i++){
            if(answers[i]==giveUpMath[0][i%5]) compare[0]++; 
            if(answers[i]==giveUpMath[1][i%8]) compare[1]++;
            if(answers[i]==giveUpMath[2][i%10]) compare[2]++;
            
        }
        
        
        int max = Math.max(compare[0],Math.max(compare[1],compare[2]));
        int answerLength=0;
        
        for(int i=0; i<compare.length; i++) 
        	if(max==compare[i])
        		answerLength++;
        
        answer=new int[answerLength];
        
        int j=0;
        
        for(int i=0; i<compare.length; i++){
            if(max==compare[i]) {
            	answer[j]=i+1;
            	j++;
            }
        }
        
        
        return answer;
    }
}