package pakage1;

import java.sql.*;
import java.util.*;
import java.lang.*;
import  java.io.*;

import static pakage1.Domains.INFORMATICA;
import static pakage1.Domains.MATEMATICA;


public class Test1 {
    public  static  void main(String[] args) {
// MariaDB Connection localhost, 3306;
     /*  Connection connection = null;
        ArrayList<Client> clients = new ArrayList<Client>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false","root", "pass");
            PreparedStatement statement =  connection.prepareStatement("select * from CARTI");
            ResultSet rs = statement.executeQuery();


            int numberOfClients = 0;
            while(rs.next()) {
                //System.out.println(rs.getInt("PersonID"));
              //  Book newBook = new Book(rs.getString("titlu"), rs.getString("autor"), rs.getObject(3), rs.getInt("ID"));
                //clients.add(newBook);
                numberOfClients++;
            }

            for(Client o:clients){

               // System.out.println("LastName: " + o.getLastName() + "\nFirstName: " + o.getFirstName() + "\nAge: " + o.getAge() + "\nCNP: " + o.getCNP());
                //System.out.println("\n");
                o.print();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


*/

     /*
Book myBook = new Book("adsds","Dsds",INFORMATICA,12);
        System.out.println(myBook.getDomain());


*/
     Domains myDomain = new Domains(0);
        System.out.println(myDomain.getValue());


    }

}




