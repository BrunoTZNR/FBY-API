package br.com.fby.dto;

import br.com.fby.domain.bank.Bank;

public record BankDTO(
        Long idBank,
        String description
) {
}
