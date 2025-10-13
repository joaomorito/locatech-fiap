package br.com.fiap.locatech.locatech.dtos;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record AluguelRequestDTO(
        @NotNull(message = "O Id da pessoa não pode ser nulo.")
        Long pessoaId,
        @NotNull(message = "O Id do veículo não pode ser nulo.")
        Long veiculoId,
        LocalDate dataInicio,
        LocalDate dataFim
) {
}
