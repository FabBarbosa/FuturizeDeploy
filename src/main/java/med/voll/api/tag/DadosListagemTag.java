package med.voll.api.tag;

import med.voll.api.projeto.Projeto;

public record DadosListagemTag(Long id, String nome, String descricao, String area_atuacao, Projeto projeto) {
    public DadosListagemTag(Tag tag){
        this(tag.getId(), tag.getNome(), tag.getDescricao(), tag.getArea_atuacao(), tag.getProjeto());
    }

}
