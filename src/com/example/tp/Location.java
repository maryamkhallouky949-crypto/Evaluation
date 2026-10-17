
package com.example.tp;

public class Location {

    private Client client;
    private Vehicule vehicule;
    private int nbJours;

    // Constructeur
    public Location(Client client, Vehicule vehicule, int nbJours) {
        this.client = client;
        this.vehicule = vehicule;
        this.nbJours = nbJours;
    }

    // Calculer le montant total de la location
    public double calculerMontant() {
        return vehicule.getTarifJournalier() * nbJours;
    }

    // Afficher le récapitulatif de la location
    public void afficherRecapitulatif() {
        System.out.println("===== Récapitulatif de la location =====");

        System.out.println("Client : " + client);

        System.out.println("Véhicule : ");
        vehicule.afficherDetails();

        System.out.println("Durée : " + nbJours + " jours");

        System.out.println("Montant total : "
                + calculerMontant() + " DH");
    }
}
