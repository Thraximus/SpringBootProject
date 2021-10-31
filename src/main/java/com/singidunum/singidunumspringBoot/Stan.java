package com.singidunum.singidunumspringBoot;

public class Stan
{
    private int id;
    private String ime;
    private int brojStanovnika;
    private int kvadratura;
    private boolean prodat;

    public void setProdat(boolean prodat) {
        this.prodat = prodat;
    }

    public boolean isProdat() {
        return prodat;
    }

    public Stan(int id, String ime, int brojStanovnika, int kvadrataza, boolean prodat) {
        this.id = id;
        this.ime = ime;
        this.brojStanovnika = brojStanovnika;
        this.kvadratura = kvadrataza;
        this.prodat = prodat;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }



    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public void setKvadratura(int kvadratura) {
        this.kvadratura = kvadratura;
    }



    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getKvadratura() {
        return kvadratura;
    }

    @Override
    public String toString()
    {
        return String.format("Stan %s",ime);
    }
}
