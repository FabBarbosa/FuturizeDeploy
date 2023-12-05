package med.voll.api.tag;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.projeto.Projeto;

public record DadosCadastroTag(
        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        @NotBlank
        String area_atuacao,
        @NotNull
        Projeto projeto

) {

}
