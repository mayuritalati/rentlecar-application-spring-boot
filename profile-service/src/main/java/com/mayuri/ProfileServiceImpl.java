package com.mayuri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	ProfileRepository profileRepositroy;
	
	
	@Override
	public Customer save(Customer customer) {
		return profileRepositroy.save(customer);
	}

}
