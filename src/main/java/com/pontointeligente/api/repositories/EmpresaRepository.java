package com.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.pontointeligente.api.entities.Empresa;



public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	/**
	 * 
	 * somente consulta  
	*/
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);

}
