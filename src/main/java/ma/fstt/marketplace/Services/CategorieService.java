package ma.fstt.marketplace.Services;

import ma.fstt.marketplace.persistence.Categorie;

import java.util.List;

public interface CategorieService {

    List<Categorie> getAllCategories();

    Categorie getCategorieById(Long id);

    Categorie saveCategorie(Categorie categorie);

    void deleteCategorie(Long id);
}
