class Solution {
  public int solution(int n) {
      int answer = 0;
      int index = 0;
      int[] arrayN = new int[n/2 +1];
		
		if(n == 2) return 1;
      else if ( n == 3 ) return 2;
		else {
            arrayN[0] = 2;
            arrayN[1] = 3;
            answer+=2;
            index+=2;
			for(int i = 5; i <= n; i=i+2) {
                
                boolean flag = true;
                
				for(int j = 1; arrayN[j] * arrayN[j] <= i; j++) {
					if(i % arrayN[j] == 0) {
                        flag = false;
						break;
					}	
				}
                if(flag){
                    arrayN[index] = i;
                    index++;
                    answer++;
                }
				
			}
				
		}
		return answer;
  }
}