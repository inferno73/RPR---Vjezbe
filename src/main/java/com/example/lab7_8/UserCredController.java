package com.example.lab7_8;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class UserCredController {
    public TextField imeLabel;
    public TextField prezimeLabel;
    public TextField emailLabel;
    public TextField userLabel;
    public PasswordField lozinkaLabel;
    public Button dodajBtn;
    public Button krajBtn;
    KorisniciModel model = new KorisniciModel();
    //lista korisnika, u listview prikaz ime prezime
    public boolean editovanjeOn = false;
    public ListView<Korisnik> listKorisnici = new ListView<>(); //todo za prikaz ime prezime
    @FXML
    private Label welcomeText;

    //todo automatski se mijenjaju podaci u listView prikaz ako u formi change


    public void initialize() {
        // Ime i prezime moraju biti unique i moraju biti po jedna rijec! (no spaces) npr korisnik 23 Prezime je imvalid

        listKorisnici.getSelectionModel().selectedItemProperty().addListener((obs, oldKorisnik, newKorisnik) -> {

            model.setTrenutniKorisnik(newKorisnik);
            listKorisnici.refresh();

            // Unbind previous bindings
            if(oldKorisnik!=null) {
                imeLabel.textProperty().unbindBidirectional(oldKorisnik.imeKProperty());
                prezimeLabel.textProperty().unbindBidirectional(oldKorisnik.prezimeKProperty());
                emailLabel.textProperty().unbindBidirectional(oldKorisnik.emailKProperty());
                lozinkaLabel.textProperty().unbindBidirectional(oldKorisnik.lozinkaKProperty());
                userLabel.textProperty().unbindBidirectional(oldKorisnik.usernameKProperty());
            }
            // Binding
            if (model.getTrenutniKorisnik() != null) {
                imeLabel.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeKProperty());
                prezimeLabel.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeKProperty());
                emailLabel.textProperty().bindBidirectional(model.getTrenutniKorisnik().emailKProperty());
                lozinkaLabel.textProperty().bindBidirectional(model.getTrenutniKorisnik().lozinkaKProperty());
                userLabel.textProperty().bindBidirectional(model.getTrenutniKorisnik().usernameKProperty());

                //listKorisnici.setItems(model.getLista());
            }
        });
    }


    //helper
    public Korisnik findUser(String name, String surname) {
        for(Korisnik k: model.getLista()) {
            if(k.getImeK().equals(name) && k.getPrezimeK().equals(surname)) return k;
        }
        return null;
    }
    public void listaClicked(MouseEvent mouseEvent) {
    editovanjeOn = true;

    }
    //lista click ->

    //todo check
    public void dodajClicked(ActionEvent actionEvent) {
        if(!editovanjeOn) {
            Korisnik novi = new Korisnik(imeLabel.getText(), prezimeLabel.getText(), emailLabel.getText(), userLabel.getText(), lozinkaLabel.getText());
            //ako novi
            model.getLista().add(novi);
            model.setTrenutniKorisnik(novi);

            System.out.print("User added: " + imeLabel.getText() + prezimeLabel.getText() + emailLabel.getText() + userLabel.getText() + lozinkaLabel.getText());
            listKorisnici.getItems().add(novi);
        } else {
            //izmjena samo
        }
    }

    public void krajClicked(ActionEvent actionEvent) {
    //end program
        Platform.exit();
    }

}