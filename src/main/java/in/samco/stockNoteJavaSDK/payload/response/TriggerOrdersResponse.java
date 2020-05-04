package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.TriggerOrder;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class TriggerOrdersResponse extends SimpleResponse {

	private List<TriggerOrder> triggerOrders;

	public List<TriggerOrder> getTriggerOrders() {
		return triggerOrders;
	}

	public void setTriggerOrders(List<TriggerOrder> triggerOrders) {
		this.triggerOrders = triggerOrders;
	}

}
