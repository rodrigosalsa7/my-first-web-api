package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    private Usuario usuario;
    public void save(Usuario usuario){
        this.usuario = usuario;
        if(usuario.getId()== null)
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println((Object) null);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um id."));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Rodrigo","password"));
        usuarios.add(new Usuario("Bruna","senha"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para locar um id."));
        return new Usuario("Rodrigo", "password");
    }

    public Usuario findByUsername(String usarname){
        System.out.println(String.format("FIND/usarname - Recebendo o usarname do id."));
        return new Usuario("Rodrigo","password");
    }
}
