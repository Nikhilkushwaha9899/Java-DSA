import java.util.*;
public class Length_of_last_word {
     public int lengthOfLastWord(String s){
    int count=0;
        int n=s.length();
        for(int i =n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(count>0){
                break;
            }
            }
            else{
                count++;
            }
        }
        return count;}
        public static void main(String[] args) {
        Length_of_last_word lw= new Length_of_last_word(); 
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lw.lengthOfLastWord(s));
        }
}
