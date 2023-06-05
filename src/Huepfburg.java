import java.util.ArrayList;
import java.util.HashMap;

public class Huepfburg {

    private static HashMap<Integer, ArrayList<Integer>> huepfer;

    public static void main(String[] args){

        huepfer = new HashMap<>();

        StringBuilder huepfburg = new StringBuilder("1 7\n" + "1 18\n" + "1 8\n" + "2 3\n" + "2 19\n" + "3 19\n" + "3 6\n" + "5 15\n" + "5 12\n" + "5 13\n" + "6 2\n" + "6 12\n" + "7 5\n" + "7 8\n" + "8 18\n" + "8 4\n" + "9 4\n" + "9 1\n" + "9 14\n" + "10 16\n" + "10 3\n" + "10 12\n" + "10 18\n" + "11 19\n" + "12 3\n" + "13 7\n" + "13 10\n" + "14 17\n" + "14 16\n" + "14 10\n" + "14 18\n" + "14 1\n" + "15 12\n" + "16 11\n" + "16 20\n" + "16 17\n" + "16 19\n" + "17 11\n" + "17 9\n" + "18 13\n" + "18 7\n" + "19 20\n" + "20 3\n" + "20 10\n");
        //Huepfer einlesen

        int eins = Integer.parseInt(huepfburg.substring(0, huepfburg.indexOf(" ")));
        int zwei = Integer.parseInt(huepfburg.substring(huepfburg.indexOf(" ")+1, huepfburg.indexOf("\n")));

        huepfburg.delete(0, huepfburg.indexOf("\n")+1);

        while(huepfburg.length() != 0){
            huepfer.computeIfAbsent(Integer.valueOf(huepfburg.substring(0, huepfburg.indexOf(" "))), k -> new ArrayList<>());
            huepfer.get(Integer.valueOf(huepfburg.substring(0, huepfburg.indexOf(" ")))).add(Integer.valueOf(huepfburg.substring(huepfburg.indexOf(" ")+1, huepfburg.indexOf("\n"))));
            huepfburg.delete(0, huepfburg.indexOf("\n")+1);
        }

        System.out.println("eins: "+eins);
        System.out.println("zwei: "+zwei);
        for(Integer in : huepfer.keySet()){
            System.out.println("From: "+in+ " to: "+huepfer.get(in));
        }

        System.out.println(testHuepfburgRekursiv(eins, zwei, -1, "Ergebnisse: \n", 3, ""));
    }

    public static String testHuepfburgRekursiv(int pos1, int pos2, int zaehler, String ergebnisse, int tiefe, String path){
        zaehler++;
        path = path+"p1: "+pos1+"/p2: "+pos2+" -> ";

        if(zaehler>tiefe) return ergebnisse;

        if(pos1 == pos2) {
            path = path.substring(0, path.length()-4);
            ergebnisse = ergebnisse+path+", \n";
            return ergebnisse;
        }

        if(huepfer.containsKey(pos1) && huepfer.containsKey(pos2)){
            for(int testpos1 : huepfer.get(pos1)){
                for(int testpos2 : huepfer.get(pos2)){
                    ergebnisse = testHuepfburgRekursiv(testpos1, testpos2, zaehler, ergebnisse, tiefe, path);
                }
            }
        }
        return ergebnisse;
    }

}
