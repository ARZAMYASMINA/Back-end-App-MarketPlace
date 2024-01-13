package ma.fstt.marketplace.persistence;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticle;

    private String libelle;
    private Double PU;

    @ManyToMany(mappedBy = "articles",fetch = FetchType.LAZY)
    private List<Store> stores;

    @ManyToMany(mappedBy = "articles",fetch = FetchType.LAZY)
    private List<Commande> commandes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCat")
    private Categorie categorie;
}
