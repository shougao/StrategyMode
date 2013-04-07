package com.shougao.study;

public class MiddleMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double bookPrice) {
		// TODO Auto-generated method stub
		return bookPrice * 0.9;
	}

}
