package com.testinglaboratory.basics.lesson6_classes_introduction;


public class Auto {
        private String kolor;
        private int liczbaDrzwi;
        private String typ;
        private int liczbaPasazer;
        public void Auto(String kolor, int liczbaDrzwi, String typ) {
            this.kolor = kolor;
            this.liczbaDrzwi = liczbaDrzwi;
            this.typ = typ;
            this.liczbaPasazer = 0;
        }

    public Auto(int liczbaDrzwi, String typ) {
        this.liczbaDrzwi = liczbaDrzwi;
        this.typ = typ;
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
        public void zmienLiczbePasazerow(int liczbaPasazer) {
            if (liczbaPasazer > 2) {
                System.out.println("Nie ma miejsca.");
            } else {
                this.liczbaPasazer = liczbaPasazer;
            }


    }
}
