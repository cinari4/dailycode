import java.util.Scanner;
import java.util.regex.Pattern;

class Solution{

    private static final String IPADDRESS_PATTERN = 
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        Pattern ipPattern = Pattern.compile(IPADDRESS_PATTERN);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(ipPattern.matcher(IP).find());
        }

    }
}