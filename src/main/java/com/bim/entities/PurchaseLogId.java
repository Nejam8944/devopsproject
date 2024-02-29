package com.bim.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class PurchaseLogId implements Serializable {
	
	@Column(name = "USERID")
	private int userId;
	
	@Column(name = "INVENTORYID")
	private int inventoryId;

}
