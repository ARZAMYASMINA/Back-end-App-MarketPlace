package ma.fstt.marketplace.Services;

import ma.fstt.marketplace.persistence.Fournisseur;
import ma.fstt.marketplace.persistence.Store;

import java.util.List;

public interface FournisseurService {

    List<Fournisseur> getAllFournisseurs();

    Fournisseur getFournisseurById(Long id);

    Fournisseur saveFournisseur(Fournisseur fournisseur);

    void deleteFournisseur(Long id);

}

