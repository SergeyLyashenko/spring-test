package com.slyashenko.dao;

import com.slyashenko.model.Product;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Kate on 01.05.17.
 */
@Repository
@Transactional
public class ProductDaoImpl extends AbstractDao<Product> implements ProductDao {

    /*@Autowired
    private SessionFactory sessionFactory;

    @Override
    public Product getProductById(Integer id) {
        return null;
    }*/

    @Override
    public Product getProductWithCategoryById(Long id) {
        String hql = "from Product p join fetch p.category c where p.id =:id";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("id", id);

        return (Product) query.uniqueResult();
    }

    /*@Override
    public Product addProduct(Product product) {
        Integer productId = (Integer) sessionFactory.getCurrentSession().save(product);
        return (Product) sessionFactory.getCurrentSession().get(Product.class, productId);
    }*/
}
