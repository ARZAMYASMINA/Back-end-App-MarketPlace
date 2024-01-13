package ma.fstt.marketplace.Repository;
import ma.fstt.marketplace.persistence.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
    // You can add custom query methods if needed
}
