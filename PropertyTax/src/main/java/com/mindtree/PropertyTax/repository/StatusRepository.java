package com.mindtree.PropertyTax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.PropertyTax.model.Status;
/**
 * @author m1053638
 *
 */
@Repository
public interface StatusRepository extends JpaRepository<Status, Integer>{

}
