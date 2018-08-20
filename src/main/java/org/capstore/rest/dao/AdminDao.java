package org.capstore.rest.dao;

import org.capstore.rest.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("adminDao")

<<<<<<< HEAD
public interface AdminDao extends JpaRepository<Admin, Integer>{


=======
public interface AdminDao  extends JpaRepository<Admin,Integer> {
>>>>>>> branch 'master' of https://github.com/jeefullstack-13/capstore_rest.git


}
