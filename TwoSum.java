package LeetcodeEasy;

public class TwoSum {
	
	//Brute force, time complexiity O(n^2)
	
	public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(target - nums[i] == nums[j]) {
                    return new int [] {i, j};
                }
            }
        }
        
        throw new IllegalArgumentException("No two sum solution");
        
    }
	
	//Using two pass hashtable, O(1) time complexity
    
    public int[] twoSum(int[] nums, int target) {     
        Map <Integer, Integer> map = new HashMap <>();    
        for(int i = 0; i < nums.length; i++) {        
            map.put(nums[i], i);        
        }
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                return new int [] {i, map.get(complement)};
            }
        }        
        throw new IllegalArgumentException("No solution");          
    }  
}
