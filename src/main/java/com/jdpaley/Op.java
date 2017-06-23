package com.jdpaley;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

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

	public Long getAcct() {
		return acct;
	}

	public void setAcct(Long acct) {
		this.acct = acct;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Op [id=" + id + ", acct=" + acct + ", act=" + act + ", amt=" + amt + ", reason=" + reason + "]";
	}
		
}