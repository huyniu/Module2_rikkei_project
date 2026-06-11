package service.impl;

import dao.IProductDao;
import dao.impl.ProductDaoImpl;
import model.Product;
import service.IProductService;

import java.math.BigDecimal;
import java.util.ArrayList;
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

    @Override
    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    @Override
    public Product findProductById(int id) {
        return productDao.findProductById(id);
    }

    @Override
    public void deleteProduct(int id) {
        productDao.deleteProduct(id);
    }

    @Override
    public ArrayList<Product> findProductByBrand(String brand) {
        return productDao.findProductByBrand(brand);
    }

    @Override
    public ArrayList<Product> findProductByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productDao.findProductByPriceRange(minPrice, maxPrice);
    }

    @Override
    public ArrayList<Product> findProductByStockAvailability(String name, int stock) {
        return productDao.findProductByStockAvailability(name, stock);
    }
}