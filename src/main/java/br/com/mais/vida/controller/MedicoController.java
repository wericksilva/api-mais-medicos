package br.com.mais.vida.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mais.vida.modelo.Medico;
import br.com.mais.vida.repository.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
	@Autowired
	MedicoRepository medicoRepository;
			
			
	// End points
	@PostMapping
	public Medico adicionar(@Valid @RequestBody Medico medico) {
		return medicoRepository.save(medico);
	}
	
	@GetMapping
	public List<Medico> listar() {
		return medicoRepository.findAll();
	}
		

}
