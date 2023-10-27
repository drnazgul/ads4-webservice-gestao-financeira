package br.senac.go.gestaofinanceirasenacv003.resource;

import br.senac.go.gestaofinanceirasenacv003.interfaces.IResource;
import br.senac.go.gestaofinanceirasenacv003.model.Pessoa;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.web.bind.annotation.*;


@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping(path = "/api/pessoa")
@Tag(name = "pessoa", description = "documentação da classe pessoa")
public class PessoaResource implements IResource<Pessoa, Integer> {
    @Override
    @PostMapping
    public Pessoa create(Pessoa entity) {
        return null;
    }

    @Override
    @GetMapping
    public Pessoa read(Pessoa entity) {
        return null;
    }

    @Override
    @GetMapping("/id")
    public Pessoa readById(@PathVariable("id")  Integer id) {
        return null;
    }

    @Override
    @PutMapping
    public Pessoa update(Pessoa entity) {
        return null;
    }

    @Override
    public Pessoa updatePart(Integer id, Pessoa entity) {
        return null;
    }

    @Override
    public Pessoa updateFull(Integer id, Pessoa entity) {
        return null;
    }

    @Override
    @DeleteMapping("/id")
    public void delete(@PathVariable("id") Integer id) {

    }

    @Override
    @DeleteMapping
    public void deleteByEntity(Pessoa entity) {

    }
}
