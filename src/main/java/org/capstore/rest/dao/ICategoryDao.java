package org.capstore.rest.dao;

import org.capstore.rest.model.Brand;
import org.capstore.rest.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("categoryDao")
public interface ICategoryDao extends JpaRepository<Category, Integer> {

}
