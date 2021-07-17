package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	List<Payment> findByDescriptionEquals(String qString);

	List<Payment> findByAmountGreaterThan(double qamount);

	@Query(value = "update payments set amount=:newAmount where txn_Id=:id", nativeQuery = true)
	@Modifying
	@Transactional
	public int updateAmount(@Param("newAmount") double amtToUpdate, @Param("id") int id);
}
