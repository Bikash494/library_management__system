package com.dxc.pojos;

public class UserList {

		private String Name;
		private int Id;
		private String Password;
		private String BookIssued;
		private int Balance;
		private int days;
		
		public UserList() {}

		
		public UserList(String Name, int Id, String BookIssued, int Balance, int days)
		{
			super();
			this.Name = Name;
			this.Id = Id;
			this.BookIssued = BookIssued;
			this.Balance = Balance;
			this.days = days;
		}
		
		
		public UserList(String Name, String BookIssued) {
			super();
			this.Name = Name;
			this.BookIssued = BookIssued;
		}
		
		public UserList(String Name, int Balance) {
			super();
			this.Name = Name;
			this.Balance = Balance;
		}


		public String getName() {
			return Name;
		}


		public void setName(String Name) {
			this.Name = Name;
		}


		public int getId() {
			return Id;
		}


		public void setId(int Id) {
			this.Id = Id;
		}


		public String getPassword() {
			return Password;
		}


		public void setPassword(String Password) {
			this.Password = Password;
		}


		public String getBookIssued() {
			return BookIssued;
		}


		public void setBookIssued(String BookIssued) {
			this.BookIssued = BookIssued;
		}


		public int getBalance() {
			return Balance;
		}


		public void setBalance(int Balance) {
			this.Balance = Balance;
		}


		public int getDays() {
			return days;
		}


		public void setDays(int days) {
			this.days = days;
		}


		public void display()
		{
			System.out.println(Name+"\t\t"+BookIssued);
		}
		
		public void show()
		{
			System.out.println(Name+"\t\t"+Balance);
		}
	}
