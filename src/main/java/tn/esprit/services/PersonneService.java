package tn.esprit.services;

import tn.esprit.interfaces.InterfaceCRUD;
import tn.esprit.models.Personne;
import tn.esprit.utils.MaConnexion;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonneService implements InterfaceCRUD<Personne> {
    //var
    Connection cnx = MaConnexion.getInstance().getCnx();
    @Override
    public void add(Personne p) {
        String req = "INSERT INTO `Personne`(`nom`, `prenom`, `age`, `Adresse`) VALUES ('"+p.getNom()+"','"+p.getPrenom()+"',"+p.getAge()+",'"+p.getAdresse()+"')";
        try {
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Personne ajoutee avec succes!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void add2(Personne p) {
        String req = "INSERT INTO `Personne`(`nom`, `prenom`, `age`, `Adresse`) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, p.getNom());
            ps.setString(2, p.getPrenom());
            ps.setInt(3, p.getAge());
            ps.setString(4, p.getAdresse());
            ps.executeUpdate();
            System.out.println("Personne ajoutée avec succes 2");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void delete(Personne personne) {

    }

    @Override
    public void update(Personne personne) {

    }

    @Override
    public List<Personne> getAll() {
        List<Personne> personnes = new ArrayList<>();
        String req = "SELECT * FROM personne";
        try {
            Statement st = cnx.createStatement();
            ResultSet res = st.executeQuery(req);
            while (res.next()){
                Personne p =new Personne();
                p.setId(res.getInt("id"));
                p.setNom(res.getString(2));
                p.setPrenom(res.getString(3));
                p.setAge(res.getInt(4));
                p.setAdresse(res.getString(5));

                personnes.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return personnes;
    }
}
