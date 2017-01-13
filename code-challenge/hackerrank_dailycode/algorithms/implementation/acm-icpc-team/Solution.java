import java.util.*;

public class Solution {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String inArrSize = in.nextLine();
        int cntPerson = Integer.valueOf(inArrSize.split(" ")[0]);
        int cntTopic = Integer.valueOf(inArrSize.split(" ")[1]);
        int[][] arr = new int[cntPerson][cntTopic];
        
        for (int i = 0; i < cntPerson; i++) {
        	String tmp = in.nextLine();
        	for (int j = 0; j < cntTopic; j++) {
        		arr[i][j] = Character.getNumericValue(tmp.charAt(j));
        	}
        }
        
        int maxTopics = 0;
        int maxPerson = 0;
        for (int i = 0; i < cntPerson; i++) {
        	for (int j = i+1; j<cntPerson; j++) {
        		int tmp = getMaximumTopics(arr[i], arr[j]);
        		if (tmp > maxTopics) {
        			maxPerson = 1;
        			maxTopics = tmp;
        		} else if (tmp == maxTopics) {
        			maxPerson++;
        		}
        	}
        }
        System.out.println(maxTopics);
        System.out.println(maxPerson);
     }
     
     static int getMaximumTopics (int[] arr1, int[] arr2) {
    	 int sum = 0;
    	 for (int i = 0; i<arr1.length; i++) {
    		 if (arr1[i] != 0 || arr2[i] != 0) {
    			 sum++;
    		 }
    	 }
    	 return sum;
     } 
}