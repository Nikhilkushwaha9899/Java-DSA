public class Reverse_words_string {
    public String reverse(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed;
    }

    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse(arr[i]);
        }
        return String.join(" ", arr);
    }

    public static void main(String[] args) {
        Reverse_words_string rws = new Reverse_words_string();
        String s = "Let's take LeetCode contest";
        System.out.println(rws.reverseWords(s));
    }
}
