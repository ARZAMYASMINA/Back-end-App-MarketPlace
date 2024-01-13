package ma.fstt.marketplace.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "store")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStore;

    private String nom;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "vente",
            joinColumns = @JoinColumn(name = "idStore"),
            inverseJoinColumns = @JoinColumn(name = "idArticle")
    )
    private Set<Article> articles;


}
