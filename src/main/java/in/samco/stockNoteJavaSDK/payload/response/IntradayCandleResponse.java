package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.IntraDayCandleData;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class IntradayCandleResponse extends SimpleResponse {

	private List<IntraDayCandleData> intradayCandleData;

	public List<IntraDayCandleData> getIntradayCandleData() {
		return intradayCandleData;
	}

	public void setIntradayCandleData(List<IntraDayCandleData> intradayCandleData) {
		this.intradayCandleData = intradayCandleData;
	}

	@Override
	public String toString() {
		return "IntradayCandleResponse [intradayCandleData=" + intradayCandleData + "]";
	}

}
