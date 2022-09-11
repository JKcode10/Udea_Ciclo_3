package com.Udea.ciclo3.Service;


import com.Udea.ciclo3.Entity.Empresa;
import com.Udea.ciclo3.Repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    //ver todas las empresas
    //Metodo que retornara la lista de empresas usando estados heredados dle jpaRepository
    public List<Empresa> getAllEmpresas(){
        List<Empresa> empresaList = new ArrayList<>();
        empresaRepository.findAll().forEach(empresa -> empresaList.add(empresa)); // encontramos y recoremo por medio de un for
    return empresaList;
    }
public Empresa getEmpresaById(Integer id){
        return empresaRepository.findById(id).get();
    }
//Metodo para guardar o actualizar objetos de tipo Empresa
    public boolean saveOrUpdateEmpresa(Empresa empresa){
        Empresa emp=empresaRepository.save(empresa);

    if (empresaRepository.findById(emp.getId())!=null){
        return true;
    }
    return false;
    }
// Metodo para eliminar una empresa

    public boolean deleteEmpresa(Integer id) {

        empresaRepository.deleteById(id);
            if (getEmpresaById(id) != null) {
                return false;
            }

            return true;
        }
    //editar
    //buscar
    //actualizar
    //guardar
    }


