package com.shougao.study;

public class Main {

	private static MemberStrategy myStrategy;
	private static BookPrice myBookPrice;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStrategy = new AdvanceMemberStrategy();
		myBookPrice = new BookPrice(myStrategy, 99.0);
		System.out.println("Advance Member price is "  + myBookPrice.getBookPrice());
		
		
		myStrategy = new MiddleMemberStrategy();
		myBookPrice = new BookPrice(myStrategy, 99.0);
		System.out.println("Middle Member price is "  + myBookPrice.getBookPrice());
	}

}
