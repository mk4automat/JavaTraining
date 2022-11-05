package com.testinglaboratory.basics.lesson6_classes_introduction;

public class RunnableClassExcercise {

    public static void main(String[] args) {

//        ClassConventions classObjectDeclaration;
//
//        ClassConventions someClass = new ClassConventions();
//        ClassConventions classConventionsPreDef = new ClassConventions("preDef");
//
//        System.out.println(someClass);
//        System.out.println(someClass.getField());
//        System.out.println(someClass.getNumber());
//
//        System.out.println(classConventionsPreDef);
//        System.out.println(classConventionsPreDef.getField());
//        System.out.println(classConventionsPreDef.getOtherField());
//        System.out.println(classConventionsPreDef.getNumber());


        //TODO create Yours Own Class representing a Toy. (max 4 fields name,color etc.) and implements operations on it;

        MojaKlasa auto = new MojaKlasa("czarny", "4", "kombi");
        System.out.println(auto);
        System.out.println(auto.getKolor());
        System.out.println(auto.getLiczbaDrzwi());
        System.out.println(auto.getLiczbaPasazer());
        System.out.println(auto.getTyp());

        auto.zmienKolor("zielony");
        auto.zmienLiczbePasazer(6);

        System.out.println(auto);
        System.out.println(auto.getKolor());
        System.out.println(auto.getLiczbaDrzwi());
        System.out.println(auto.getLiczbaPasazer());
        System.out.println(auto.getTyp());


        MojaKlasa autobus = new MojaKlasa("czerwony", "3", "autobus");
        System.out.println(autobus);
        System.out.println(autobus.getKolor());
        System.out.println(autobus.getLiczbaDrzwi());
        System.out.println(autobus.getLiczbaPasazer());
        System.out.println(autobus.getTyp());

        autobus.zmienLiczbePasazer(6);
        System.out.println(autobus);
        System.out.println(autobus.getKolor());
        System.out.println(autobus.getLiczbaDrzwi());
        System.out.println(autobus.getLiczbaPasazer());
        System.out.println(autobus.getTyp());
    }
}
