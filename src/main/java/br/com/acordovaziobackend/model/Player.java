package br.com.acordovaziobackend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "overall")
    private String overall;

    @Column(name = "idade")
    private Long idade;

    @Column(name = "altura")
    private String altura;

    @Column(name = "peso")
    private String peso;

    @Column(name = "forca")
    private Long forca;

    @Column(name = "velocidade")
    private Long velocidade;

    @Column(name = "velocidade_combate")
    private Long velocidadeCombate;

    @Column(name = "agilidade")
    private Long agilidade;

    @Column(name = "resistencia")
    private Long resistencia;

    @Column(name = "qi_combate")
    private Long qiCombate;

    @Column(name = "estrategia")
    private Long estrategia;

    @Column(name = "observacao")
    private Long observacao;

    @Column(name = "estamina")
    private Long estamina;

    @Column(name = "hab_marciais")
    private Long habMarciais;

    @Column(name = "maestria")
    private Long maestria;

    @Column(name = "atq_potencial")
    private Long atqPotencial;

    @Column(name = "classe_one")
    private String classeOne;

    @Column(name = "classe_two")
    private String classeTwo;

}
