package com.jacoco.systest;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void getCatService() {
		try {
			HttpGet getRequest = new HttpGet("http://localhost:8080/carsaledemoapp/webresources/carsale");
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			CloseableHttpResponse httpResponse = httpClient.execute(getRequest);
			ResponseHandler<String> responseBody = new BasicResponseHandler();
			System.out.println(responseBody.handleResponse(httpResponse));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
