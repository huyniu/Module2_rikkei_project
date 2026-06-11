package service;

import model.Product;

import java.util.List;

public interface IProductService {
   List<Product> showAllProducts();
   void addProduct(Product product);
   void updateProduct(Product product);
   Product findProductById(int id);
   void deleteProduct(int id);
}
