package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.CandleData;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class HistoricalCandleResponse extends SimpleResponse {

	private List<CandleData> historicalCandleData;

	public List<CandleData> getHistoricalCandleData() {
		return historicalCandleData;
	}

	public void setHistoricalCandleData(List<CandleData> historicalCandleData) {
		this.historicalCandleData = historicalCandleData;
	}

}
