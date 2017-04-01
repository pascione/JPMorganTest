package message;

import java.math.BigDecimal;

public class OperationMessage {

	private OperationEnum adjOperation;
	private BigDecimal adjPrice;

	public OperationEnum getAdjOperation() {
		return adjOperation;
	}

	public void setAdjOperation(OperationEnum adjOperation) {
		this.adjOperation = adjOperation;
	}

	public BigDecimal getAdjPrice() {
		return adjPrice;
	}

	public void setAdjPrice(BigDecimal adjPrice) {
		this.adjPrice = adjPrice;
	}
}
