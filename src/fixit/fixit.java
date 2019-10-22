/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixit;

import entites.Posteur;
import service.PosteurService;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utils.ConnexionBD;


public class fixit {

    public static void main(String[] args) {
               
        Date date = new Date(1988, 07, 11);
     Posteur p1 = new Posteur( 113, "ahmed", "bahri", "ahmed@mail.com", "4sfgba", date, 544448, "posteur", "offff");
       PosteurService p = new PosteurService();
       p.creerPosteur(p1);
       //p.supprimerPosteur(p1);
       System.out.println(p.afficherPosteur());
       Date date1 = new Date(2005, 06, 11);

       //p.modifierPosteur(new Posteur(2554, 2054, "aymen", "bahri", "aymen@mail.com", "5444hh", date1, 4554));
       //System.out.println(p.afficherPosteur());


    }

}