package med.voll.api.tag;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.projeto.DadosAtualizarProjeto;
import med.voll.api.projeto.DadosCadastroProjeto;
import med.voll.api.projeto.Projeto;

@Entity(name = "tag")
@Table(name = "tag")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Tag {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String descricao;
    String area_atuacao;
    @ManyToOne
    @JoinColumn(name = "id_projeto")
    Projeto projeto;

    public Tag(DadosCadastroTag dadosCadastroTag) {
        this.nome = dadosCadastroTag.nome();
        this.descricao = dadosCadastroTag.descricao();
        this.area_atuacao = dadosCadastroTag.area_atuacao();
        this.projeto = dadosCadastroTag.projeto();
    }

    public void atualizarInformacoes(DadosAtualizarTag dadosAtualizarTag) {
        if(dadosAtualizarTag.nome() !=  null) {
            this.nome = dadosAtualizarTag.nome();
        }
        if(dadosAtualizarTag.descricao() != null ){
            this.descricao = dadosAtualizarTag.descricao();
        }
        if(dadosAtualizarTag.area_atuacao() != null){
            this.area_atuacao = dadosAtualizarTag.area_atuacao();
        }
        if(dadosAtualizarTag.projeto() != null){
            this.projeto = dadosAtualizarTag.projeto();
        }
    }
}
