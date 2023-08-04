package coreJava.Oop;

public class PoliTest {
    public static void main(String[] args) {
        Poli poli=new Poli();
        B b=new B();
        C c=new C();

        Poli x;

        x=poli;
        x.callMe();

        x=b;
        x.callMe();

        x=c;
        x.callMe();
    }
}
