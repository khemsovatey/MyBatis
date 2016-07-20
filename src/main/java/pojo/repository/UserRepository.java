package pojo.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import pojo.entity.User;

@Repository
public interface UserRepository {
	
	@Select("SELECT id,name,gender,email FROM tbuser")
	@Results({
		@Result(property="id",column="id"),
		@Result(property="name",column="name"),
		@Result(property="gender",column="gender"),
		@Result(property="email",column="email")
	})
	public ArrayList<User> getAllUsers();
	
	@Insert("INSERT INTO tbuser(name,gender,email) VALUES(#{name},#{gender},#{email})")
	public boolean addNewUser(User user);
	
	@Delete("DELETE FROM tbuser WHERE id=#{uid}")
	public boolean deleteAUser(@Param("uid")int id);
	
	@Update("UPDATE tbuser SET name=#{name}, gender=#{gender}, email=#{email} WHERE id=#{id}")
	public boolean updateAUser(User user);
	
	@Select("SELECT id,name,gender,email FROM tbuser")
	@Results({
		@Result(property="id",column="id"),
		@Result(property="name",column="name"),
		@Result(property="gender",column="gender"),
		@Result(property="email",column="email")
	})
	public User getAUser(int id);
}
