package exercise1.question3;

public class Test {
    public static void f(String s) {
        s += "rajout";
    }

    public static String g(String s) {
        s += " texte a concatener en string";
        return s;
    }

    public static void g(StringBuffer sb) {
        sb.append(" texte a concatener en sbuffer");
    }

    public static StringBuffer h(StringBuffer sb) {
        return (sb = new StringBuffer("simple construction"));
    }

    public static void main(String[] args) {
        String string = "un premier texte";
        f(string);
        System.out.println(string);
        string = "un deuxieme texte";
        g(string);
        System.out.println(string);
        string = g(string);
        System.out.println(string);
        StringBuffer stringBuffer = new StringBuffer("construction sbuffer");
        g(stringBuffer);
        System.out.println(stringBuffer);
        stringBuffer = new StringBuffer("construction sbuffer 2");
        h(stringBuffer);
        System.out.println(stringBuffer);
        stringBuffer = h(stringBuffer);
        System.out.println(stringBuffer);
    }
}
