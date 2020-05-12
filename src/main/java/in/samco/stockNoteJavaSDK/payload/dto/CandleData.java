package in.samco.stockNoteJavaSDK.payload.dto;

import java.util.Objects;

public class CandleData {

	String date;
	String open;
	String high;
	String low;
	String close;
	String ltp;
	String volume;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getClose() {
		return close;
	}

	public void setClose(String close) {
		this.close = close;
	}

	public String getLtp() {
		return ltp;
	}

	public void setLtp(String ltp) {
		this.ltp = ltp;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CandleData that = (CandleData) o;
		return Objects.equals(date, that.date) && Objects.equals(open, that.open) && Objects.equals(high, that.high)
				&& Objects.equals(low, that.low) && Objects.equals(close, that.close) && Objects.equals(ltp, that.ltp)
				&& Objects.equals(volume, that.volume);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, open, high, low, close, ltp, volume);
	}

	@Override
	public String toString() {
		return "CandleData{" + "date='" + date + '\'' + ", open='" + open + '\'' + ", high='" + high + '\'' + ", low='"
				+ low + '\'' + ", close='" + close + '\'' + ", ltp='" + ltp + '\'' + ", volume='" + volume + '\'' + '}';
	}

}
