package com.mukscode.ws;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;

import com.mukscode.business.ProductServiceImpl;
import com.mukscode.model.Product;

@WebService(name = "TestMartCatalog", portName = "TestMartCatalogPort", serviceName ="TestMartCatalogService",
endpointInterface="com.mukscode.ws.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productService = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.mukscode.ws.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see com.mukscode.ws.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}

	/* (non-Javadoc)
	 * @see com.mukscode.ws.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
	/* (non-Javadoc)
	 * @see com.mukscode.ws.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);
	}
}
