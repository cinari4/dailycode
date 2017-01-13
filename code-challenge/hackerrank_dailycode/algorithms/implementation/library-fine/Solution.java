import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nowDate = sc.nextLine();
        String returnDate = sc.nextLine();
        
        System.out.println(getFine(nowDate, returnDate));
    }

	private static String getFine(String nowDate, String returnDate) {
		
		if(nowDate.equals(returnDate))
			return "0";
		
        String[] arrNowDate = nowDate.split(" ");
        String[] arrReturnDate = returnDate.split(" ");
        
        int fine = 0;
        int nowDay = Integer.valueOf(arrNowDate[0]);
        int nowMonth = Integer.valueOf(arrNowDate[1]);
        int nowYear = Integer.valueOf(arrNowDate[2]);
        
        int returnDay = Integer.valueOf(arrReturnDate[0]);
        int returnMonth = Integer.valueOf(arrReturnDate[1]);
        int returnYear = Integer.valueOf(arrReturnDate[2]);
       
        if(nowYear == returnYear) {
        	if(nowMonth == returnMonth ) {
        		if(nowDay > returnDay) 
        			fine = 15 * (nowDay - returnDay);
        	} else if(nowMonth >returnMonth) {
        		fine = 500 *(nowMonth - returnMonth);
        	}
        	
        } else if(nowYear > returnYear) {
        	fine = 10000;
        }
        
        return String.valueOf(fine);
	}
}