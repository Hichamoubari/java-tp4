package com.oubari.tpjdbc4.schoolmanagement;


import com.oubari.tpjdbc4.SchoolManagementIMetier.IMetier;
import com.oubari.tpjdbc4.SchoolManagementIMetier.IMetierImpt;
import com.oubari.tpjdbc4.persistantClasse.Departement;
import com.oubari.tpjdbc4.persistantClasse.Professeur;

public class AppConsole {
    public static void main(String[] args) {
        IMetier metier = new IMetierImpt();

        Departement d1 = new Departement("Departement Génie Informatique");
        Departement d2 = new Departement("Departement Génie Electrique");
        metier.addDepartement(d1);
        metier.addDepartement(d2);

        metier.getAllDepartements().forEach(d -> {
            System.out.println(d);
        });
        
        Professeur p1 = new Professeur("Oubari", "Hicham", "HO12345", "Rue de x num y", "hicham@contact.me",
                                       "+212600000000", "2008-06-03");
        Professeur p2 = new Professeur("Oubari", "Ghita", "GO54321", "Rue de x num y", "ghita@contact.me",
                                       "+212600000000", "2020-06-04");
        
        metier.addProfesseur(p1);
        metier.addProfesseur(p2);
        
        metier.getAllProfesseurs().forEach(p -> {
            System.out.println(p);
        });
        
    }
}
