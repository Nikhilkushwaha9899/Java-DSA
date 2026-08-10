public class Base7 {
     public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
    public static void main(String[] args) {
        Base7 b=new Base7();
        int num=100;
        System.out.println(b.convertToBase7(num));
    }
}