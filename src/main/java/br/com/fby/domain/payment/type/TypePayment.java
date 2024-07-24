package br.com.fby.domain.payment.type;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.fby.domain.payment.Payment;
import br.com.fby.enums.TypePaymentEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_TYPE_PAYMENT")
public class TypePayment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TYPE_PAYMENT")
	private Long idTypePayment;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@OneToMany(mappedBy = "typePayment")
	@JsonIgnore
	private List<Payment> payments;
	
	public TypePayment(TypePaymentEnum tpe) {
		this.idTypePayment = tpe.getIdTypePayment();
		this.description = tpe.getDescription();
	}
}
