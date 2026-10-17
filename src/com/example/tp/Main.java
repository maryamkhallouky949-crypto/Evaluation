package com.example.tp;
public class Main {
    public static void main(String[] args) {
        Client c1 = new Client(1, "Aliyyaa", "maryam");
        Client c2 = new Client(2, "Beslli", "adam");
        Voiture v1 = new Voiture("A1553", "Dacia", 400, 6);
        Voiture v2 = new Voiture("B586", "Renault", 600, 8);
        Moto m1 = new Moto("C879", "Yamaha", 200, 152);
        Vehicule[] vehicules = {v1, v2, m1};
        System.out.println(" LISTE DES VEHICULES");
        for (int i = 0; i < vehicules.length; i++) {
            System.out.println("\nVehicule " + (i + 1) + " :");
            vehicules[i].afficherDetails();
        }
        Location l1 = new Location(c1, v1, 3);
        Location l2 = new Location(c2, v2, 4);
        Location l3 = new Location(c1, m1, 5);
        Location[] locations = {l1, l2, l3};
        System.out.println(" LISTE DES LOCATIONS");
        double montantTotal = 0;

        for (int i = 0; i < locations.length; i++) {
            System.out.println("\nLocation " + (i + 1) + " :");
            locations[i].afficherRecapitulatif();
            montantTotal += locations[i].calculerMontant();
        }
        System.out.println(" MONTANT TOTAL ");
        System.out.println("Total des locations : " + montantTotal + " DH");
    }
}

