

import java.io.Serializable;

public class Account implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String agency;
	private String account;
	private double balance;
	private String status;
	private boolean result;
	

	public Account(String agency, String account, double balance, String status, boolean result) {
		super();
		this.agency = agency;
		this.account = account;
		this.balance = balance;
		this.status = status;
		this.result = result;
	}


	public String getAgency() {
		return agency;
	}


	public void setAgency(String agency) {
		this.agency = agency;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public boolean getResult() {
		return result;
	}


	public void setResult(boolean result) {
		this.result = result;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Account [agency=" + agency + ", account=" + account + ", balance=" + balance + ", status=" + status
				+ ", result=" + result + "]";
	}

}

