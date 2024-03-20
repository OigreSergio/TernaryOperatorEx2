public class Main {
    public static void main(String[] args) {
        System.out.println(checkString("Test length"));
    }

    private static String checkString(String value) {
        String result = value.length() >= 10 ? "Lunghezza maggiore o uguale di 10" : "Lunghezza minore di 10";
        return result;
    }
}

