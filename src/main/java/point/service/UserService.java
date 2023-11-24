package point.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import point.model.UserRecord;
import point.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserRecord> getAllUser() {
		List<UserRecord> userRecords = new ArrayList<>();
		userRepository.findAll().forEach(userRecords::add);
		return userRecords;
	}
	
	public void addUser(UserRecord userRecord) {
		userRepository.save(userRecord);
	}
}
