package com.Udea.ciclo3.Controller;

import com.Udea.ciclo3.Entity.Empresa;
import com.Udea.ciclo3.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ControllerAll {
    @Autowired //PARA ENLAZAR
    EmpresaService empresaService;

    @GetMapping({"/Empresas","/verEmpresas"})
    public String viewEmpresas(Model model){
      //model es que recibo cualquier cosa para trabajar
      List<Empresa> listaEmpresas=empresaService.getAllEmpresas();
      model.addAttribute("empresaList",listaEmpresas);
        return "verEmpresas";
    }

}
