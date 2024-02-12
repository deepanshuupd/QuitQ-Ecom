package com.hexaware.QuitQ.service.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.QuitQ.entity.Product;
import com.hexaware.QuitQ.entity.Seller;
import com.hexaware.QuitQ.repository.ProductDao;
import com.hexaware.QuitQ.repository.SellerDao;
import com.hexaware.QuitQ.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private SellerDao sellerDao;
	@Autowired
	private ProductDao productDao;
	@Override
	public Product addProductToCatalog(Product product) {
//		Seller seller = product.getSeller();
		Seller seller = sellerDao.findById(1);
	    Optional<Seller> existingSellerOpt = sellerDao.findByMobileNo(seller.getMobileNo());
	    if (existingSellerOpt.isPresent()) {
	        Seller existingSeller = existingSellerOpt.get();
	        product.setSeller(existingSeller);
	        existingSeller.getProducts().add(product);
	        sellerDao.save(existingSeller); // Save the existing seller to ensure it's attached
	    } else {
	        // If the seller doesn't exist, you might want to handle this case accordingly
	        // For example, you could throw an exception or log a message
	        throw new RuntimeException("Seller not found for mobile number: " + seller.getMobileNo());
	    }
	    return productDao.save(product);
	}
}
