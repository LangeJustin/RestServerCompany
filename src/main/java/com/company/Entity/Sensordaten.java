package com.company.Entity;

/**
 * Created by user on 05.05.17.
 */
public class Sensordaten {
    private int kanal;
    private String bezeichnung;
    private String aufloesung;
    private String kopplung;
    private String beschreibung;

    public Sensordaten(int kanal, String bezeichnung, String aufloesung, String kallung, String beschreibung) {
        this.kanal = kanal;
        this.bezeichnung = bezeichnung;
        this.aufloesung = aufloesung;
        this.kopplung = kallung;
        this.beschreibung = beschreibung;
    }


    public int getKanal() {
        return kanal;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getAufloesung() {
        return aufloesung;
    }

    public String getKopplung() {
        return kopplung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
}
