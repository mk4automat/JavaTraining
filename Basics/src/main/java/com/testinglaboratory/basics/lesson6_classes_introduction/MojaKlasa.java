package com.testinglaboratory.basics.lesson6_classes_introduction;

public class MojaKlasa {
    private String kolor;
    private int liczbaDrzwi;
    private String typ;
    private  int liczbaPasazer;

    public MojaKlasa(String kolor, String liczbaDrzwi, String typ) {
        this.kolor = kolor;
        this.liczbaDrzwi = Integer.parseInt(liczbaDrzwi);
        this.typ = typ;
        this.liczbaPasazer = 0;
    }

    public String getKolor() {
        return kolor;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public String getTyp() {
        return typ;
    }

    public int getLiczbaPasazer() {
        return liczbaPasazer;
    }

    public void zmienKolor(String kolor) {
        this.kolor = kolor;
    }

    public void zmienLiczbePasazer(int liczbaPasazer) {
        this.liczbaPasazer = liczbaPasazer;

        if (liczbaPasazer > 5) {
            System.out.println("To je passat, a nie ikarus");
        }  else {
            System.out.println("Lecimy");
        }
    }

}
