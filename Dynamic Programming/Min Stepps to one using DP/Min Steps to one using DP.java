// import java.util.ArrayList;

// public class Solution {

// 	public static int countMinStepsToOne(int n) {
// 		//Your code goes here
		
// 		int count =0;
// 		if (n==1){
// 			return 0;
// 		}
// 		count=1;
// 		ArrayList<ArrayList<Integer>> dp=new ArrayList<>();
// 		ArrayList<Integer> m=new ArrayList<>();
// 		m.add(1);
// 		dp.add(m);
// 		int i=0;
// 		while (true){
// 			ArrayList<Integer> subpart=new ArrayList<>();
// 			for (int j=0;j<dp.get(i).size();j++){
// 				int a=dp.get(i).get(j)+1;
// 				if (a==n){
// 					return count++;
// 				}
// 				subpart.add(a);
// 				a=dp.get(i).get(j)*2;
// 				if (a==n){
// 					return count++;
// 				}
// 				subpart.add(a);
// 				a=dp.get(i).get(j)*3;
// 				if (a==n){
// 					return count++;
// 				}
// 				subpart.add(a);	
// 			}
// 			dp.add(subpart);
// 			count++;
// 			i++;
// 		}
		
// 	}

// }
public class Solution {
	public static int countMinStepsToOne(int n,int[] bu) {
		//Your code goes here
            bu[0] = 0;
            bu[1] = 0;
            for(int i=2;i<=n;i++) {
                    int r = 1+bu[i-1];
                    if(i%2 == 0) r = Math.min(r,1+bu[i/2]);
                    if(i%3 == 0) r = Math.min(r,1+bu[i/3]);
                    bu[i] = r;
            }
            return bu[n];
	}

	public static int countMinStepsToOne(int n) {
		//Your code goes here
		int[] dp=new int[n+1];
		for (int i=0;i<=n;i++){
			dp[i]=-1;
		}
		dp[0]=0;
		dp[1]=0;
		countMinStepsToOne(n,dp);
		return dp[n];
	}

}