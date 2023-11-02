package Basic;

class Solution {
    public int solution(int[] blocks) {
        int N = blocks.length;
        
        int maxDistance = 0;
        for (int start = 0; start < N; start++) {
            int leftMaxHeight = blocks[start];
            int rightMaxHeight = blocks[start];
            int leftDistance = 0;
            int rightDistance = 0;
            
            // Calculate left distance
            for (int i = start; i >= 0; i--) {
            	
                if (blocks[i] >= leftMaxHeight) {
                    leftDistance++;
                    leftMaxHeight = blocks[i];
                } else {
                    break;
                }
            }
            
            // Calculate right distance
            for (int i = start; i < N; i++) {
                if (blocks[i] >= rightMaxHeight) {
                    rightDistance++;
                    rightMaxHeight = blocks[i];
                } else {
                    break;
                }
            }
            
            maxDistance = Math.max(maxDistance, leftDistance + rightDistance - 1);
        }
        
        return maxDistance;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] test1 = {2, 6, 8, 5};
        int[] test2 = {1, 5, 5, 2, 6};
        int[] test3 = {1, 1};

        System.out.println(solution.solution(test1)); // Expected output: 3
        System.out.println(solution.solution(test2)); // Expected output: 4
        System.out.println(solution.solution(test3)); // Expected output: 2
    }
}