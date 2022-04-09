//package clientSide;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.net.InetAddress;
//import java.net.InetSocketAddress;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class ClientMain {
//    public static void main(String[] args) throws IOException {
//        Socket socket = new Socket("localhost",4999);
//
//        int numberOfOption;
//
//
//        Scanner scannerOption = new Scanner(System.in);
//        Scanner scannerText = new Scanner(System.in);
//        PrintWriter pr = new PrintWriter(socket.getOutputStream());
//
//        while (true){
//
//            System.out.print("Hi, select option: ");
//            numberOfOption = scannerOption.nextInt();
//            System.out.println("\n");
//
//            if (numberOfOption == 1){
//
//                System.out.print("Write id of user: "  );
//                String str = scannerText.nextLine();
//                if (str.equals("exit")){
//                    break;
//                }
//
//                pr.println(str);
//                pr.flush();
//
//            }
//
//
//
//            if (numberOfOption == 2){
//
//                System.out.print("Write id2 of user: "  );
//                String str = scannerText.nextLine();
//                if (str.equals("exit")){
//                    break;
//                }
//                pr.println(str);
//                pr.flush();
//
//            }
//
//
//        }
//
//
//
//
//
//    }
//}
//
