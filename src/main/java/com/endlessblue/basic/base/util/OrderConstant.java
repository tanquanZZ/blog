package com.endlessblue.basic.base.util;

/**
 * 
 *订单常量
 */
public class OrderConstant {

	/**  支付/消费 **/
	public static final int TORDER_TYPE_PAYMENT = 0; 
	/**  退款/退货 **/
	public static final int TORDER_TYPE_REFUND = 1; 
	/**  充值 **/
	public static final int TORDER_TYPE_CHARGE = 2; 
	/**  消费冲正**/ 
	public static final int TORDER_TYPE_CANCEL=23;
	/**  消费撤销**/
	public static final int TORDER_TYPE_REVERSAL= 24;
	/**  消费撤销冲正**/ 
	public static final int TORDER_TYPE_REVERSAL_CANCEL= 25;
	
	/**  新订单，未处理(未支付、未退款、未冲正...) **/
	public static final int TORDER_STATE_NEW = 0; 
	/**  成功(支付成功、退款成功...) **/
	public static final int TORDER_STATE_SUCCESS = 1; 
	/**  失败 **/
	public static final int TORDER_STATE_FAILURE = 2; 
	/**  已冲正 **/
	public static final int TORDER_STATE_CANCEL = 3; 
	/**  已撤销 **/
	public static final int TORDER_STATE_REVERSAL = 4; 
	/**  退款申请 **/
	public static final int TORDER_STATE_REFUND_REQ = 9; 
	/**  退款拒绝 **/
	public static final int TORDER_STATE_REFUND_REFUSE = 10; 
	/**  退款商户确认 **/
	public static final int TORDER_STATE_REFUND_CHECK = 0; 
}
