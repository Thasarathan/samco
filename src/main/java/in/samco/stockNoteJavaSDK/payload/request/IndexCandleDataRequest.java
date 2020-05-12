package in.samco.stockNoteJavaSDK.payload.request;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class IndexCandleDataRequest extends BaseRequestEntity {

	private String indexName;

	private String fromDate;

	private String toDate;

	public IndexCandleDataRequest() {

	}

	public IndexCandleDataRequest(String sessionToken, String indexName, String fromDate, String toDate) {
		super(sessionToken);
		this.indexName = indexName;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

}
