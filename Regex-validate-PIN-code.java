public class Solution {

  public static boolean validatePin(String pin) {
    
    int length = pin.length();
    char[] pin1 = pin.toCharArray();
    
    if (length != 4 && length != 6)
    {
      return false;
    }
    
    for (int i = 0; i < length; i ++)
    {
     switch(pin1[i])
     {
       case '0':
         break;
       case '1':
         break;
       case '2':
         break;
       case '3':
         break;
       case '4':
         break;
       case '5':
         break;
       case '6':
         break;
       case '7':
         break;
       case '8':
         break;
       case '9':
         break;
       default:
         return false;
     }
    }

      return true;
    
  }

}
