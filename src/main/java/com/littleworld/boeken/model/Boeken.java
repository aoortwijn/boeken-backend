package com.littleworld.boeken.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Boeken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String titel;
    String auteur;
    int beoordeling;
    String datumMaand;
    String datumJaar;
    String recensie;
    String genre;

    public Boeken() {
    }

    @Override
    public String toString() {
        return "Boeken{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", auteur='" + auteur + '\'' +
                ", beoordeling=" + beoordeling +
                ", datumMaand='" + datumMaand + '\'' +
                ", datumJaar='" + datumJaar + '\'' +
                ", recensie='" + recensie + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boeken boeken = (Boeken) o;
        return id == boeken.id &&
                beoordeling == boeken.beoordeling &&
                Objects.equals(titel, boeken.titel) &&
                Objects.equals(auteur, boeken.auteur) &&
                Objects.equals(datumMaand, boeken.datumMaand) &&
                Objects.equals(datumJaar, boeken.datumJaar) &&
                Objects.equals(recensie, boeken.recensie) &&
                Objects.equals(genre, boeken.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titel, auteur, beoordeling, datumMaand, datumJaar, recensie, genre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getBeoordeling() {
        return beoordeling;
    }

    public void setBeoordeling(int beoordeling) {
        this.beoordeling = beoordeling;
    }

    public String getDatumMaand() {
        return datumMaand;
    }

    public void setDatumMaand(String datumMaand) {
        this.datumMaand = datumMaand;
    }

    public String getDatumJaar() {
        return datumJaar;
    }

    public void setDatumJaar(String datumJaar) {
        this.datumJaar = datumJaar;
    }

    public String getRecensie() {
        return recensie;
    }

    public void setRecensie(String recensie) {
        this.recensie = recensie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boeken(int id, String titel, String auteur, int beoordeling, String datumMaand, String datumJaar, String recensie, String genre) {
        this.id = id;
        this.titel = titel;
        this.auteur = auteur;
        this.beoordeling = beoordeling;
        this.datumMaand = datumMaand;
        this.datumJaar = datumJaar;
        this.recensie = recensie;
        this.genre = genre;
    }
}