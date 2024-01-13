package ma.fstt.marketplace.Repository;

import ma.fstt.marketplace.persistence.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
    // You can add custom query methods if needed
}