package repository;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;


public class RepositoryMain {

    private Connection connection;
    public static final String FILANAME = "app.properties";


    public static Connection getConnection(String connectionUrl) throws SQLException, ClassNotFoundException, IOException {

        Connection con = null;
        String url1 = "jdbc:mysql://localhost:3306/neptis";
        String user = "root";
        String password = "12345";


        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url1, user, password);

            Statement stmt = con.createStatement();
//            System.out.println("Created DB Connection....");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Fail DB Connection....");
        }

        return con;

    }


    public static String getFILANAME() {
        return FILANAME;
    }


    public ArrayList findAllUsers() {

        RepositoryMain repositoryMain = new RepositoryMain();
        Statement statement = null;
        ArrayList list = new ArrayList();
        PreparedStatement preparedStatement = null;


        try (Connection conn = RepositoryMain.getConnection(repositoryMain.getFILANAME())) {

            preparedStatement = conn.prepareStatement("Select * From users; ");
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.executeQuery("Select * From users; ");

            while (resultSet.next()) {

                StringBuilder sb = new StringBuilder();
                sb.append(" Id: ");
                sb.append(resultSet.getString(1));
                sb.append(" Nick: ");
                sb.append(resultSet.getString(2));
                sb.append(" Login: ");
                sb.append(resultSet.getString(3));
                sb.append(" Password: ");
                sb.append(resultSet.getString(4));
                sb.append(" Insert Time: ");
                sb.append(resultSet.getString(5));
                list.add(sb);

            }
            return list;

        } catch (IOException | SQLException | ClassNotFoundException e) {
            return null;
        }


    }

    public ArrayList findUserById(int id) {

        RepositoryMain repositoryMain = new RepositoryMain();
        Statement statement = null;
        ArrayList list = new ArrayList();
        PreparedStatement preparedStatement = null;


        try (Connection conn = RepositoryMain.getConnection(repositoryMain.getFILANAME())) {


            preparedStatement = conn.prepareStatement("Select * From users WHERE id = ?; ");
            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {

                StringBuilder sb = new StringBuilder();
                sb.append(" Id: ");
                sb.append(resultSet.getString(1));
                sb.append(",   Nick: ");
                sb.append(resultSet.getString(2));
                sb.append(",   Login: ");
                sb.append(resultSet.getString(3));
                sb.append(",   Password: ");
                sb.append(resultSet.getString(4));
                sb.append(",   Insert Time: ");
                sb.append(resultSet.getString(5));
                sb.append("  ");
                list.add(sb);

            }
            return list;

        } catch (IOException | SQLException | ClassNotFoundException e) {
            return null;
        }


    }


    public ArrayList findUserByNick(String nick) {

        RepositoryMain repositoryMain = new RepositoryMain();
        Statement statement = null;
        ArrayList list = new ArrayList();
        PreparedStatement preparedStatement = null;


        try (Connection conn = RepositoryMain.getConnection(repositoryMain.getFILANAME())) {

            preparedStatement = conn.prepareStatement("Select * From users WHERE nick = ?; ");
            preparedStatement.setString(1, nick);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {


                StringBuilder sb = new StringBuilder();
                sb.append(" Id: ");
                sb.append(resultSet.getString(1));
                sb.append(",   Nick: ");
                sb.append(resultSet.getString(2));
                sb.append(",   Login: ");
                sb.append(resultSet.getString(3));
                sb.append(",   Password: ");
                sb.append(resultSet.getString(4));
                sb.append(",   Insert Time: ");
                sb.append(resultSet.getString(5));
                sb.append("  ");
                list.add(sb);

            }
            return list;

        } catch (IOException | SQLException | ClassNotFoundException e) {
            return null;
        }


    }


    public ArrayList findUserByLogin(String login) {

        RepositoryMain repositoryMain = new RepositoryMain();
        Statement statement = null;
        ArrayList list = new ArrayList();
        PreparedStatement preparedStatement = null;


        try (Connection conn = RepositoryMain.getConnection(repositoryMain.getFILANAME())) {

            preparedStatement = conn.prepareStatement("Select * From users WHERE login = ?; ");
            preparedStatement.setString(1, login);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {

                StringBuilder sb = new StringBuilder();
                sb.append(" Id: ");
                sb.append(resultSet.getString(1));
                sb.append(",   Nick: ");
                sb.append(resultSet.getString(2));
                sb.append(",   Login: ");
                sb.append(resultSet.getString(3));
                sb.append(",   Password: ");
                sb.append(resultSet.getString(4));
                sb.append(",   Insert Time: ");
                sb.append(resultSet.getString(5));
                sb.append("  ");
                list.add(sb);

            }
            return list;

        } catch (IOException | SQLException | ClassNotFoundException e) {
            return null;
        }


    }


    public ArrayList findAllVehicles(int id) {

        RepositoryMain repositoryMain = new RepositoryMain();
        Statement statement = null;
        ArrayList list = new ArrayList();
        PreparedStatement preparedStatement = null;


        try (Connection conn = RepositoryMain.getConnection(repositoryMain.getFILANAME())) {

            preparedStatement = conn.prepareStatement("Select * From vehicles  ");
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.executeQuery("Select * From vehicles; ");

            while (resultSet.next()) {

                StringBuilder sb = new StringBuilder();
                sb.append(" Id: ");
                sb.append(resultSet.getString(1));
                sb.append(" Brand: ");
                sb.append(resultSet.getString(2));
                sb.append(" Model: ");
                sb.append(resultSet.getString(3));
                sb.append(" User id owner: ");
                sb.append(resultSet.getString(4));
                sb.append(" Insert time: ");
                sb.append(resultSet.getString(5));
                sb.append("  ");
                list.add(sb);

            }
            return list;

        } catch (IOException | SQLException | ClassNotFoundException e) {
            return null;
        }


    }

    public ArrayList findAllInsuranceOffers() {

        RepositoryMain repositoryMain = new RepositoryMain();
        Statement statement = null;
        ArrayList list = new ArrayList();
        PreparedStatement preparedStatement = null;


        try (Connection conn = RepositoryMain.getConnection(repositoryMain.getFILANAME())) {

            preparedStatement = conn.prepareStatement("Select * From insurance_offers  ");
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.executeQuery("Select * From insurance_offers; ");

            while (resultSet.next()) {

                StringBuilder sb = new StringBuilder();
                sb.append(" Id: ");
                sb.append(resultSet.getString(1));
                sb.append(" Insurer: ");
                sb.append(resultSet.getString(2));
                sb.append(" Price: ");
                sb.append(resultSet.getString(3));
                sb.append(" Insurance offer for car with index: ");
                sb.append(resultSet.getString(4));
                sb.append(" Insert time:");
                sb.append(resultSet.getString(5));
                sb.append("   ");
                list.add(sb);

            }
            return list;

        } catch (IOException | SQLException | ClassNotFoundException e) {
            return null;
        }


    }


    public String findAllVehiclesAndInsuranceOffersByIdVehicle(int idUser) {

        RepositoryMain repositoryMain = new RepositoryMain();
        Statement statement = null;
        ArrayList list = new ArrayList();
        ArrayList<Integer> listOfIdVehicles = new ArrayList();
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement2 = null;


        try (Connection conn = RepositoryMain.getConnection(repositoryMain.getFILANAME())) {


            preparedStatement = conn.prepareStatement("Select * From vehicles WHERE users_id = ?; ");
            preparedStatement.setInt(1, idUser);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                StringBuilder sb = new StringBuilder();
                sb.append(" Id: ");
                sb.append(resultSet.getString(1));
                listOfIdVehicles.add(resultSet.getInt(1));
                sb.append(" Brand: ");
                sb.append(resultSet.getString(2));
                sb.append(" Model: ");
                sb.append(resultSet.getString(3));
                sb.append(" User id owner: ");
                sb.append(resultSet.getString(4));
                sb.append(" Insert time: ");
                sb.append(resultSet.getString(5));
                sb.append("  ;  Vehicle: ");
                list.add(sb);

            }


            for (int i = 0; i < listOfIdVehicles.size(); i++) {

                preparedStatement2 = conn.prepareStatement("Select * From insurance_offers WHERE vehicles_id = ?; ");
                preparedStatement2.setInt(1, listOfIdVehicles.get(i));
                preparedStatement2.execute();

                ResultSet resultSet2 = preparedStatement2.executeQuery();


                while (resultSet2.next()) {

                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(" Id: ");
                    sb2.append(resultSet2.getString(1));
                    sb2.append(" Insurer: ");
                    sb2.append(resultSet2.getString(2));
                    sb2.append(" Price: ");
                    sb2.append(resultSet2.getString(3));
                    sb2.append(" Insurance offer for car with index: ");
                    sb2.append(resultSet2.getString(4));
                    sb2.append(" Insert time:");
                    sb2.append(resultSet2.getString(5));
                    sb2.append("   ");
                    list.add(sb2);

                }
            }

            String str = String.join("", list);
            return str;

        } catch (IOException | SQLException | ClassNotFoundException e) {
            return null;
        }


    }


    public static void main(String[] args) {
        RepositoryMain repositoryMain = new RepositoryMain();

//        System.out.println(repositoryMain.findUserByLogin("login1"));
//        System.out.println(repositoryMain.findAllVehicles(0));
//        System.out.println(repositoryMain.findAllInsuranceOffers());
//        System.out.println(repositoryMain.findAllVehiclesAndInsuranceOffersByIdVehicle(1));
    }


}
