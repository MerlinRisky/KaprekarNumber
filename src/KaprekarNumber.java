import java.io.*;
import java.util.*;

public class KaprekarNumber {
   static boolean find=false;
    public static void main(String[] args) {
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        for(int i=a; i <=b;i++)
        {
            long pow = (long) i*i;
           // long cek = cekValue(Integer.parseInt(pow));
               long cek = cekValue(pow);
            if(i==cek)
            {
                System.out.print(""+i+" ");
                find=true;
            }
        }
        if(find==false)
        {
            System.out.println("INVALID RANGE");      
        }
    }
    public static long cekValue(long a)
    {
        
        String c = String.valueOf(a);
        boolean hasMid=false;
        long counter=0;
        long count=0;
        long total=0;
        
       long length = String.valueOf(a).length();
        long mid=0;
        if(length==1)
        {
             mid =1;
        }
        else{
              mid = length/2;
        }
       
      
        String intValue = String.valueOf(a);
        String[] val = intValue.split("");
        for(int i=0; i < length;i++)
        {
            int value2 = Integer.parseInt(val[i].trim());
            long value=(long) value2;
            long indicator = mid-counter-1;
            if(length%2!=0 && counter==mid-1 && hasMid==false)
            {
                 count=count+(value*(int)Math.pow(10,indicator));
               //  System.out.println(count);
                
                total=total+count;
                count=0;
                counter=0;
                hasMid=true;
            }
            else if(length%2==0 && counter==mid-1 && hasMid==false)
            {
                 count=count+(value*(int)Math.pow(10,indicator));
             //    System.out.println(count);
                
                total=total+count;
                count=0;
                counter=0;
               
            }
            else if(hasMid==true)
            {
                indicator = length-mid-1;
                 count=count+(value*(int)Math.pow(10,indicator));
               //  System.out.println(count);
                total=total+count;
                count=0;
                mid++;
            }
            else
            {
                count=count+(value*(int)Math.pow(10,indicator));
              //  System.out.println(count);
                
                counter++;
            }
        }
        //System.out.println(total);
        return total;
    }
}