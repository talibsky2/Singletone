public class Token {
    private static Token token;
    private static Token token2;
    private Token(){}
    public static Token getToken(){
        if (token == null){
            token = new Token();
        }
        return token;
    }
    public static Token getToken2(){
        if (token2 == null){
            token2 = new Token();
        }
        return token2;
    }
}
