package pojo.service.implementation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.entity.User;
import pojo.repository.UserRepository;
import pojo.service.UserService;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository userRepository; 
	
	@Override
	public ArrayList<User> getAllUsers() {
		return userRepository.getAllUsers();
	}

	@Override
	public boolean addNewUser(User user) {
		return userRepository.addNewUser(user);
	}

	@Override
	public boolean deleteAUser(int id) {
		try{
			return userRepository.deleteAUser(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateAUser(User user) {
		return userRepository.updateAUser(user);
	}

	@Override
	public User getAUser(int id) {
		return userRepository.getAUser(id);
	}

}
