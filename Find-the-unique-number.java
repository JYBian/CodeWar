 public class Kata {
    public static double findUniq(double arr[]) {
      // Do the magic
      int length = arr.length;
      int count = 0;
      double last_ele = arr[length - 1];
      double com_ele = 0;
      
      for (int i = 0; i < length; i++)
      {
        if (arr[i] == last_ele)
        {
          com_ele = last_ele;
        }
        else
        {
          count ++;
        }
      }
      
      if (count == length - 1)
      {
        com_ele = arr[0];
      }
      
      for (int j = 0; j < length; j++)
      {
        if (arr[j] == com_ele)
        {
          continue;
        }
        else
        {
          return arr[j];
        }
      }
      
      return arr[0];
    }
}
