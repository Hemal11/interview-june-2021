package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
     int[] binaryNum = new int[1000];
   
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
   
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    return "";
  }
}
