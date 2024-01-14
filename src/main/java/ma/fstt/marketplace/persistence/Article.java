package ma.fstt.marketplace.persistence;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

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

    private String description;
    private String image;
    private String libelle;
    private Double PU;

    @JsonIgnore
    @ManyToMany(mappedBy = "articles")
    private Set<Store> stores;

    @JsonIgnore
    @ManyToMany(mappedBy = "articles")
    private List<Commande> commandes;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idCat")
    private Categorie categorie;
}
