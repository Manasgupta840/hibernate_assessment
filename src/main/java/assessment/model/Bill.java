package assessment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {
	@Id
	private String billId;
	private Double billAmount;
	private String billCurrency;
	
	
	
	public Bill() {
		
		// TODO Auto-generated constructor stub
	}



	public String getBillId() {
		return billId;
	}



	public void setBillId(String billId) {
		this.billId = billId;
	}



	public Double getBillAmount() {
		return billAmount;
	}



	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}



	public String getBillCurrency() {
		return billCurrency;
	}



	public void setBillCurrency(String billCurrency) {
		this.billCurrency = billCurrency;
	}



	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", billAmount=" + billAmount + ", billCurrency=" + billCurrency + "]";
	}
	
	
	
	

}
