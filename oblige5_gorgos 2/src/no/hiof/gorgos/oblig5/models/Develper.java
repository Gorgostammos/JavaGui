package no.hiof.gorgos.oblig5.models;

abstract class Develper {
    private String devlper;

    public Develper(String devlper) {
        this.devlper = devlper;
    }

    public String getDevlper() {
        return devlper;
    }

    public void setDevlper(String devlper) {
        this.devlper = devlper;
    }
}
