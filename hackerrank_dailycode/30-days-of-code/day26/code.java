import java.io.*;
import java.util.*;

class FineDate{
	int day;
	int month;
	int year;
	FineDate(String date) {
		StringTokenizer st = new StringTokenizer(date," ");
		day = Integer.parseInt(st.nextToken());
		month = Integer.parseInt(st.nextToken());
		year = Integer.parseInt(st.nextToken());
	}
}

public class Solution {

    public static void main(String[] args) {
    	Scanner sc = new Scanner (System. in);
    	FineDate nowDate = new FineDate(sc.nextLine());
    	FineDate returnDate = new FineDate(sc.nextLine());
    	
    	int sum = 0 ;
    	
    	if(nowDate.year > returnDate.year) {
    		sum += 10000;
    	} else if(nowDate.month > returnDate.month) {
    		sum += (500*(nowDate.month-returnDate.month));
    	} else if(nowDate.day > returnDate.day) {
    		sum += (15*(nowDate.day-returnDate.day));
    	}     	
    	System.out.println(sum);
    }
    
}