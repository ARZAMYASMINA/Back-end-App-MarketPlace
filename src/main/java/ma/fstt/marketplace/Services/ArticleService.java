package ma.fstt.marketplace.Services;

import ma.fstt.marketplace.persistence.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticles();

    Article getArticleById(Long id);

    Article saveArticle(Article article);

    void deleteArticle(Long id);


}