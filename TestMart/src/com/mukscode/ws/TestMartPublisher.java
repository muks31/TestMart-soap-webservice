package com.mukscode.ws;

import javax.xml.ws.Endpoint;

public class TestMartPublisher {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:4000/productcatalog", new ProductCatalog());

	}

}
