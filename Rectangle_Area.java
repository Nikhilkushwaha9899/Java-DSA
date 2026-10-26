public class Rectangle_Area {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int actualArea = (Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2)) + (Math.abs(bx1 - bx2) * Math.abs(by1 - by2));
		int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
		int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
		int commonArea = overlapWidth * overlapHeight;
		return actualArea - commonArea;
    }
   public static void main(String[] args) {
    Rectangle_Area ra=new Rectangle_Area();
    int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
		System.out.println(ra.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));
   } 
}
