package com.ecomm;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ecomm.entity.Profile;
import com.ecomm.entity.Role;
import com.ecomm.entity.User;
import com.ecomm.repo.ProfileRepo;
import com.ecomm.repo.RoleRepository;
import com.ecomm.repo.UserRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private UserRepo urepo;
	
	@Autowired
	private ProfileRepo prepo;
	
	@Autowired
	private RoleRepository rrepo;
	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void run(String... args) throws Exception {

//	Profile p=prepo.findById(1).orElse(null);
//	System.out.println(p.getName());
//	System.out.println(p.getPhone());
//	System.out.println(p.getUser().getEmail());
//	User u=urepo.findById(1).orElse(null);
//	System.out.println(u.getEmail());
//	System.out.println(u.getPassword());
//	System.out.println(u.getProfile().getName());
		
			addUser();
		
		
	}
	
	public void addUser() {
		
		//Collecting user data
		User u=new User();
		System.out.println("Enter Mail ID:");
		u.setEmail(sc.next());
		System.out.println("Enter Password:");
		u.setPassword(sc.next());
		
		//Role Information
		Role r=rrepo.findById(1).orElse(null);
		u.setRole(r);
		u=urepo.save(u);
		
		//Profile Data
		Profile p=new Profile();
		System.out.println("Enter the name:");
		p.setName(sc.next());
		System.out.println("Enter the Phone:");
		p.setPhone(sc.next());
		p.setUser(u);
		p=prepo.save(p);
		
	
		

	}
	
	
	public void addRole() {
		Role r=new Role();
		System.out.println("Enter the roleName");
		r.setRoleName(sc.next());
		rrepo.save(r);
	}

}
