package src.com.ravi.order.bo;

import src.com.ravi.order.bo.exception.BOException;
import src.com.ravi.order.dto.Order;
import src.com.ravi.order.bo.exception.BOException;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException, BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
