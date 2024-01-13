package ma.fstt.marketplace.Repository;

import ma.fstt.marketplace.persistence.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    @Query("SELECT DISTINCT s FROM Store s JOIN FETCH s.articles")
    List<Store> findAllWithArticles();
}