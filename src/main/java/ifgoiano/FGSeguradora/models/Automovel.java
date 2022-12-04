package ifgoiano.FGSeguradora.models;

import ifgoiano.FGSeguradora.enums.AutomovelTipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Automovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AutomovelTipo automovelTipo;

    private String cor;

    private Double valorFipe;

    private Integer ano;

    private String placa;

    private String marca;

    private String chassi;

    private String modelo;


}
