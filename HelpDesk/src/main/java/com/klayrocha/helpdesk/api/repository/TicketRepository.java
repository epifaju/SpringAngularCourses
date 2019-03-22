package com.klayrocha.helpdesk.api.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.klayrocha.helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket,String> {

	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages,String userId);
	
	Page<Ticket> findTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDateDescroit(
			String title,String status,String Priority,Pageable pages);
	
	Page<Ticket> findTitleIgnoreCaseContainingAndStatusAndPriorityAndUserIdOrderByDateDescroit(
			String title,String status,String Priority,Pageable pages);
	
	Page<Ticket> findTitleIgnoreCaseContainingAndStatusAndPriorityAndAssignedUserIdOrderByDateDescroit(
			String title,String status,String Priority,Pageable pages);
	
	Page<Ticket> findByNumber(Integer number, Pageable pages);
}
