package exercise2.program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.OptionalDouble;

public class Program {

    HashMap<String, Integer> map;

    public Program () {
        map = new HashMap<String, Integer>();
    }

    public void completeMapFromFile (String filePath) throws  Exception {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                String[] arrOfStr = line.split(":", 2);
                map.put(arrOfStr[0],Integer.parseInt(arrOfStr[1]));
            }
        }
        catch (IOException e){
            throw new IOException("Problem reading a line",e);
        }
        finally {
            reader. close();
        }
    }

    public void printMap() {
        for (String i : map.keySet()) {
            System.out.println("Mail : " + i + " | Score : " + map.get(i));
        }
    }

    public double getAverage() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (String i : map.keySet()) {
            al.add(map.get(i));
        }
        OptionalDouble avg = al.stream().mapToDouble(i -> i).average();
        return avg.getAsDouble();
    }

    public double getScoreFromMail(String mail) throws Exception {
        if (!map.containsKey(mail))
            throw new Exception ("No such mail in the file");
        else return map.get(mail);

    }
}
