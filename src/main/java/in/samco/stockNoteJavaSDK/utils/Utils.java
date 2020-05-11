package in.samco.stockNoteJavaSDK.utils;

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

import in.samco.stockNoteJavaSDK.service.SamcoHttpConnection;

public class Utils {

	private RestTemplate restTemplate = new RestTemplate();
	SamcoHttpConnection httpConnection = new SamcoHttpConnection();
	private Gson gson;
	public int connTimeOut;
	public int readTimeOut;

	public String prettyJson(String json) {
		gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jsonParser = new JsonParser();
		JsonElement jsonElement = jsonParser.parse(json);
		return gson.toJson(jsonElement);
	}

	public void setTimeout(RestTemplate restTemplate, int connTimeOut, int readTimeOut) {
//		int timeout = 60000;
		restTemplate.setRequestFactory(new SimpleClientHttpRequestFactory());
		SimpleClientHttpRequestFactory httpRequestFactory = (SimpleClientHttpRequestFactory) restTemplate
				.getRequestFactory();
		httpRequestFactory.setReadTimeout(readTimeOut);
		httpRequestFactory.setConnectTimeout(connTimeOut);
	}

	public String getSamcoException(String exception) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("statusMessage", exception);
		jsonObject.put("status", "Failure");

		return jsonObject.toString();
	}

	public ResponseEntity<?> getRestTemplateResponse(String url, String method, HttpEntity<?> entity,
			Class<?> className) {
		setTimeout(restTemplate, connTimeOut, readTimeOut);
		ResponseEntity<?> responseEntity = null;

		if ("GET".equalsIgnoreCase(method)) {
			responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, className);
		} else if ("POST".equalsIgnoreCase(method)) {
			responseEntity = restTemplate.postForEntity(url, entity, className);
		} else if ("PUT".equalsIgnoreCase(method)) {
			responseEntity = restTemplate.exchange(url, HttpMethod.PUT, entity, className);
		} else if ("DELETE".equalsIgnoreCase(method)) {
			responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, entity, className);
		}

		return responseEntity;
	}
}