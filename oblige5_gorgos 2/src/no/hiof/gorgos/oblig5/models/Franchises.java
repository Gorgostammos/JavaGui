package no.hiof.gorgos.oblig5.models;

public class Franchises extends Game{

    private String name;
    private int antallSpille;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAntallSpille() {
        return antallSpille;
    }

    public void setAntallSpille(int antallSpille) {
        this.antallSpille = antallSpille;
    }

    public Franchises(String gameName, String katagori, double rating, String name, int antall_Spille,
                      String platform, String develeper){
        super(gameName, katagori, rating,platform, develeper );

        this.name = name;
        this.antallSpille = antall_Spille;
    }
    @Override
    public String toString(){
        return "Franchises: " + name + ", Nyeste game: " + getGameName() + "\n"
                +", katagori: " + getKatagori() + ", rating: " + getRating() + "Antall spill Franchises har: "
                + antallSpille + ", develper: "   + getDevlper();

    }
}
