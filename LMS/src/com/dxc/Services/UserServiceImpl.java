package com.dxc.Services;

import java.util.List;

import com.dxc.dao.IUserDao;
import com.dxc.dao.UserDaoImpl;
import com.dxc.pojos.BookList;

public class UserServiceImpl  implements IUserService {
	
	IUserDao udao = new UserDaoImpl();

	public void userConnect()
	{
		udao.userConnect();
	}
	
	public boolean authenticate(String Name,String Password)
	{
		return udao.authenticate(Name, Password);
	}
	
	public void issueBook()
	{
		udao.issueBook();
	}
	
	public List<BookList> getBookList(String s)
	{
		return udao.getBookList(s);
	}
	public void getUserBalance(String s)
	{
		udao.getUserBalance(s);
	}
	public void closeConnection()
	{
		udao.closeConnection();
	}		
}	

