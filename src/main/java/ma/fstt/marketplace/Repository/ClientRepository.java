package ma.fstt.marketplace.Repository;

import ma.fstt.marketplace.persistence.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    // You can add custom query methods if needed
}