/**
 * 
 */
package com.ebspay.payments.auth.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Jagadeesh Sankaran
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ebspay_savedcards")
public class SaveCard {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id", columnDefinition = "incremental", nullable = false, unique = true)
	private long id;
	@Column(name = "expiry_month")
    private Integer expiry_month;
	@Column(name = "expiry_year")
    private Integer expiry_year;
	@Column(name = "card")
    private String card;
	@Column(name = "cardRef")
	private String cardRef;
	@Column(name = "cust_id")
	private String cust_id;
	
	public SaveCard(Integer expiry_month, Integer expiry_year, String card, String cust_id) {
		super();
		this.expiry_month = expiry_month;
		this.expiry_year = expiry_year;
		this.card = card;
		this.cust_id = cust_id;
	}
}
