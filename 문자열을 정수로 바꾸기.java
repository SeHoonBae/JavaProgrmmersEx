class Solution {
  public int solution(String s) {
      int answer = 0;
      String conversion = "";
      
      if(s.charAt(0) == '+' || s.charAt(0) == '-'){
          for(int i = 1; i < s.length(); i++){
              conversion += s.charAt(i);
          }
      }else{
          return Integer.parseInt(s);
      }
      
      return s.charAt(0) == '+' ? Integer.parseInt(conversion) : 0 - Integer.parseInt(conversion);
  }
}