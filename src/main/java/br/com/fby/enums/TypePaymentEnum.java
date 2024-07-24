package br.com.fby.enums;

import br.com.fby.domain.payment.type.TypePayment;
import lombok.Getter;

@Getter
public enum TypePaymentEnum {

	CASH(1L, "Cash"),
	PIX(2L, "Pix"),
	CREDIT_CARD(3L, "credit card"),
	DEBIT_CARD(4L, "debit card");
	
	private Long idTypePayment;
	private String description;
	
	TypePaymentEnum(Long id, String ds) {
		this.idTypePayment = id;
		this.description = ds;
	}
	
	public TypePayment getEntity() {
		return new TypePayment(this);
	}
}
