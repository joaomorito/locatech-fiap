package br.com.fiap.locatech.locatech.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record AluguelRequestDTO(
        @Schema(description = "Id da pessoa que esta alugando o veículo")
        @NotNull(message = "O Id da pessoa não pode ser nulo.")
        Long pessoaId,
        @NotNull(message = "O Id do veículo não pode ser nulo.")
        Long veiculoId,
        LocalDate dataInicio,
        LocalDate dataFim
) {
}
