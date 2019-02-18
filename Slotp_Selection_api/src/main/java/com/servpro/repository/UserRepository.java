package com.servpro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.servpro.entity.SlotUtil;

@Repository
public interface UserRepository extends JpaRepository<SlotUtil,Integer> {
	
	@Query("SELECT new com.servpro.model.SlotMessage(sId,slotTiming) FROM SlotUtil WHERE slotStatus= :slotStaus")
	List<SlotUtil> findBySlotStatus(@Param("slotStaus") boolean slotStaus);

	


}