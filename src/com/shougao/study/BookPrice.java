package com.shougao.study;

public class BookPrice {
	private double bookPrice;
	private MemberStrategy myMemberStragety;

	public double getBookPrice() {
		return myMemberStragety.calcPrice(bookPrice);
	}

	/**
	 * 直接放到构造函数里， 就不用new了。
	 * @param price
	 * @param stragety
	 */
	public void setBookPrice(double price, MemberStrategy stragety) {
		this.bookPrice = price;
		myMemberStragety = stragety;
	}

	public BookPrice(MemberStrategy stragety, double price) {
		super();
		bookPrice = price;
		myMemberStragety = stragety;
		// TODO Auto-generated constructor stub
	}
}
