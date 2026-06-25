import java.util.*;
public class Destroying_asteroids{
    public boolean asteroidsDestroyed(int mass, int[] asteroids){
        Arrays.sort(asteroids);
        long newmass=mass;
        for(int i=0;i<asteroids.length;i++){
            if(newmass>=asteroids[i]){
                newmass+=asteroids[i];
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Destroying_asteroids da =new Destroying_asteroids();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int mass =sc.nextInt();
        int asteroids[]=new int[n];
        for(int i=0;i<asteroids.length;i++){
            asteroids[i]=sc.nextInt();
        }
        System.out.println(da.asteroidsDestroyed(mass, asteroids));
    }
}