package client;

import service.ServiceMain;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 4999);
        PrintWriter pr = new PrintWriter(socket.getOutputStream());

        Scanner scannerOption = new Scanner(System.in);
        Scanner scannerTextOption1 = new Scanner(System.in);
        Scanner scannerTextOption2 = new Scanner(System.in);
        ServiceMain serviceMain = new ServiceMain();
        ArrayList arrayList = new ArrayList();


        pr.println("ok");
        pr.flush();
        while (true) {
            System.out.print("\n\n\nHi, select option \n 1) Get information by id in User table  \n 2) Get information by variable in User Table \n 3) Exit" +
                    "\n Input: ");

            int id;
            String numberOfOption = scannerOption.nextLine();
            System.out.println("\n");


            if (numberOfOption.equals("1")) {

                System.out.print("Write id of user: ");
                id = scannerTextOption1.nextInt();


                System.out.println(serviceMain.findUserById(id).toString());
                System.out.println("Info about vehicle and Insurance offers: " + serviceMain.findAllVehiclesAndInsuranceOffersByIdVehicle(id));
                pr.println(serviceMain.findUserById(id));
                pr.flush();

            }


            if (numberOfOption.equals("2")) {

                System.out.print("Write which variable you want to find user by \n 1) nick \n 2) login ");
                System.out.println("\nInput:");


                int option2 = scannerTextOption1.nextInt();

                if (option2 == 1) {

                    System.out.print("Write nick: ");
                    String str = scannerTextOption2.nextLine();

                    System.out.println(serviceMain.findUserByNick(str).toString());
                    System.out.println(serviceMain.findAllVehiclesAndInsuranceOffersByIdNickUser(str));
                    pr.println(serviceMain.findUserByNick(str));
                    pr.flush();

                }
                if (option2 == 2) {

                    System.out.print("Write login: ");
                    String str = scannerTextOption2.nextLine();

                    System.out.println(serviceMain.findUserByLogin(str).toString());
                    System.out.println(serviceMain.findAllVehiclesAndInsuranceOffersByIdLoginUser(str));
                    pr.println(serviceMain.findUserByLogin(str));
                    pr.flush();

                }


            }

            if (numberOfOption.equals("3")) {
                break;
            }


        }


    }
}

