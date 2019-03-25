import java.util.Arrays;
class Solution {
  public String solution(String s) {
      String answer = "";
      
      String[] text = new String[s.length()];
      
      for(int i = 0; i < s.length(); i++){
          text[i] = String.valueOf(s.charAt(i));
      }
      
      Arrays.sort(text);
      
      for(int i = text.length-1; i >= 0; i--) {
    	  answer = answer + text[i];
      }
      
      return answer;
  }
}