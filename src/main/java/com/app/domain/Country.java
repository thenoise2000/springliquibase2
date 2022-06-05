package com.app.domain;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "country")
@Data
public class Country {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "iso_code")
    private String isoCode;

    @Column(name = "iso_code_test")
    private String isoCodeTest;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

	public Country() {		
	}

	public Country(Long id, String name, String code, String isoCode, String isoCodeTest, Region region) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.isoCode = isoCode;
		this.isoCodeTest = isoCodeTest;
		this.region = region;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

	public String getIsoCodeTest() {
		return isoCodeTest;
	}

	public void setIsoCodeTest(String isoCodeTest) {
		this.isoCodeTest = isoCodeTest;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
    
    

}
