import java.util.*;

public class Solution {
    public static int[][] subset(int input[]) {
        // Write your code here
        Arrays.sort(input); // Sort the input array to ensure lexicographically sorted output
        Set<List<Integer>> resultSet = new HashSet<>();
        generateSubsets(input, 0, new ArrayList<>(), resultSet);
        
        int[][] ans = new int[resultSet.size()][];
        int index = 0;
        for (List<Integer> subset : resultSet) {
            ans[index++] = subset.stream().mapToInt(Integer::intValue).toArray();
        }
        return ans;
    }

    private static void generateSubsets(int[] input, int index, List<Integer> current, Set<List<Integer>> resultSet) {
        if (index == input.length) {
            resultSet.add(new ArrayList<>(current));
            return;
        }

        // Exclude current element
        generateSubsets(input, index + 1, current, resultSet);

        // Include current element
        current.add(input[index]);
        generateSubsets(input, index + 1, current, resultSet);
        current.remove(current.size() - 1);
    }

    public static void printSubsets(int input[]) {
        // Write your code here
        int[][] final_ans = subset(input);
        for (int i = 0; i < final_ans.length; i++) {
            for (int j = 0; j < final_ans[i].length; j++) {
                System.out.print(final_ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
