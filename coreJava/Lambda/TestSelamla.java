package coreJava.Lambda;

public class TestSelamla {
 
    public static void main(String[] args) {
        Selamlama turkish=(kimi)->System.out.println("Merhaba, "+kimi);
        Selamlama english=(kimi)->System.out.println("Hello,"+kimi);
        Selamlama french=(kimi)->System.out.println("Bonjour,"+kimi);

        turkish.selamla("Teoman");
        english.selamla("Beyza");
        french.selamla("Demie");
    }
}
