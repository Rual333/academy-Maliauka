package by.academy.classwork.lesson16;

import java.util.Date;

public class DebitCard implements Payment {
	private String issuer;
	private Long cardNo;
	private Date expiryDate;

	public DebitCard() {
		super();
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public boolean authorized(double amount) {
		return false;
	}

	@Override
	public boolean pay(double sum) {
		System.out.println(toString());
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DebitCard [issuer=").append(issuer).append(", cardNo=").append(cardNo).append(", expiryDate=")
				.append(expiryDate).append("]");
		return builder.toString();
	}

}
