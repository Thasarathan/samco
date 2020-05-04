package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.OrderBookEntry;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class OrderBookResponse extends SimpleResponse {

	private List<OrderBookEntry> orderBookDetails;

	public List<OrderBookEntry> getOrderBookDetails() {
		return orderBookDetails;
	}

	public void setOrderBookDetails(List<OrderBookEntry> orderBookDetails) {
		this.orderBookDetails = orderBookDetails;
	}

}
