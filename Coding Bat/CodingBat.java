public class CodingBat {

    // Below methods for each 

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
          return true;
        }
        return false;
      }

      public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile && bSmile)||(!aSmile && !bSmile)){
          return true;
        }
        return false;
      }
        
      public int sumDouble(int a, int b) {
        if(a == b) {
          return (a+b) * 2;
        }
        return a+b;
      }
      
      public int diff21(int n) {
        if(n>21) {
          return (n-21) * 2;
        }
        return 21-n;
      }

      public boolean parrotTrouble(boolean talking, int hour) {
        if(talking) {
          if(hour < 7 || hour > 20) {
            return true;
          }
        }
        return false;
        
      }
        
      public boolean makes10(int a, int b) {
        if(a == 10 || b == 10 || (a+b == 10)){
          return true;
        }
        return false;
      }

      public boolean nearHundred(int n) {
        int a = Math.abs(n-100);
        int b = Math.abs(n-200);
        
        if(a<=10 || b<=10) {
          return true;
        }
        return false;
        
      }
      
      public boolean posNeg(int a, int b, boolean negative) {
        if(a < 0 && b < 0){
          if(!negative) {
            return false;
          }else{
            return true;
          }
        }
        
        if(a < 0 || b < 0) {
          if(!negative){
            return true;  
          }
          
        }
        
        return false;
        
        
      }
      
      public String notString(String str) {
        if(str.length() < 3){
          return "not "+str;
        }
        String sub = str.substring(0,3);
        if(sub.equals("not")) {
          return str;
        }
        return "not "+str;
      }
      

      public static void main(String[] args) {
        Boolean result = sleepIn(true, false);
        System.err.println(result);
      }


}
