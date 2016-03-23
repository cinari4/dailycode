import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String origStr = in.next();
       
        origStr = origStr.replaceAll("\\s","");
        
        double sqrt = Math.sqrt(origStr.length());
        int width = (int)Math.floor(sqrt);
        int height = (int)Math.ceil(sqrt);
       
        if (!(width * height >= origStr.length())) {
        	width++;
        }
        
        char[][] arrEnc = new char[width][height];
        int pos = 0;
        for (int i = 0; i < width; i++) {
        	for (int j = 0; j < height; j++) {
        		if (pos >= origStr.length()) {
        			break;
        		}
        		
        		arrEnc[i][j] = origStr.charAt(pos++);
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
        	for (int j = 0; j< width; j++) {
        		sb.append(arrEnc[j][i]);
        	}
        	sb.append(" ");
        }
        System.out.println(sb.toString());
    }
        
}
