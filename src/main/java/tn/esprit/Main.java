package tn.esprit;

import tn.esprit.interfaces.InterfaceCRUD;
import tn.esprit.models.Personne;
import tn.esprit.services.PersonneService;
import tn.esprit.utils.MaConnexion;

public class Main {
    public static void main(String[] args) {
        Personne p = new Personne(26, "Mouldi", "Bousseta", "4 Nahj Tribunal Mhamdia");
        InterfaceCRUD ps = new PersonneService();
        ps.add2(p);
        System.out.println(ps.getAll());
    }
}