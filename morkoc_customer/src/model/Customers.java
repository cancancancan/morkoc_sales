package model;

import java.time.LocalDateTime;

public class Customers {
	private Long	   		id;
	private LocalDateTime 	openingDate;
	private String    		firstname;
	private Double    		amount;
	private Double    		creditlimit;
	
	
	public Customers(Long id, LocalDateTime openingDate, String firstname, Double amount, Double creditlimit) {
		setId( id );
		setOpeningDate(openingDate);
		setFirstname (firstname);
		setAmount(amount);
		setCreditlimit (creditlimit);
	}
	
	public Customers( String firstname, Double amount ) {
		this( null, null, firstname, amount, null );
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId( Long id ) {
		this.id = id;
	}
	public LocalDateTime getOpeningDate() {
	
		return openingDate;
	}

	public void setOpeningDate(LocalDateTime openingDate) {
		this.openingDate = openingDate;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Double getCreditlimit() {
		return creditlimit;
	}
	
	public void setCreditlimit(Double creditlimit) {
		this.creditlimit = creditlimit;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", openingDate=" + openingDate + ", firstname=" + firstname + ", amount=" + amount
				+ ", creditlimit=" + creditlimit + "]\n";
	}
}

