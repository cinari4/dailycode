import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

class Output {
	public void display(double s) {
		System.out.println(String.format("%.3f", s));		
	}
}

class Vol {
	public double main(int i) {
		return i * i * i;
	}
	
	public double main(int i, int j, int k) {
		return i * j * k;
	}
	
	public double main(double d) {
		return (2 * Math.PI * d * d * d) / 3;
	}
	
	public double main(double d, double k) {
		 return Math.PI * (d * d) * k;
	}	
}

class Calculate {
	Scanner sc = new Scanner(System.in);
	Output output = new Output();
	static Vol vol = new Vol();
	
	public int getINTVal() throws IOException {
		int tmp = sc.nextInt();
		if (tmp <= 0) {
            throw new NumberFormatException("All the values must be positive");	
		}
		return tmp;
	}

	public static Vol get_Vol() {
		return vol;
	}

	public double getDoubleVal() throws IOException {
		double tmp = sc.nextDouble();
		if (tmp <= 0) {
            throw new NumberFormatException("All the values must be positive");
		}
		return tmp;
	}
}

public class Solution
{
	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();		
		try{
			Calculate cal=new Calculate();
			int T=cal.getINTVal();
			while(T-->0){
			double volume = 0.0d;		
			int ch=cal.getINTVal();			
			if(ch==1){
				int a=cal.getINTVal();
				volume=Calculate.get_Vol().main(a);
			}
			else if(ch==2){
				int l=cal.getINTVal();
				int b=cal.getINTVal();
				int h=cal.getINTVal();
				volume=Calculate.get_Vol().main(l,b,h);
			}
			else if(ch==3){
				double r=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r);
			}
			else if(ch==4){
				double r=cal.getDoubleVal();
				double h=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r,h);
			}
			cal.output.display(volume);
			}
					
		}
		catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
		
		
	}
}
/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {
	 
    public static class ExitTrappedException extends SecurityException {
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate	
	

/* input

1
3
1.02

*/

/* output

2.223

*/

