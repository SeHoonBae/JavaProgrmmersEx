class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] result = new int[n];
        
        for(int i=0; i<n; i++) result[i]=1;
        
        for(int i=0; i<lost.length; i++)
        	result[lost[i]-1]--;
        	
        for(int i=0; i<reserve.length; i++) 
        	result[reserve[i]-1]++;
        
        if(result[0]==0 && result[1]>1) {
    			result[0]++;
    			result[1]--;
   		}
        
        for(int i=1; i<result.length-1; i++) {
        	if(result[i]==0) {
        		if(result[i-1] > 1) {
        			result[i-1]--;
        			result[i]++;
        		}else if(result[i+1] > 1) {
        			result[i]++;
        			result[i+1]--;
        		}
        	}
        }
        
        if(result[result.length-1]==0 && result[result.length-2] > 1 ) {
        	result[result.length-1]++;
        	result[result.length-2]--;
        }
        
        for(int i=0; i<result.length; i++)
        	if(result[i] != 0) answer++;
        
        // for(int i : result) System.out.print(i+" ");
        // System.out.println();
        // System.out.println(answer);
        
        
       return answer;
    }
}