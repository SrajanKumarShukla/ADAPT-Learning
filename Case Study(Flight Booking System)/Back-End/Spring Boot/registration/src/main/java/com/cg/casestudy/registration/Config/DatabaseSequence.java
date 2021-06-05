package com.cg.casestudy.registration.Config;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "database_sequences")
public class DatabaseSequence {

    @Id
    private String id;
    private Long seq;
	public DatabaseSequence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DatabaseSequence(Long seq) {
		super();
		this.seq = seq;
	}
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
    
}
