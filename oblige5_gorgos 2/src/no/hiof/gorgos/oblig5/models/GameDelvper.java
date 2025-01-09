package no.hiof.gorgos.oblig5.models;

public class GameDelvper extends Develper {
    private int founded;
    private String genre;
    private String notableFranchises;

    public GameDelvper(String devlper, int founded, String genre, String notableFranchises) {
        super(devlper);
        this.founded = founded;
        this.genre = genre;
        this.notableFranchises = notableFranchises;
    }

    public int getFounded() {
        return founded;

    }

    public void setFounded(int founded) {
        this.founded = founded;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNotableFranchises() {
        return notableFranchises;
    }

    public void setNotableFranchises(String notablefranchises) {
        this.notableFranchises = notablefranchises;
    }



    public String toString(){
        return "Devlper: " + getDevlper() + ", was founded: " + founded + "\n"
                +" Genra they spesify in:  " +  genre  + ", ther best franchies: " + notableFranchises;

    }
}

