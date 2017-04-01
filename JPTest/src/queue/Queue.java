package queue;

import message.Message;
import receiver.IReceiver;

public class Queue implements IQueue {
	private IReceiver receiver;

	@Override
	public String queueMessage(Message message) {
		String logMessage = "";
		if (receiver != null) {
			logMessage = receiver.receiveMessage(message);
		}
		return logMessage;
	}

	public IReceiver getReceiver() {
		return receiver;
	}

	public void setReceiver(IReceiver receiver) {
		this.receiver = receiver;
	}

}
