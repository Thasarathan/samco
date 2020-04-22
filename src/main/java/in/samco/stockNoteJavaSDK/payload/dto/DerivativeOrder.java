package in.samco.stockNoteJavaSDK.payload.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class DerivativeOrder {

	private String pendingQuantity;
	private String avgExecutionPrice;
	private String orderPlacedBy;
	private String tradingSymbol;
	private String triggerPrice;
	private String exchange;
	private String totalQuantity;
	private String expiry;
	@JsonIgnore
	private String segment;

	public String getPendingQuantity() {
		return pendingQuantity;
	}

	public void setPendingQuantity(String pendingQuantity) {
		this.pendingQuantity = pendingQuantity;
	}

	public String getAvgExecutionPrice() {
		return avgExecutionPrice;
	}

	public void setAvgExecutionPrice(String avgExecutionPrice) {
		this.avgExecutionPrice = avgExecutionPrice;
	}

	public String getOrderPlacedBy() {
		return orderPlacedBy;
	}

	public void setOrderPlacedBy(String orderPlacedBy) {
		this.orderPlacedBy = orderPlacedBy;
	}

	public String getTradingSymbol() {
		return tradingSymbol;
	}

	public void setTradingSymbol(String tradingSymbol) {
		this.tradingSymbol = tradingSymbol;
	}

	public String getTriggerPrice() {
		return triggerPrice;
	}

	public void setTriggerPrice(String triggerPrice) {
		this.triggerPrice = triggerPrice;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avgExecutionPrice == null) ? 0 : avgExecutionPrice.hashCode());
		result = prime * result + ((exchange == null) ? 0 : exchange.hashCode());
		result = prime * result + ((expiry == null) ? 0 : expiry.hashCode());
		result = prime * result + ((orderPlacedBy == null) ? 0 : orderPlacedBy.hashCode());
		result = prime * result + ((pendingQuantity == null) ? 0 : pendingQuantity.hashCode());
		result = prime * result + ((totalQuantity == null) ? 0 : totalQuantity.hashCode());
		result = prime * result + ((tradingSymbol == null) ? 0 : tradingSymbol.hashCode());
		result = prime * result + ((triggerPrice == null) ? 0 : triggerPrice.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DerivativeOrder other = (DerivativeOrder) obj;
		if (avgExecutionPrice == null) {
			if (other.avgExecutionPrice != null)
				return false;
		} else if (!avgExecutionPrice.equals(other.avgExecutionPrice))
			return false;
		if (exchange == null) {
			if (other.exchange != null)
				return false;
		} else if (!exchange.equals(other.exchange))
			return false;
		if (expiry == null) {
			if (other.expiry != null)
				return false;
		} else if (!expiry.equals(other.expiry))
			return false;
		if (orderPlacedBy == null) {
			if (other.orderPlacedBy != null)
				return false;
		} else if (!orderPlacedBy.equals(other.orderPlacedBy))
			return false;
		if (pendingQuantity == null) {
			if (other.pendingQuantity != null)
				return false;
		} else if (!pendingQuantity.equals(other.pendingQuantity))
			return false;
		if (totalQuantity == null) {
			if (other.totalQuantity != null)
				return false;
		} else if (!totalQuantity.equals(other.totalQuantity))
			return false;
		if (tradingSymbol == null) {
			if (other.tradingSymbol != null)
				return false;
		} else if (!tradingSymbol.equals(other.tradingSymbol))
			return false;
		if (triggerPrice == null) {
			if (other.triggerPrice != null)
				return false;
		} else if (!triggerPrice.equals(other.triggerPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DerivativeOrder [pendingQuantity=" + pendingQuantity + ", avgExecutionPrice=" + avgExecutionPrice
				+ ", orderPlacedBy=" + orderPlacedBy + ", tradingSymbol=" + tradingSymbol + ", triggerPrice="
				+ triggerPrice + ", exchange=" + exchange + ", totalQuantity=" + totalQuantity + ", expiry=" + expiry
				+ "]";
	}

}
