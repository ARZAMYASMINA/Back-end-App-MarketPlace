package ma.fstt.marketplace.Repository;

import ma.fstt.marketplace.persistence.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    // You can add custom query methods if needed
}
