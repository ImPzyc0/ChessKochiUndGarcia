import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public enum Figuren {

    NONE,
    SBAUER,
    SSPRINGER,
    SLAEUFER,
    STURM,
    SKOENIG,
    SDAME,
    WBAUER,
    WSPRINGER,
    WLAEUFER,
    WTURM,
    WKOENIG,
    WDAME;

    public List<Feld> getZüge(HashMap<Feld, Figuren> brett, Feld feld){
        //Macht es indem es die jeweilige Funktion für die Figur aufruft, die die eigentlich zurückgibt
        //Returned list von den Felderna uf die es gehen kann

        return switch (this.ordinal()) {
            case 0 -> null;
            case 1 -> sBauer(brett, feld);
            case 2 -> sSpringer(brett, feld);
            case 3 -> sLaeufer(brett, feld);
            case 4 -> sTurm(brett, feld);
            case 5 -> sKoenig(brett, feld);
            case 6 -> sDame(brett, feld);
            case 7 -> wBauer(brett, feld);
            case 8 -> wSpringer(brett, feld);
            case 9 -> wLaeufer(brett, feld);
            case 10 -> wTurm(brett, feld);
            case 11 -> wKoenig(brett, feld);
            case 12 -> wDame(brett, feld);
            default -> null;
        };

    }

    private List<Feld> sBauer(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        if (feld.name().substring(0, 1).equalsIgnoreCase("B")) {
            mZüge.add(feld.getFeld(0, 2));
        }
        mZüge.add(feld.getFeld(0, 1));
        if (feld.getFeld(1, 1) != Feld.NONE && brett.get(feld.getFeld(1, 1)).name().substring(0, 1).equalsIgnoreCase("w")) {
            mZüge.add(feld.getFeld(1, 1));
        }
        if (feld.getFeld(-1, 1) != Feld.NONE && brett.get(feld.getFeld(-1, 1)).name().substring(0, 1).equalsIgnoreCase("w")) {
            mZüge.add(feld.getFeld(-1, 1));
        }
        for (Feld feld : mzüge) {
            
        }

        return mZüge;
    }

    private List<Feld> sSpringer(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        //Guckt mithilfe der Hashmap wohin sie gehen kann

        return mZüge;
    }

    private List<Feld> sLaeufer(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        //Guckt mithilfe der Hashmap wohin sie gehen kann

        return mZüge;
    }

    private List<Feld> sTurm(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        //Guckt mithilfe der Hashmap wohin sie gehen kann

        return mZüge;
    }

    private List<Feld> sKoenig(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        //Guckt mithilfe der Hashmap wohin sie gehen kann

        return mZüge;
    }

    private List<Feld> sDame(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        //Guckt mithilfe der Hashmap wohin sie gehen kann

        return mZüge;
    }

    private List<Feld> wBauer(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        //Guckt mithilfe der Hashmap wohin sie gehen kann

        return mZüge;
    }

    private List<Feld> wSpringer(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        //Guckt mithilfe der Hashmap wohin sie gehen kann

        return mZüge;
    }

    private List<Feld> wLaeufer(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        //Guckt mithilfe der Hashmap wohin sie gehen kann

        return mZüge;
    }

    private List<Feld> wTurm(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        //Guckt mithilfe der Hashmap wohin sie gehen kann

        return mZüge;
    }

    private List<Feld> wKoenig(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        //Guckt mithilfe der Hashmap wohin sie gehen kann

        return mZüge;
    }

    private List<Feld> wDame(HashMap<Feld, Figuren> brett, Feld feld){
        List<Feld> mZüge = new ArrayList<Feld>();
        //Guckt mithilfe der Hashmap wohin sie gehen kann

        return mZüge;
    }
}
