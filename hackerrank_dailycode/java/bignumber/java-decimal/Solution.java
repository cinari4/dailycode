import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

import javax.swing.text.AbstractDocument.LeafElement;
class Solution{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        ArrayList<BigDecimal> arrDecimal = new ArrayList<BigDecimal>();
        
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
            arrDecimal.add(new BigDecimal(s[i]));
        }

        Collections.sort(arrDecimal);
       
        for (int i = arrDecimal.size()-1; i >= 0; i--) {
        	System.out.println(arrDecimal.get(i));
        }
        
        /*
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
        */

    }
}

/*
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
*/
