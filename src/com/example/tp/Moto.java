package com.example.tp;

public class Moto extends Vehicule {

    private int cylindree;

    public Moto(String immatriculation, String marque,
                double tarifJournalier, int cylindree) {
        super(immatriculation, marque, tarifJournalier);
        this.cylindree = cylindree;
    }

    @Override
    public double calculerCout(int nbJours) {
        double cout = tarifJournalier * nbJours;

        if (nbJours >= 5) {
            cout = cout * 0.90;
        }

        return cout;
    }

    public int getCylindree() {
        return cylindree;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Cylindree : " + cylindree + " cm3");
    }
}
