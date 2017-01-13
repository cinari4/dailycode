import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
	private static Singleton instance = null;
	
	public String str;
	
	public static Singleton getSingleInstance() {
		if (null == instance) {
			instance = new Singleton();
		}
		return instance;
	}
	
	private Singleton() {
		
	}
	
}

