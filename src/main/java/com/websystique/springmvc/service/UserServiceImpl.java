package com.websystique.springmvc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Service;

import com.lnt.View.RegistrationForm;
import com.websystique.springmvc.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	
	static{
		users= populateDummyUsers();
	}

	public List<User> findAllUsers() {
		return users;
	}
	
	public User findById(long id) {
		for(User user : users){
			if(user.getId() == id){
				return user;
			}
		}
		return null;
	}
	
	public User findByName(String name) {
		for(User user : users){
			if(user.getUsername().equalsIgnoreCase(name)){
				return user;
			}
		}
		return null;
	}
	
	public void saveUser(User user) {
		user.setId(counter.incrementAndGet());
		users.add(user);
	}

	public List<User> saveUserSwing(User user,RegistrationForm form) {
		System.out.println("save user swing");
		user.setId(counter.incrementAndGet());
		user.setUsername(form.getFirstnameTextfield().getText());
		user.setPassword(form.getPassword().getText());
		//user.setGender(form.isGender());
		String value= form.getMobileNumber().getText();
		user.setMobile(Long.parseLong(value));
		user.setEmail(form.getMail().getText());
		//user.setDate(form.getDate());
	    user.setState(form.getState().getText());
		user.setArea(form.getArea().getText());
		user.setCountry(form.getNation().getText());
		user.setId(counter.incrementAndGet());
					
		users.add(user);
		JOptionPane.showMessageDialog(null, "Records saved : " + user.getUsername(), "Info",
				JOptionPane.INFORMATION_MESSAGE);
		 return users;
	}

	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
	}

	public void deleteUserById(long id) {
		
		for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
		    User user = iterator.next();
		    if (user.getId() == id) {
		        iterator.remove();
		    }
		}
	}

	public boolean isUserExist(User user) {
		return findByName(user.getUsername())!=null;
	}
	
	
	public void deleteAllUsers(){
		users.clear();
	}

	private static List<User> populateDummyUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(),"Raju",  "Raj" ,  986663 , "bdjhui@abc.com", "bngl", "TS" , "NY"));
		users.add(new User(counter.incrementAndGet(),"Tabrez", "hsn" ,  986662 , "hussainmn2@gmail.com", "bngl", "TS" , "NY"));
		users.add(new User(counter.incrementAndGet(),"Ravi",  "rvi" ,  986662 , "ravi@gmail.com", "bngl", "TS" , "NY"));
		users.add(new User(counter.incrementAndGet(),"Shilpa",  "shlp" , 986662 , "shilpa@gmail.com", "bngl", "TS" , "NY"));
		return users;
	}

}
