/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.InputStream;

/**
 *
 * @author TH3OMAR
 */
public class Espece {
    private int id;
    private String nom;
    private String type;
    private String description;
    private InputStream image;
    private int Categorie;

    public Espece(int id, String nom, String type, String description, InputStream image, int Categorie) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.image = image;
        this.Categorie = Categorie;
    }

    public Espece(String nom, String type, String description, InputStream image, int Categorie) {
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.image = image;
        this.Categorie = Categorie;
    }

    public Espece(String nom, String type, String description, int Categorie) {
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.Categorie = Categorie;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
    }

    public int getCategorie() {
        return Categorie;
    }

    public void setCategorie(int Categorie) {
        this.Categorie = Categorie;
    }

    @Override
    public String toString() {
        return "Espece{" + "nom=" + nom + ", type=" + type + ", description=" + description + ", image=" + image + ", Categorie=" + Categorie + '}';
    }
    
    
    
}
