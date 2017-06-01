package com.company.Entity;

/**
 * Created by user on 05.05.17.
 */
public class Feldbus {
    private int id;
    private String bezeichnung;
    private String datentyp;
    private double offset;
    private double haeufigkeit;
    private boolean aenderung;

    public Feldbus(int id, String bezeichnung, String datentyp, double offset, double haeufigkeit, boolean aenderung) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.datentyp = datentyp;
        this.offset = offset;
        this.haeufigkeit = haeufigkeit;
        this.aenderung = aenderung;
    }

    public int getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getDatentyp() {
        return datentyp;
    }

    public double getOffset() {
        return offset;
    }

    public double getHaeufigkeit() {
        return haeufigkeit;
    }

    public boolean isAenderung() {
        return aenderung;
    }
}
