package com.designpatterns.builder;

public class HTTPClient {
	
	//mandatory
	private String Url;
	//optional
	private int timeout;
	private int retry;
	
	/**
	 * @return the url
	 */
	public String getUrl() {
		return Url;
	}

	/**
	 * @return the timeout
	 */
	public int getTimeout() {
		return timeout;
	}

	/**
	 * @return the retry
	 */
	public int getRetry() {
		return retry;
	}
	
	private HTTPClient(HTTPClientBuilder httpClient){
		this.Url=httpClient.Url;
		this.timeout=httpClient.timeout;
		this.retry=httpClient.retry;
	}
	
	public static class HTTPClientBuilder{
		
		private String Url;
		private int timeout=-1; //default no time limit
		private int retry=3; //default max 3 attempts
		
		public HTTPClientBuilder(String Url){
			this.Url=Url;
		}
		
		/**
		 * @param retry the retry to set
		 */
		public HTTPClientBuilder setRetry(int retry) {
			this.retry = retry;
			return this;
		}
		
		/**
		 * @param timeout the timeout to set
		 */
		public HTTPClientBuilder setTimeout(int timeout) {
			this.timeout = timeout;
			return this;
		}
		
		public HTTPClient build(){
			return new HTTPClient(this);
		}
	}
}
