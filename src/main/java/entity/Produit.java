package entity;

import java.util.Objects;

public class Produit {
    private String ref;
    private int quantite;
    private float prixUnitaire;

    public Produit() {
        super();
    }

    public Produit(String ref, int quantite, float prixUnitaire) {
        this.ref = ref;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return ref.equals(produit.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref);
    }
}
