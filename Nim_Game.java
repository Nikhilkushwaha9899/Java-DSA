public class Nim_Game {
     public boolean canWinNim(int n) {
        return n%4!=0;
    }
    public static void main(String[] args) {
        Nim_Game ng=new Nim_Game();
        int n=4;
        System.out.println(ng.canWinNim(n));
    }
}
