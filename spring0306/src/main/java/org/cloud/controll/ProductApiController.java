package org.cloud.controll;

import java.util.List;

import org.cloud.dto.ProductDTO;
import org.cloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/product")
public class ProductApiController {
	
	@Autowired	
	private ProductService productService;
	
	@GetMapping("/list")
	public List<ProductDTO> openProductList(Model model) throws Exception {
		return productService.productList();
	}
	
	@PostMapping("/insert")
	public ResponseEntity<String> insertProduct(@RequestBody ProductDTO product) throws Exception {
		try {
			productService.insertProduct(product);
			return ResponseEntity.ok("success");
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("Fail:" + e.getMessage());
		}
	}
	
	@GetMapping("/detail/{num}")
	public ProductDTO openProductDetail(@PathVariable("num") int num) throws Exception{
		return productService.productDetail(num);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateProduct(@RequestBody ProductDTO product) throws Exception {
		productService.updateProduct(product);
		return ResponseEntity.ok("success");
	}
	
	@DeleteMapping("/delete/{num}")
	public ResponseEntity<String> deleteProduct(@PathVariable("num") int num) throws Exception {
		productService.deleteProduct(num);
		return ResponseEntity.ok("success");
	}
}
