package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class App_Order {

	public static void main(String[] args) {
		
		Order order = new Order(255, new Date(), OrderStatus.PEDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.PROCESSING;
		OrderStatus os2 = OrderStatus.valueOf("SHIPPED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
