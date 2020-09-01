package com.example.springboottestdb.models;

import javax.persistence.*;
@Entity
@Table(name = "fantasyBooks")

public class Fantasy {

	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
    private String fantasyBookName;

	@Column
    private String fantasyBookAuthor;

	@Column
	private Double fantasyBookPrice;

	public Fantasy(){}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
    }
    public String getFantasyBookName() {
        return fantasyBookName;
    }


	public void setFantasyBookName(String fantasyBookName) {
		this.fantasyBookName = fantasyBookName;
	}

	public String getFantasyBookAuthor() {
		return fantasyBookAuthor;
	}

	public void setFantasyBookAuthor(String fantasyBookAuthor) {
		this.fantasyBookAuthor = fantasyBookAuthor;
	}

	public Double getFantasyBookPrice() {
		return fantasyBookPrice;
	}

	public void setFantasyBookPrice(Double fantasyBookPrice) {
		this.fantasyBookPrice = fantasyBookPrice;
	}
}
