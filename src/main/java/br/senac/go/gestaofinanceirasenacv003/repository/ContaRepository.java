package br.senac.go.gestaofinanceirasenacv003.repository;

import br.senac.go.gestaofinanceirasenacv003.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ContaRepository extends JpaRepository <Conta, Integer> {

    public Conta getContaByDataFim(LocalDateTime dateFim);

    public Conta searchById(Integer id);
}
