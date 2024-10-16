public class CodingBat {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
          return true;
        }
        return false;
      }

      public static void main(String[] args) {
        Boolean result = sleepIn(true, false);
        System.err.println(result);
      }
}
