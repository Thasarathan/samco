package in.samco.stockNoteJavaSDK.payload.dto;

import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class BidAsk {

	private String number;
	private String quantity;
	private String price;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		BidAsk bidAsk = (BidAsk) o;
		return Objects.equals(number, bidAsk.number) && Objects.equals(quantity, bidAsk.quantity)
				&& Objects.equals(price, bidAsk.price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, quantity, price);
	}

	@Override
	public String toString() {
		return "BidAsk{" + "number='" + number + '\'' + ", quantity='" + quantity + '\'' + ", price='" + price + '\''
				+ '}';
	}
}
