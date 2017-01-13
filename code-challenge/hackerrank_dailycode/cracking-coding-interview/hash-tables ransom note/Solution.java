import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		HashMap<String, Integer>map = new HashMap<>();
		
		for(int magazine_i=0; magazine_i < m; magazine_i++){
			String readWord =  in.next();
			if (map.containsKey(readWord)) {
				map.put(readWord, map.get(readWord)+1);
			} else {
				map.put(readWord, 1);
			}
		}
		
		for(int ransom_i=0; ransom_i < n; ransom_i++){
			String readWord = in.next();
			if (map.containsKey(readWord)) {
				if (map.get(readWord) >= 1) {
					map.put(readWord, map.get(readWord)-1);
				} else {
					System.out.println("No");
					return;
				}
			} else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
