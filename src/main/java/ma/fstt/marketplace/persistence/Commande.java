package ma.fstt.marketplace.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCmd;

    private String dateCmd;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client")
    private Client client;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "composit",
            joinColumns = @JoinColumn(name = "idCmd"),
            inverseJoinColumns = @JoinColumn(name = "idArticle")
    )
    private List<Article> articles;
}
