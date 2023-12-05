package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.projeto.*;
import med.voll.api.tag.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Tag")
public class TagController {

    @Autowired
    private TagRepository repository;
    @CrossOrigin("*")
    @PostMapping
    @Transactional
    public void CadastrarComentario(@RequestBody @Valid DadosCadastroTag dadosCadastroTag){
        repository.save(new Tag(dadosCadastroTag));
    }

    @CrossOrigin("*")
    @GetMapping
    public List<DadosListagemTag> listagemTag() {
        return repository.findAll().stream().map(DadosListagemTag::new).toList();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Object> atualizarTag(@PathVariable Long id, @RequestBody DadosAtualizarTag dadosAtualizarTag) {
        var tag = repository.getReferenceById(dadosAtualizarTag.id());
        tag.atualizarInformacoes(dadosAtualizarTag);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void ExcluirTag(@PathVariable Long id){
        repository.deleteById(id);
    }
}
