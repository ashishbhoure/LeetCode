class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>();

        for (final int num : nums) {
          minHeap.offer(num);
            // System.out.println(minHeap.peek());
          while (minHeap.size() > k)
               minHeap.poll();
            // System.out.println(" ss "+minHeap.size());
           
        }

        return minHeap.peek();
    }
}