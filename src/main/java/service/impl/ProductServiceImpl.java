package service.impl;

import dao.IProductDao;
import dao.impl.ProductDaoImpl;
import model.Product;
import service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private static final IProductDao productDao = new ProductDaoImpl();

    @Override
    public List<Product> showAllProducts() {
        List<Product> productList = productDao.showAllProducts();

        if (productList.isEmpty()) {
            return null;
        } else {
            return productList;
        }
    }

    @Override
    public void addProduct(Product product) {
        if (product == null){
            throw  new IllegalArgumentException("Product cannot be null");
        }else {
            productDao.addProduct(product);
        }
    }
}