package org.capstore.rest.dao;

import org.capstore.rest.model.Brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("brandDao")
public interface BrandDao extends JpaRepository<Brand, Integer> {

}
