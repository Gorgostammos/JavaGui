package no.hiof.gorgos.oblig5.models;

public class Game extends Platform{
    private String gameName;
    private String katagori;
    private double rating;



    public Game(String gameName, String katagori, double rating,String platform, String develper)
    {
        super(platform, develper);
        this.gameName = gameName;
        this.katagori = katagori;
        this.rating = rating;
    }
    @Override
    public String toString(){
        return "Game name: " + gameName + ", katagori: " + katagori + ", rating: " + rating +
                ", platform: " + getPlatformnavn() + ", devlper of the game " + getDevlper() ;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getKatagori() {
        return katagori;
    }

    public void setKatagori(String katagori) {
        this.katagori = katagori;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
