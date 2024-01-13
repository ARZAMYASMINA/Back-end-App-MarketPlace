package ma.fstt.marketplace.Services;

import ma.fstt.marketplace.persistence.Commande;

import java.util.List;

public interface CommandeService {

    List<Commande> getAllCommandes();

    Commande getCommandeById(Long id);

    Commande saveCommande(Commande commande);

    void deleteCommande(Long id);
}

