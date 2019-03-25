class Solution {
  public String solution(String[] seoul) {
      String answer = "";
      
      int index = -1;
      
      for(int i = 0; i < seoul.length; i++){
          if(seoul[i].indexOf("Kim") > -1)
              index = i;
      }
      answer = "김서방은 " + index + "에 있다";
      return answer;
      
      // return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
      
  }
}