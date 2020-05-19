package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.OptionChain;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class OptionChainResponse extends SimpleResponse {

	List<OptionChain> optionChainDetails;

	List<OptionChain> optionChainResults;

	public List<OptionChain> getOptionChainResults() {
		return optionChainResults;
	}

	public void setOptionChainResults(List<OptionChain> optionChainResults) {
		this.optionChainResults = optionChainResults;
	}

	public List<OptionChain> getOptionChainDetails() {
		return optionChainDetails;
	}

	public void setOptionChainDetails(List<OptionChain> optionChainDetails) {
		this.optionChainDetails = optionChainDetails;
	}

	@Override
	public String toString() {
		return "OptionChainResponse [optionChainDetails=" + optionChainDetails + ", optionChainResults="
				+ optionChainResults + "]";
	}

}
