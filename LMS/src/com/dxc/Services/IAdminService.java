package com.dxc.Services;

import java.util.List;


import com.dxc.pojos.UserList;

public interface IAdminService {
	
	public void adminConnect();
	public  boolean authenticate(String u, String p);
	
	public void addBook(int i, String n, String a, int q);
	public void removeBook(int i);
	public List<UserList> getListOfBooks(String s);
	public List<UserList> getBalance(String s);
	public void deleteAcc(int i);
	public void closeConnection();

	}
