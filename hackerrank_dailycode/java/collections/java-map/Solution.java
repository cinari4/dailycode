import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		Map<String, Integer> phoneMap = new HashMap<String, Integer>();
		
		int n=in.nextInt();
		in.nextLine();
		
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			phoneMap.put(name, phone);
			in.nextLine();
		}
		
		while(in.hasNext())
		{
			String s=in.nextLine();
			if (phoneMap.containsKey(s)) {
				System.out.println(String.format("%s=%s", s, phoneMap.get(s)));
			} else {
				System.out.println("Not found");
			}
		}
	}
}