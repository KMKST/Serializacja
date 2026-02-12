package com.Biblioteka;

public class Ksiazka {

    private String tytul;
    private String autor;
    private int rokWydania;
    private boolean dostepna;

    
    public Ksiazka() {}

    public Ksiazka(String tytul, String autor, int rokWydania, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.dostepna = dostepna;
    }

    public String getTytul() { return tytul; }
    public void setTytul(String tytul) { this.tytul = tytul; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getRokWydania() { return rokWydania; }
    public void setRokWydania(int rokWydania) { this.rokWydania = rokWydania; }

    public boolean isDostepna() { return dostepna; }
    public void setDostepna(boolean dostepna) { this.dostepna = dostepna; }
}
