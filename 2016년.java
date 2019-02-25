import java.util.Calendar;

class Solution {
  public String solution(int a, int b) {
	      String answer = "";
	      
	      Calendar calendar = Calendar.getInstance();
	      
	      calendar.set(2016,a-1,b);
	      
	      int weekNumber = calendar.get(Calendar.DAY_OF_WEEK);
	      String[] weekString = {"SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI"};
	      answer=weekString[weekNumber%7];
	      return answer;
	  }
}