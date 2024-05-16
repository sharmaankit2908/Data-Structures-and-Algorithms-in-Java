public class Solution {
	public static boolean reachDestination(int sx, int sy, int dx, int dy) {
		// Write your code here
		if (sy>dy || sx>dx){
			return false;
		}
		if (sy==dy && sx==dx){
			return true;
		}

		return (reachDestination(sx + sy, sy, dx, dy) || 
                reachDestination(sx, sy + sx, dx, dy));
	}
}
