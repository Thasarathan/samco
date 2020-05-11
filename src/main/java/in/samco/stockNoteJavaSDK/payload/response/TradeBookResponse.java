package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.TradeBookEntry;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class TradeBookResponse extends SimpleResponse {

	private List<TradeBookEntry> tradeBookDetails;

	public List<TradeBookEntry> getTradeBookDetails() {
		return tradeBookDetails;
	}

	public void setTradeBookDetails(List<TradeBookEntry> tradeBookDetails) {
		this.tradeBookDetails = tradeBookDetails;
	}
}
