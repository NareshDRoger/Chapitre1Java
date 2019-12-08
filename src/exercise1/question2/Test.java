package exercise1.question2;

public class Test {
    String string = "i";

    void f() {
        try {
            string += "a";
            g();
        } catch (Exception e) {
            string += "e";
        }
    }

    void g() throws Exception {
        try {
            string += "b";
            h();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            string += "d";
        }
        string += "3";
    }

    void h() throws Exception {
        throw new Exception();
    }

    void display() {
        System.out.println(string);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.f();
        test.display();
    }
}
