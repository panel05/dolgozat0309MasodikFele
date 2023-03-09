
package Dolgoz;

public class Dolgozo {
    private String nev;
    private int kor;
    private char neme;
    private int munk;

    public Dolgozo(String nev, int kor, char neme) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
    }

    public Dolgozo(String nev, int kor, char neme, int munk) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
        this.munk = munk;
    }
    
    public Dolgozo(String sor, String sep){
        String[] adatok = sor.split(sep);
        this.nev = adatok[0];
        this.kor = Integer.parseInt(adatok[1]);
        this.neme = adatok[2].charAt(0);
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public char getNeme() {
        return neme;
    }

    public int getMunk() {
        return munk;
    }
    
    
    
    
}
