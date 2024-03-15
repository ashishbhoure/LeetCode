class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stck = new Stack<>();
        for (int a : asteroids) {
            if (a > 0) {
                stck.push(a);
            }else {
                while (!stck.isEmpty() && stck.peek() > 0 && 
                        stck.peek() < Math.abs(a)) {
                    stck.pop();
                }

                if (stck.isEmpty() || stck.peek() < 0) {
                    stck.push(a);
                } else if (stck.peek() + a == 0) {
                    stck.pop();
                }
            }
        }

        int[] res = new int[stck.size()];
        int i = stck.size() - 1;
        while (!stck.isEmpty()) {
            res[i--] = stck.peek();
            stck.pop();
        }
        return res;
    }
}