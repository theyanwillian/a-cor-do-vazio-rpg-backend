package br.com.acordovaziobackend.model;

import com.sun.istack.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "team")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "coach")
    private String coach;

    @Column(name = "overall")
    private Long overall;

    @Column(name = "caracteristica")
    private String caracteristica;

    @Column(name = "stars")
    private BigDecimal stars;

    @Column(name = "defensivo")
    private Long defensivo;

    @Column(name = "ofensivo")
    private Long ofensivo;

    @Column(name = "sinergia")
    private Long sinergia;

    @Column(name = "estrategia")
    private Long estrategia;

    @Column(name = "caereo")
    private Long caereo;

    @Column(name = "tecnico")
    private Long tecnico;

    @OneToMany(orphanRemoval = true, fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "player_id")
    private List<Player> players;

}
