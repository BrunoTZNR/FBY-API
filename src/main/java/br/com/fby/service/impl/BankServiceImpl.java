package br.com.fby.service.impl;

import br.com.fby.domain.bank.Bank;
import br.com.fby.repository.BankRepository;
import br.com.fby.dto.BankDTO;
import br.com.fby.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {
    @Autowired
    private final BankRepository bankRepository;

    @Override
    public BankDTO createBank(BankDTO bankDTO) {
        return bankRepository.save(new Bank(bankDTO.description())).toDTO();
    }

    @Override
    public BankDTO findOne(String description) {
        return bankRepository.findbyDescription(description).toDTO();
    }

    @Override
    public List<BankDTO> listAll() {
        return bankRepository.findAll().stream().map(Bank::toDTO).collect(Collectors.toList());
    }
}
