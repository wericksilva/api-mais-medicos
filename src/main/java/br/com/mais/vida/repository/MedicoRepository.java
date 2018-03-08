package br.com.mais.vida.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mais.vida.modelo.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
	
	
}
