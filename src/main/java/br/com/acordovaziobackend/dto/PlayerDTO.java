package br.com.acordovaziobackend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class PlayerDTO implements Serializable {

    @ToString.Include
    private long id;
    private String nome;
    private String overall;
    private Long idade;
    private String altura;
    private String peso;
    private Long forca;
    private Long velocidade;
    private Long velocidadeCombate;
    private Long agilidade;
    private Long resistencia;
    private Long qiCombate;
    private Long estrategia;
    private Long observacao;
    private Long estamina;
    private Long habMarciais;
    private Long maestria;
    private Long atqPotencial;
    private String classeOne;
    private String classeTwo;
}
