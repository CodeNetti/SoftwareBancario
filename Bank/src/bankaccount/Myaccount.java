package bankaccount;

import java.util.Scanner;

public class Myaccount   {
	
		String name;
	 static int numberAcount = 1914;
	static private String CPF;
	 private double balance;
	
		 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getNumberAcount() {
		return numberAcount;
	}
	public static void setNumberAcount(int numberAcount) {
		Myaccount.numberAcount = numberAcount;
	}
	public static String getCPF() {
		return CPF;
	}
	public static void setCPF(String cPF) {
		CPF = cPF;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void accountDeposit(double deposit) 
	{
		this.balance = this.balance + deposit;
	}
	public void accountWithdrawa(double withdraw) 
	{
		this.balance = (this.balance - 5) - withdraw;
	}
	
	


	
	
	
	
}
