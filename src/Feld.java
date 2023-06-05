public enum Feld {

    NONE,
    A1,A2,A3,A4,A5,A6,A7,A8,
    B1,B2,B3,B4,B5,B6,B7,B8,
    C1,C2,C3,C4,C5,C6,C7,C8,
    D1,D2,D3,D4,D5,D6,D7,D8,
    E1,E2,E3,E4,E5,E6,E7,E8,
    F1,F2,F3,F4,F5,F6,F7,F8,
    G1,G2,G3,G4,G5,G6,G7,G8,
    H1,H2,H3,H4,H5,H6,H7,H8;

    public Feld getFeld(int x, int y){

        int x1 = switch (this.name().substring(0, 1)) {
            case "A" -> 1;
            case "B" -> 2;
            case "C" -> 3;
            case "D" -> 4;
            case "E" -> 5;
            case "F" -> 6;
            case "G" -> 7;
            case "H" -> 8;
            default -> 0;
        };

        int y1 = Integer.parseInt(this.name().substring(1, 2));

        x1 = x1+x;
        y1 = y1+y;

        StringBuilder str = new StringBuilder();
        String l = "";

        switch (x1) {
            case 1 -> l = "A";
            case 2 -> l = "B";
            case 3 -> l = "C";
            case 4 -> l = "D";
            case 5 -> l = "E";
            case 6 -> l = "F";
            case 7 -> l = "G";
            case 8 -> l = "H";
            default -> {
                return NONE;
            }
        }

        if(y1 != )

        return NONE;
    }

}
