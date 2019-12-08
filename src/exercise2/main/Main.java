package exercise2.main;

import exercise2.program.Program;

public class Main {

    public static void main (String [] args) throws Exception {
        Program program = new Program();
        program.completeMapFromFile("truc.txt");
        program.printMap();
        System.out.println(program.getAverage());
        System.out.println(program.getScoreFromMail("nareshrogeraly@gmail"));
    }
}
