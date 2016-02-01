import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
	  Map<String, Integer> phoneBook = new HashMap<String, Integer>();
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         phoneBook.put(name, phone);
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         System.out.println(getPhoneNumber(phoneBook, s));
      }
   }
   
   public static String getPhoneNumber(Map<String,Integer> maps, String name) {
	   if(maps.get(name) == null) {
		   return "Not found";
	   } else {
		   return name + "=" + maps.get(name).toString();
	   }
   }

}
