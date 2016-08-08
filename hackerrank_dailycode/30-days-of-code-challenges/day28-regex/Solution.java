import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		String emailRegex = "[a-z]+@gmail\\.com$";
		Pattern pattern = Pattern.compile(emailRegex);
		List<String> result = new ArrayList<String>();
		
		for(int a0 = 0; a0 < N; a0++){
			String firstName = in.next();
			String emailID = in.next();
			
			Matcher matcher = pattern.matcher(emailID);
			if (matcher.find()){
				result.add(firstName);
			}
		}
		
		Collections.sort(result);
		for (String name : result) {
			System.out.println(name);
		}
	}
}
