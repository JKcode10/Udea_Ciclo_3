package com.Udea.ciclo3.Repository;

import com.Udea.ciclo3.Entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//Anotación que dice a spring que esta clase es un repositorio
public interface EmpresaRepository extends JpaRepository <Empresa,Integer>{
}
