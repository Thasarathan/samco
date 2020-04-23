package in.samco.stockNoteJavaSDK.payload.response;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.BaseResponseEntity;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class LoginResponse extends BaseResponseEntity {

	private String sessionToken;
	private String accountID;
	private String accountName;
	private String defaultMarketWatch;
	@JsonIgnore
	private String brokerName;
	@JsonIgnore
	private String alertCount;

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	private List<String> exchangeList = new ArrayList();
	private List<String> orderTypeList = new ArrayList();
	private List<String> productList = new ArrayList();
	@JsonIgnore
	private String samcoSessionId;
	@JsonIgnore
	private String branchID;
	@JsonIgnore
	private String defaultProductAlias;
	@JsonIgnore
	private String passwordResetFlg;
	private String status;

	public String getDefaultProductAlias() {
		return defaultProductAlias;
	}

	public void setDefaultProductAlias(String defaultProductAlias) {
		this.defaultProductAlias = defaultProductAlias;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getDefaultMarketWatch() {
		return defaultMarketWatch;
	}

	public void setDefaultMarketWatch(String defaultMarketWatch) {
		this.defaultMarketWatch = defaultMarketWatch;
	}

	public String getBrokerName() {
		return brokerName;
	}

	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

	public String getAlertCount() {
		return alertCount;
	}

	public void setAlertCount(String alertCount) {
		this.alertCount = alertCount;
	}

	public List<String> getExchangeList() {
		return exchangeList;
	}

	public void setExchangeList(List<String> exchanges) {
		this.exchangeList = exchanges;
	}

	public List<String> getOrderTypeList() {
		return orderTypeList;
	}

	public void setOrderTypeList(List<String> orderTypes) {
		this.orderTypeList = orderTypes;
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	public String getSamcoSessionId() {
		return samcoSessionId;
	}

	public void setSamcoSessionId(String samcoSessionId) {
		this.samcoSessionId = samcoSessionId;
	}

	public String getBranchID() {
		return branchID;
	}

	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}

	public String getPasswordResetFlg() {
		return passwordResetFlg;
	}

	public void setPasswordResetFlg(String passwordResetFlg) {
		this.passwordResetFlg = passwordResetFlg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		LoginResponse that = (LoginResponse) o;
		return accountID.equals(that.accountID) && accountName.equals(that.accountName)
				&& Objects.equals(defaultMarketWatch, that.defaultMarketWatch) && brokerName.equals(that.brokerName)
				&& Objects.equals(exchangeList, that.exchangeList) && Objects.equals(orderTypeList, that.orderTypeList)
				&& Objects.equals(productList, that.productList) && samcoSessionId.equals(that.samcoSessionId)
				&& branchID.equals(that.branchID) && status.equals(that.status);
	}

	@Override
	public String toString() {
		return "LoginResponse{" + "accountID='" + accountID + '\'' + ", accountName='" + accountName + '\''
				+ ", defaultMarketWatch='" + defaultMarketWatch + '\'' + ", brokerName='" + brokerName + '\''
				+ ", exchanges=" + exchangeList + ", orderTypes=" + orderTypeList + ", productList=" + productList
				+ ", samcoSessionId='" + samcoSessionId + '\'' + ", branchID='" + branchID + '\'' + ", status='"
				+ status + '\'' + '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountID, accountName, defaultMarketWatch, brokerName, exchangeList, orderTypeList,
				productList, samcoSessionId, branchID, status);
	}

}
