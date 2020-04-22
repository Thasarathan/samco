package in.samco.stockNoteJavaSDK.utils;

import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Utils {

	private RestTemplate restTemplate = new RestTemplate();
	private Gson gson;

	public String prettyJson(String json) {
		gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jsonParser = new JsonParser();
		JsonElement jsonElement = jsonParser.parse(json);
		return gson.toJson(jsonElement);
	}

	public void setTimeout(RestTemplate restTemplate) {
		int timeout = 60000;
		restTemplate.setRequestFactory(new SimpleClientHttpRequestFactory());
		SimpleClientHttpRequestFactory httpRequestFactory = (SimpleClientHttpRequestFactory) restTemplate
				.getRequestFactory();
		httpRequestFactory.setReadTimeout(timeout);
		httpRequestFactory.setConnectTimeout(timeout);
	}

	public String getSamcoException(String exception) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("statusMessage", exception);
		jsonObject.put("status", "Failure");

		return jsonObject.toString();
	}

	public ResponseEntity<?> getRestTemplateResponse(String url, String method, HttpEntity<String> entity,
			Class<?> className, HashMap<String, String> params) {
		setTimeout(restTemplate);
		ResponseEntity<?> responseEntity = null;

		if ("GET".equalsIgnoreCase(method)) {
			responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, className, params);
		} else if ("POST".equalsIgnoreCase(method)) {
			responseEntity = restTemplate.postForEntity(url, entity, className);
		}

		return responseEntity;
	}
}