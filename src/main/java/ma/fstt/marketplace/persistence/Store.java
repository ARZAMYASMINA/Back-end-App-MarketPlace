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
@Table(name = "store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStore;

    private String nom;

    @ManyToOne(fetch = FetchType.LAZY) // or FetchType.EAGER if needed
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;

    @ManyToMany(fetch = FetchType.LAZY) // or FetchType.EAGER if needed
    @JoinTable(
            name = "vente",
            joinColumns = @JoinColumn(name = "idStore"),
            inverseJoinColumns = @JoinColumn(name = "idArticle")
    )
    private List<Article> articles;


}
