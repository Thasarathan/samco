package in.samco.utils;

import org.json.JSONObject;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Utils {

	private Gson gson;

	public String prettyJson(String json) {
		gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(json);
		return gson.toJson(je);
	}

	public void setTimeout(RestTemplate restTemplate) {
		int timeout = 15000;
		restTemplate.setRequestFactory(new SimpleClientHttpRequestFactory());
		SimpleClientHttpRequestFactory rf = (SimpleClientHttpRequestFactory) restTemplate.getRequestFactory();
		rf.setReadTimeout(timeout);
		rf.setConnectTimeout(timeout);
	}

	public String getSamcoException(String exception) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Response", exception);
		jsonObject.put("StatusCode", "408");
		jsonObject.put("StatusMsg", "Failure");

		return jsonObject.toString();
	}
}
