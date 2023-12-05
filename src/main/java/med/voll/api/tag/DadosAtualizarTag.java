package med.voll.api.tag;

import jakarta.validation.constraints.NotNull;

import med.voll.api.projeto.Projeto;

import java.util.Date;

public record DadosAtualizarTag(
        @NotNull
        Long id,
        String nome,
        String descricao,
        String area_atuacao,
        Projeto projeto


) {
}
