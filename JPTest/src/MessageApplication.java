import java.math.BigDecimal;

import message.Message;
import message.OperationEnum;
import message.OperationMessage;
import product.Product;
import queue.Queue;
import receiver.IReceiver;
import receiver.MessageReceiver;

public class MessageApplication {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		IReceiver receiver = new MessageReceiver();
		queue.setReceiver(receiver);
		Product apple = new Product();
		apple.setType("apple");
		Product banana = new Product();
		banana.setType("banana");
		Product pineapple = new Product();
		pineapple.setType("pineapple");
		Product strawberry = new Product();
		strawberry.setType("strawberry");
		Product melon = new Product();
		melon.setType("melon");
		Product orange = new Product();
		orange.setType("orange");

		Message message = new Message();
		message.setProduct(apple);

		Message message2 = new Message();
		message2.setProduct(banana);

		Message message3 = new Message();
		message3.setProduct(pineapple);

		Message message4 = new Message();
		message4.setProduct(strawberry);

		Message message5 = new Message();
		message5.setProduct(melon);

		Message message6 = new Message();
		message6.setProduct(orange);
		
		Message message7 = new Message();
		message7.setProduct(apple);

		OperationMessage adjMessage1 = new OperationMessage();
		adjMessage1.setAdjOperation(OperationEnum.MULTIPLY);
		adjMessage1.setAdjPrice(new BigDecimal(2));
		message7.setOperation(adjMessage1);
		
		
		for (int i = 1; i <= 49; i++) {
			message.setPrice(new BigDecimal(10));
			// message2.setQuantity(i);
			message2.setPrice(new BigDecimal(5));
			message3.setQuantity(i);
			message3.setPrice(new BigDecimal(6));
			message7.setPrice(new BigDecimal(10));			

			System.out.println(queue.queueMessage(message));
			//System.out.println(queue.queueMessage(message2));
		}
		System.out.println(queue.queueMessage(message7));
		

	}

}
