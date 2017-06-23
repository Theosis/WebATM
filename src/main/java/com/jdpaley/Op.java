package com.jdpaley;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Op {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
//DO NOT USE NOT NULL FOR ID (validates before insertion) @NotNull
//    @Min(1)
    private Long id;

//    @NotNull
//    @Min(1)
    private Long acct;
    
//    @NotNull
//    @Size(min=1, max=1)
    private String act;
    
    private double amt;
    
//  @Size(max=50)
    private String reason;

	@Override
	public String toString() {
		return "Op [id=" + id + ", acct=" + acct + ", act=" + act + ", amt=" + amt + ", reason=" + reason + "]";
	}
		
}