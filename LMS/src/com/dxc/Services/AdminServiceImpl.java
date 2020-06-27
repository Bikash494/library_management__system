package com.dxc.Services;

import java.util.List;

import com.dxc.dao.AdminDaoImpl;
import com.dxc.dao.IAdminDao;

import com.dxc.pojos.UserList;

public class AdminServiceImpl implements IAdminService {
		
		IAdminDao dao=new AdminDaoImpl();
			
				public void adminConnect()
				{
					dao.adminConnect();
				}
							
				public boolean authenticate(String u, String p)
				{
					return dao.authenticate(u, p);
				}
				
				public void addBook(int i, String n, String a, int q)
				{
					dao.addBook(i, n, a, q);
				}
				
				public void removeBook(int i)
				{
					dao.removeBook(i);
				}
				
				public List<UserList> getListOfBooks(String s) 
				{
					return dao.getListOfBooks(s);
				}
				
				public List<UserList> getBalance(String s)
				{
					return dao.getBalance(s);
				}
				
				public void deleteAcc(int i)
				{
					dao.deleteAcc(i);
				}
				public void closeConnection()
				{
					dao.closeConnection();
				}

	}
