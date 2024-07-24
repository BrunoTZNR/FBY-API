package br.com.fby.domain.payment;

import java.io.Serializable;

import br.com.fby.domain.bank.Bank;
import br.com.fby.domain.payment.type.TypePayment;
import br.com.fby.domain.statement.Statement;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_PAYMENT")
public class Payment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PAYMENT")
	private Long idPayment;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "ID_TYPE_PAYMENT", nullable = false)
	private TypePayment typePayment;
	
	@ManyToOne
	@JoinColumn(name = "ID_STATEMENT", nullable = false)
	private Statement statement;
	
	@ManyToOne
	@JoinColumn(name = "ID_BANK", nullable = false)
	private Bank bank;
}
