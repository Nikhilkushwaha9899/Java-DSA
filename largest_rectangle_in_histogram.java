import java.util.*;

public class largest_rectangle_in_histogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        largest_rectangle_in_histogram lrih = new largest_rectangle_in_histogram();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int heights[] = new int[n];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(lrih.largestRectangleArea(heights));
    }
}
