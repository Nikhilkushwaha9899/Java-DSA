import java.util.ArrayList;

class Permutation_in_string {
    static ArrayList<String> perms1 = new ArrayList<>();
    static ArrayList<String> perms2 = new ArrayList<>();

    public void permute1(String s, String permutation) {
        if (s.length() == 0) {
            perms1.add(permutation);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            String newString = s.substring(0, i) + s.substring(i + 1);
            permute1(newString, permutation + currentChar);
        }
    }

    public void permute2(String s, String permutation) {
        if (s.length() == 0) {
            perms2.add(permutation);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            String newString = s.substring(0, i) + s.substring(i + 1);
            permute2(newString, permutation + currentChar);
        }
    }

    public static void main(String[] args) {
        Permutation_in_string pis = new Permutation_in_string();
        pis.permute1("abc", "");
        pis.permute2("bac", "");
        System.out.println("Permuation1 : " + perms1);
        System.out.println("Permusation 2 : " + perms2);
        boolean found = false;

        for (String p : perms1) {
            if (perms2.contains(p)) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}
