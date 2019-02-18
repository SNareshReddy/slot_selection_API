package com.servpro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servpro.entity.SlotUtil;

@Repository
public interface SlotRepository extends JpaRepository<SlotUtil, Integer>{
		
	SlotUtil findBySlotStatus(boolean slotStatus);
}
