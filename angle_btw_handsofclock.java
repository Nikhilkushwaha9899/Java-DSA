import java.util.*;
public class angle_btw_handsofclock{
    public double angleClock(int hour, int minutes) {
        if(hour==12){
            hour = 0;
        }
        double result = Math.abs(30*hour - 5.5*minutes);
        return Math.min(result,360-result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        angle_btw_handsofclock abmh=new angle_btw_handsofclock();
        int hour=sc.nextInt();
        int minutes=sc.nextInt();
        System.out.println(abmh.angleClock(hour, minutes));
    }
}