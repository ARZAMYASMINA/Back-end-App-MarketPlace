package ma.fstt.marketplace.Repository;
import ma.fstt.marketplace.persistence.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    // You can add custom query methods if needed
}