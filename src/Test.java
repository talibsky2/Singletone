public class Test {
    public static void main(String[] args) {
        Token token = Token.getToken();
        System.out.println(token);
        Token token1 = Token.getToken();
        System.out.println(token1);
        Token token2 = Token.getToken();
        System.out.println(token2);

        Token token3 = Token.getToken2();
        System.out.println(token3);

    }
}