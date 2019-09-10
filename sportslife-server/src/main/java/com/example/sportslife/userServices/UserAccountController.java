package com.example.sportslife.userServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserAccountController {

	@Autowired
	private UserAccountRepository userAccountRepository;
	
	@GetMapping("/user/{id}")
	public ResponseEntity<UserAccount> getUserAccountById(@PathVariable(value = "id") Long userAccountId) 
		throws ResourceNotFoundException {
		UserAccount userAccount = userAccountRepository.findById(userAccountId)
				.orElseThrow(() -> new ResourceNotFoundException ("User account not found :: " + userAccountId));
		return ResponseEntity.ok().body(userAccount);
	}
}
