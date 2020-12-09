package br.senai.bitatom.controllers;

import br.senai.bitatom.models.Paciente;
import br.senai.bitatom.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<Long > logar(@RequestBody Paciente paciente){
        Long logar = this.pacienteService.logar(paciente);
        return new ResponseEntity<Long>(logar, HttpStatus.OK);
    }


}
