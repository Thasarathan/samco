package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.BaseResponseEntity;
import in.samco.stockNoteJavaSDK.payload.dto.IndexIntraDayCandleData;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class IndexIntraDayCandleDataResponse extends BaseResponseEntity {

	private String status;
	private String statusMessage;

	private List<IndexIntraDayCandleData> indexIntraDayCandleData;

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

	public List<IndexIntraDayCandleData> getIndexIntraDayCandleData() {
		return indexIntraDayCandleData;
	}

	public void setIndexIntraDayCandleData(List<IndexIntraDayCandleData> indexIntraDayCandleData) {
		this.indexIntraDayCandleData = indexIntraDayCandleData;
	}

	@Override
	public String toString() {
		return "IndexIntraDayCandleDataResponse [status=" + status + ", statusMessage=" + statusMessage
				+ ", indexIntraDayCandleData=" + indexIntraDayCandleData + "]";
	}

}
