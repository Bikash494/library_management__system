package com.dxc.dao;

import java.util.List;

import com.dxc.pojos.BookList;

public interface IUserDao {


	public void userConnect();
	public boolean authenticate(String Name,String Password);
	public void issueBook();
	public List<BookList> getBookList(String s);
	public void getUserBalance(String s);
	public void closeConnection();
}
