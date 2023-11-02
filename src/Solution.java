class Solution {
    public int solution(int[] blocks) {
        int N = blocks.length;
        
        // First pass: compute maximum distance a frog can jump to the right
        int[] maxRightJump = new int[N];
        int runningMax = blocks[0];
        for (int i = 0; i < N; i++) {
            if (blocks[i] > runningMax) {
                runningMax = blocks[i];
            }
            maxRightJump[i] = runningMax;
        }
        
        // Second pass: compute maximum distance a frog can jump to the left
        int[] maxLeftJump = new int[N];
        runningMax = blocks[N - 1];
        for (int i = N - 1; i >= 0; i--) {
            if (blocks[i] > runningMax) {
                runningMax = blocks[i];
            }
            maxLeftJump[i] = runningMax;
        }
        
        // Compute the maximum distance between the two frogs for each block
        int maxDistance = 0;
        for (int i = 0; i < N; i++) {
            int leftDistance = i;
            while (leftDistance > 0 && blocks[leftDistance - 1] <= maxLeftJump[i]) {
                leftDistance--;
            }
            
            int rightDistance = i;
            while (rightDistance < N - 1 && blocks[rightDistance + 1] <= maxRightJump[i]) {
                rightDistance++;
            }
            
            maxDistance = Math.max(maxDistance, rightDistance - leftDistance + 1);
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