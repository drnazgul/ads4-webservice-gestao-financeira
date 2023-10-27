package br.senac.go.gestaofinanceirasenacv003.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PESSOA")
public class Pessoa {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOME", length = 120, nullable = false)
    private String nome;

    @Column(name = "ENDERECO")
    private String endereco;

    @ManyToOne(fetch = FetchType.LAZY)
    private Carteira carteira;
}
