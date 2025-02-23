package br.com.fby.repository;

import br.com.fby.domain.bank.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

    @Query(value = "SELECT * FROM FBY.tb_bank WHERE ds_bank = :description", nativeQuery = true)
    Bank findbyDescription(@Param("description") String description);
}
