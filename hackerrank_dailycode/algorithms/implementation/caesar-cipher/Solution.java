import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        
        System.out.println(getCaesarCipher(len, sc.next(), sc.nextInt()));
        
    }

	private static String getCaesarCipher(int len, String unencryptString, int delta) {
		
		char[] arrUnencrypt = unencryptString.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<len; i++) {
			sb.append(getCaesarChiper(arrUnencrypt[i], delta));
		}
		
		return sb.toString();
	}

	private static char getCaesarChiper(char c, int delta) {
		
		if((c<65) || (c>90 && c<97) || (c>122))
			return c;
		
		if(delta>26)
			delta = delta%26;
		
		char tmp = (char)(c+delta);
		if(c>=65 && c<=90)
			if(tmp>90)
				return (char)(tmp-26);

		if(c>=97 && c<=122)
			if(tmp>122)
				return (char)(tmp-26);
		
		return tmp;
	}
	
}