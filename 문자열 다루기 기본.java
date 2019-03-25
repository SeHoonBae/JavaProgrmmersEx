class Solution {
  public boolean solution(String s) {
      boolean answer = true;
      
      if(s.length() == 4 || s.length() == 6){
          for(int i = 0; i < s.length(); i++){
              if( s.charAt(i) < '0' || s.charAt(i) > '9' ){
                    answer = false;
                    break;
                }
          }
        }else{
          answer = false;
      }
      
//       char[] sChar = s.toCharArray();
      
//       for(int i = 0; i < sChar.length; i++){
//           if(
//             (sChar[i] >= 'a' && sChar[i] <= 'z') 
//             || (sChar[i] >= 'A' && sChar[i] <= 'Z')
//             || (sChar[i] >= '가' && sChar[i] <= '힣')
//           ){
//               answer = false;
//               break;
//           }
//       }
      
      return answer;
  }
}