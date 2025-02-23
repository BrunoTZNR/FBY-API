package br.com.fby.domain.statement;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.com.fby.domain.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.fby.domain.payment.Payment;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_STATEMENT")
public class Statement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_STATEMENT")
	private Long idStatement;
	
	@NotBlank
	@Column(name = "DESCRIPTION")
	private String description;
	
	@NotNull
	@Column(name = "PURCHASE_VALUE")
	private BigDecimal purchaseValue;
	
	@NotNull
	@Column(name = "PURCHASE_DT")
	private Date purchaseDate;

	@ManyToOne
	@JoinColumn(name = "ID_USER", nullable = false)
	private User user;

	@OneToMany(mappedBy = "statement")
	@JsonIgnore
	private List<Payment> payment;
}
