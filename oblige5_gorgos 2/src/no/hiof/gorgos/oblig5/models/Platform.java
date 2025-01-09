package no.hiof.gorgos.oblig5.models;

abstract class Platform extends Develper{
    private String platformnavn;

    public Platform(String platformnavn, String developer) {
        super(developer);
        this.platformnavn = platformnavn;
    }

    public String getPlatformnavn() {
        return platformnavn;
    }

    public void setPlatformnavn(String platformnavn) {
        this.platformnavn = platformnavn;
    }
}
