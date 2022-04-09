package service;

import repository.RepositoryMain;

import java.util.ArrayList;

public class ServiceMain {
    private RepositoryMain repositoryMain = new RepositoryMain();


    public ArrayList findUserById(int id) {
        return repositoryMain.findUserById(id);
    }

    public ArrayList findUserByNick(String nick) {
        return repositoryMain.findUserByNick(nick);
    }

    public ArrayList findUserByLogin(String login) {
        return repositoryMain.findUserByLogin(login);
    }

    public ArrayList findAllVehicles(int id) {
        return repositoryMain.findAllVehicles(id);
    }


    public ArrayList findAllInsuranceOffers() {
        return repositoryMain.findAllInsuranceOffers();
    }

    public String findAllVehiclesAndInsuranceOffersByIdVehicle(int idUser) {
        return repositoryMain.findAllVehiclesAndInsuranceOffersByIdVehicle(idUser);
    }


}
