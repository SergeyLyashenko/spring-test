package com.slyashenko.dao;

import com.slyashenko.model.Category;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Kate on 29.04.17.
 */
@Repository
@Transactional
public class CategoryDaoImpl extends AbstractDao<Category> implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;


   /* @Override
    public List<Category> getCategories() {
        String hql = "from Category";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }

    @Override
    public Category getCategoryById(Integer id) {
        return (Category) sessionFactory.getCurrentSession().get(Category.class, id);
    }*/

    @Override
    public Category getCategoryWithProductsById(Long id) {
        String hql = "from Category c join fetch c.products s where c.id =:id";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("id", id);

        return (Category) query.uniqueResult();


    }
}
