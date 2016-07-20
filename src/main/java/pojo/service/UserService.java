package pojo.service;

import java.util.ArrayList;

import pojo.entity.User;
public interface UserService{
	/***
	 * get all users from the database
	 * @return ArrayList of User
	 */
	public ArrayList<User> getAllUsers();
	/***
	 * add new user to database
	 * @param user
	 * @return
	 */
	public boolean addNewUser(User user);
	/***
	 * delete a user from database
	 * @param id
	 * @return
	 */
	public boolean deleteAUser(int id);
	/***
	 * update a user in database
	 * @param user
	 * @return
	 */
	public boolean updateAUser(User user);
	/***
	 * get a user from database
	 * @param id
	 * @return
	 */
	public User getAUser(int id);
}
