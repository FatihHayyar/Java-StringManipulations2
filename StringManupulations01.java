package day10StringManupulations;

public class StringManupulations01 {
    public static void main(String[] args) {
        String a="Java kolaydir... ";
        boolean b=a.startsWith("va",2);//2.indeksten sonra islem yapar
        System.out.println("b = " + b);
        String c=a.replaceFirst("J","T");//sadece ilk harfi degistirir
        System.out.println("c = " + c);
        String d=a.concat("?"); //ekleme yapar
        System.out.println("d = " + d);
        String e=a.trim(); //basta ve sondaki bosluklari atar
        System.out.println("e = " + e);
        String f="Tava";
        String g="TAva";
       int h= f.compareTo(g); //farkini alir .asci yazdirir
       System.out.println("h = " + h);
String j=a.repeat(3);
        System.out.println("j = " + j);

    }
}
