package com.dxc.pojos;

public class BookList {
	
		private int id;
		private String bookName;
		private String author;
		private int quantity;
		
		public BookList() {
		}

		public BookList(int id, String bookName, String author, int quantity) {
			this.id = id;
			this.bookName = bookName;
			this.author = author;
			this.quantity = quantity;
		}
		public BookList(int id, String bookName,String author) 
		{
			this.id = id;
			this.bookName = bookName;
			this.author = author;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public void display()
		{
			System.out.println(id+" "+bookName+" "+ author+" "+ quantity);
		}

		public void displayBook() {
			System.out.println("\n"+id+" "+bookName+" "+author+" \n");
		}	
		
		public void show()
		{
			System.out.println(id+"\t"+bookName+"\t\t"+author);
		}
		
	}
