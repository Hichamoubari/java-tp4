package com.oubari.tpjdbc4.SchoolManagementIMetier;
import java.util.List;
import com.oubari.tpjdbc4.persistantClasse.Departement;
import com.oubari.tpjdbc4.persistantClasse.Professeur;
public interface IMetier {

    void addProfesseur(Professeur p);
    List<Professeur> getAllProfesseurs();
    List<Professeur> getProfesseursByDepart(int id);
    void delProfesseur(int id);
    List<Professeur> searchProf(String keyWord);

    void addDepartement(Departement d);
    List<Departement> getAllDepartements();
    Departement getDepartementById(int id);
    void delDepartement(int id);
    List<Departement> searchDep(String keyWord);

}
