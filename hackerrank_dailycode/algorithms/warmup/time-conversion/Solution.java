import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws ParseException {
    	Scanner sc = new Scanner(System.in);
    	String time = sc.next();
    	DateFormat df = new SimpleDateFormat("hh:mm:ssa");
        DateFormat out = new SimpleDateFormat("HH:mm:ss");
        Date date = df.parse(time);
        System.out.println(out.format(date));
    	
    }
}