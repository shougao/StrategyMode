package com.shougao.study;

/**
 * 使用场景  
  假设：现在要设计一个贩卖各类书籍的电子商务网站的购物车系统。
比如，本网站可能对所有的高级会员提供每本20%的促销折扣；对中级会员提供每本
10%的促销折扣；对初级会员没有折扣。
  根据描述，折扣是根据以下的几个算法中的一个进行的：
　算法一：对初级会员没有折扣。
　算法二：对中级会员提供10%的促销折扣。
　算法三：对高级会员提供20%的促销折扣。
 * @author zhangqc
 *
 */
public interface MemberStrategy {
	public double calcPrice(double bookPrice);
}
