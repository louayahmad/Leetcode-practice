package LeetcodeEasy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	//Sortign array first then comparing, O(n log n) time complexity
	
	  public boolean containsDuplicate(int[] nums) {
	        Arrays.sort(nums);
	        for(int i = 0; i < nums.length - 1; i++) {
	            if (nums[i] == nums[i + 1]) {
	                return true;
	            }
	        }
	        return false;
	}
	  //Using a hash set, check if num is alreasdy in set
	  //O(n) time complexity
	  public boolean containsDuplicate(int[] nums) {
	        Set<Integer> hash = new HashSet<>(nums.length);
	        
	        for(int i : nums) {
	            
	            if (hash.contains(i)) return true;        

	            hash.add(i);          
	            
	        }
	        return false;
	    }
}


