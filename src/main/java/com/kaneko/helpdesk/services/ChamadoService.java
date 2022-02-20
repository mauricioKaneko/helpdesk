package com.kaneko.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaneko.helpdesk.domain.Chamado;
import com.kaneko.helpdesk.repositories.ChamadoRepository;
import com.kaneko.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class ChamadoService {
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = chamadoRepository.findById(id);
		return obj.orElseThrow(()->new ObjectNotFoundException("Chamado não encontrado! ID: " + id));
	}
}
