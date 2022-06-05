package com.app.domain;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "region")
@Data
public class Region {

	  @Id
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "name")
	    private String name;

		public Region() {
		}

		public Region(Long id, String name) {
			this.id = id;
			this.name = name;
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
	    
	    
}
