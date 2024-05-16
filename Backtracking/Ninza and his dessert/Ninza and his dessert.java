import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.lang.*;

public class Solution {
	static int result;

	public static void helper(int current, ArrayList<Integer> toppings,int index, int target){

		if ((Math.abs(target-current) < Math.abs(target-result)) || (Math.abs(target-current)==Math.abs(target-result) && current<result)){
			result=current;
		}
		if (index==toppings.size() || current>=target){ 
			return;
		}
		helper(current, toppings, index+1, target);
		helper(current+toppings.get(index), toppings, index+1, target);
		helper(current+toppings.get(index)*2, toppings, index+1, target);
		
	}
	public static int closestCost(int n, int m, ArrayList<Integer> baseCosts, ArrayList<Integer> toppings, int target){
	    // Write your code here.

		result=baseCosts.get(0);
		for (int base:baseCosts){
			helper(base, toppings,0,target);
		}
		return result;

	}
}

