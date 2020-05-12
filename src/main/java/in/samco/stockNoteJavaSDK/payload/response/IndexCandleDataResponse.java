package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.BaseResponseEntity;
import in.samco.stockNoteJavaSDK.payload.dto.IndexCandleData;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class IndexCandleDataResponse extends BaseResponseEntity {

	private String status;
	private String statusMessage;

	private List<IndexCandleData> indexCandleData;

	public List<IndexCandleData> getIndexCandleData() {
		return indexCandleData;
	}

	public void setIndexCandleData(List<IndexCandleData> indexCandleData) {
		this.indexCandleData = indexCandleData;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

}
