public class Bulb_Switcher {
    public int bulbSwitch(int n) {
        return (int)Math.pow(n,0.5);
    }
    public static void main(String[] args) {
        Bulb_Switcher bs=new Bulb_Switcher();
        int n=9;
        System.out.println(bs.bulbSwitch(n));
    }
}
