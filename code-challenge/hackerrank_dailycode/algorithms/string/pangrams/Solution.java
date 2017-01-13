import java.io.*;
import java.util.*;

public class Solution {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arrPangrams = sc.nextLine().toCharArray();
        HashMap<Character, Integer> resultPangrams = new HashMap<>();
        
		for(int i=0; i<arrPangrams.length; i++) {
			if(arrPangrams[i] == ' ')
				continue;
			
			resultPangrams.put(Character.toLowerCase(arrPangrams[i]), 1);
		}
		
		if(resultPangrams.size() != 26)
			System.out.println("not pangram");
		else
			System.out.println("pangram");
    }
}