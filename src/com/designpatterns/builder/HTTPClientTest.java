package com.designpatterns.builder;

public class HTTPClientTest {

	public static void main(String args[]) {
		try {
			// Using builder to get the object in a single line of code and
			// without any inconsistent state or arguments management issues
			HTTPClient httpClient1 = new HTTPClient.HTTPClientBuilder("https://apis.google.com/maps").build();
			HTTPClient httpClient2 = new HTTPClient.HTTPClientBuilder("https://apis.google.com/mail").setRetry(5)
					.build();
			System.out.println(httpClient1.getUrl());
			System.out.println(httpClient2.getUrl());
			// System.out.println(httpClient1.hashCode()==httpClient2.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}