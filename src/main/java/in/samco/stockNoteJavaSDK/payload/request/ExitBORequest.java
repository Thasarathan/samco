package in.samco.stockNoteJavaSDK.payload.request;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class ExitBORequest extends BaseRequestEntity {

	private String orderNumber;

	private String nestOrderNo;

	private String symOrderNo;

	private String orderStatus;

	public ExitBORequest() {
		super();
	}

	public ExitBORequest(String sessionToken, String orderNumber) {
		super(sessionToken);
		this.orderNumber = orderNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getNestOrderNo() {
		return nestOrderNo;
	}

	public void setNestOrderNo(String nestOrderNo) {
		this.nestOrderNo = nestOrderNo;
	}

	public String getSymOrderNo() {
		return symOrderNo;
	}

	public void setSymOrderNo(String symOrderNo) {
		this.symOrderNo = symOrderNo;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nestOrderNo == null) ? 0 : nestOrderNo.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((symOrderNo == null) ? 0 : symOrderNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExitBORequest other = (ExitBORequest) obj;
		if (nestOrderNo == null) {
			if (other.nestOrderNo != null)
				return false;
		} else if (!nestOrderNo.equals(other.nestOrderNo))
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (symOrderNo == null) {
			if (other.symOrderNo != null)
				return false;
		} else if (!symOrderNo.equals(other.symOrderNo))
			return false;
		return true;
	}

}
