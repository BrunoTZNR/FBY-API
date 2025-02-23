package br.com.fby.inteface.rest;

import br.com.fby.dto.BankDTO;
import br.com.fby.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bank")
@RequiredArgsConstructor
public class BankResource {
    @Autowired
    private final BankService bankService;

    @GetMapping("/findOne")
    public ResponseEntity<BankDTO> findOne(@RequestParam String bankDescription) {
        BankDTO bankDTO = bankService.findOne(bankDescription);

        if(bankDTO == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.status(HttpStatus.OK).body(bankDTO);
    }

    @PostMapping
    public ResponseEntity<BankDTO> create(@RequestBody BankDTO bankDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bankService.createBank(bankDTO));
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<BankDTO>> listAll() {
        return ResponseEntity.status(HttpStatus.OK).body(bankService.listAll());
    }
}
