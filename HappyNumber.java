package LeetcodeEasy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
	//The idea is to use one hash set to record sum of every digit square of every number occurred. Once the current sum cannot be added to set, 
	//return false; once the current sum equals 1, return true;
	//Time complexity O(log n)
	
	public boolean isHappy(int n) {        
        Set<Integer> happy = new HashSet<Integer>();
        int sumOfSquares;
        int remainder;
        
        while(happy.add(n)) {
            sumOfSquares = 0;
            while(n > 0){
                remainder = n%10;
                sumOfSquares += (remainder * remainder);
                n /= 10;
            }
            
            if(sumOfSquares == 1) {
                return true;
            }
            
            else {
                n = sumOfSquares;
            }
            
        }
        
        return false;
        
    }

}
