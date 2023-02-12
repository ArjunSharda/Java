public class Main {

    public static void main(String[] args) {
        String word = "dog";
        System.out.println(reverse(word));
    }

    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
}
