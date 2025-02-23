package br.com.fby.service;

import br.com.fby.dto.BankDTO;

import java.util.List;

public interface BankService {
    BankDTO createBank(BankDTO bankDTO);

    BankDTO findOne(String description);

    List<BankDTO> listAll();
}
