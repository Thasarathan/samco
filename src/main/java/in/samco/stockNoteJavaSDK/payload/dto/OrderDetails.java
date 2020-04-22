package in.samco.stockNoteJavaSDK.payload.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class OrderDetails extends DerivativeOrder {

	@JsonIgnore
	private String symbolName;
	private String transactionType;
	private String productType;
	private String orderType;
	// private String orderValidity;
	private String quantity;
	// private String disclosedQuantity;
	private String filledQuantity;
	private String orderPrice;
	private String filledPrice;

	private String exchangeOrderNo;

	private String orderGenerationType;
	@JsonIgnore
	private String orderSource;
	private String orderValidity;
	private String orderTime;

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getFilledQuantity() {
		return filledQuantity;
	}

	public void setFilledQuantity(String filledQuantity) {
		this.filledQuantity = filledQuantity;
	}

	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getFilledPrice() {
		return filledPrice;
	}

	public void setFilledPrice(String filledPrice) {
		this.filledPrice = filledPrice;
	}

	public String getExchangeOrderNo() {
		return exchangeOrderNo;
	}

	public void setExchangeOrderNo(String exchangeOrderNo) {
		this.exchangeOrderNo = exchangeOrderNo;
	}

	public String getOrderGenerationType() {
		return orderGenerationType;
	}

	public void setOrderGenerationType(String orderGenerationType) {
		this.orderGenerationType = orderGenerationType;
	}

//	public String getOrderSource() {
//		return orderSource;
//	}
//	public void setOrderSource(String orderSource) {
//		this.orderSource = orderSource;
//	}
	public String getOrderValidity() {
		return orderValidity;
	}

	public void setOrderValidity(String orderValidity) {
		this.orderValidity = orderValidity;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "OrderDetails [transactionType=" + transactionType + ", productType=" + productType + ", orderType="
				+ orderType + ", quantity=" + quantity + ", filledQuantity=" + filledQuantity + ", orderPrice="
				+ orderPrice + ", filledPrice=" + filledPrice + ", exchangeOrderNo=" + exchangeOrderNo
				+ ", orderGenerationType=" + orderGenerationType + ", orderValidity=" + orderValidity + ", orderTime="
				+ orderTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((exchangeOrderNo == null) ? 0 : exchangeOrderNo.hashCode());
		result = prime * result + ((filledPrice == null) ? 0 : filledPrice.hashCode());
		result = prime * result + ((filledQuantity == null) ? 0 : filledQuantity.hashCode());
		result = prime * result + ((orderGenerationType == null) ? 0 : orderGenerationType.hashCode());
		result = prime * result + ((orderPrice == null) ? 0 : orderPrice.hashCode());
//		result = prime * result + ((orderSource == null) ? 0 : orderSource.hashCode());
		result = prime * result + ((orderTime == null) ? 0 : orderTime.hashCode());
		result = prime * result + ((orderType == null) ? 0 : orderType.hashCode());
		result = prime * result + ((orderValidity == null) ? 0 : orderValidity.hashCode());
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((symbolName == null) ? 0 : symbolName.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
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
		OrderDetails other = (OrderDetails) obj;
		if (exchangeOrderNo == null) {
			if (other.exchangeOrderNo != null)
				return false;
		} else if (!exchangeOrderNo.equals(other.exchangeOrderNo))
			return false;
		if (filledPrice == null) {
			if (other.filledPrice != null)
				return false;
		} else if (!filledPrice.equals(other.filledPrice))
			return false;
		if (filledQuantity == null) {
			if (other.filledQuantity != null)
				return false;
		} else if (!filledQuantity.equals(other.filledQuantity))
			return false;
		if (orderGenerationType == null) {
			if (other.orderGenerationType != null)
				return false;
		} else if (!orderGenerationType.equals(other.orderGenerationType))
			return false;
		if (orderPrice == null) {
			if (other.orderPrice != null)
				return false;
		} else if (!orderPrice.equals(other.orderPrice))
			return false;

		if (orderTime == null) {
			if (other.orderTime != null)
				return false;
		} else if (!orderTime.equals(other.orderTime))
			return false;
		if (orderType == null) {
			if (other.orderType != null)
				return false;
		} else if (!orderType.equals(other.orderType))
			return false;
		if (orderValidity == null) {
			if (other.orderValidity != null)
				return false;
		} else if (!orderValidity.equals(other.orderValidity))
			return false;
		if (productType == null) {
			if (other.productType != null)
				return false;
		} else if (!productType.equals(other.productType))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;

		if (symbolName == null) {
			if (other.symbolName != null)
				return false;
		} else if (!symbolName.equals(other.symbolName))
			return false;

		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		return true;
	}

}
