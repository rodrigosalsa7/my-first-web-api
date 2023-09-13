package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/users")
    public List<Usuario>getUsers(){
        return repository.findAll();

    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String usarname){
        return repository.findByUsername(usarname);
    }
}
