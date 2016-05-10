package com.endlessblue.basic.base.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @功能: 常量类
 */
public class Constant {

	/**   **/public static final String SYS_CHAR_SET = "GBK"; 
	
	/**  账户类型：现金账户 **/public static final int ACT_TYPE_0 = 0; 
	/**  账户类型：平台账户 **/public static final int ACT_TYPE_1 = 1; 
	/**  账户类型：收款账户 **/public static final int ACT_TYPE_2 = 2; 
	/**  账户类型：理财账户 **/public static final int ACT_TYPE_3 = 3; 
	
	
	/**  平台总负债账户ID **/public static final String TACCOUNT_ID_TOTAL_DEBIT = "P000001"; 
	/**  平台总手续费账户ID **/public static final String TACCOUNT_ID_TOTAL_FEE = "P000010"; 
	/**  平台预收款账户ID **/public static final String PLAT_ACT_P000002 = "P000002"; 
	/**  平台T0账户ID**/public static final String PLAT_ACT_P000003 = "P000003"; 
	/**  平台T0手续费账户ID **/public static final String PLAT_ACT_P000004 = "P000004"; 
	
	/**  消费/支付 **/public static final int TACCOUNTDETAIL_TYPE_PAYMENT = 0; 
	/**  手续费 **/public static final int TACCOUNTDETAIL_TYPE_FEE = 6; 
	/** 平台POS  关闭 **/public static final int PLAT_POS_STATE_CLOSED = 0; 
	/** 平台POS  开通 **/public static final int PLAT_POS_STATE_OPENED = 1; 
	
	/**  渠道 平台POS 关闭 **/public static final int NET_POS_STATE_CLOSED = 0; 
	/**  渠道 平台POS 开通 **/public static final int NET_POS_STATE_OPENED = 1; 
	
	/**  未签到 **/public static final int PLAT_POS_LOGIN_STATE_UNLOGIN = 0; 
	/**  已签到 **/public static final int PLAT_POS_LOGIN_STATE_LOGINED = 1; 
	
	/**  发卡机构代码 **/public static final String CARD_COM_ID="8888";
	/**  卡增加段长度7为16位卡 **/public static final int CARD_SEQ_LENGTH=7;
	
	/**  空卡 **/public static final int TCARD_STATE_EMPTY = 0; 
	/**  已激活 **/public static final int TCARD_STATE_ACTIVED = 1;
	/**  已挂失 **/public static final int TCARD_STATE_2 = 2;
	/**  已冻结 **/public static final int TCARD_STATE_3 = 3;
	/**  已注销 **/public static final int TCARD_STATE_4 = 4;
	/**  已补卡 **/public static final int TCARD_STATE_5 = 5;
	
	/**  未锁定 **/public static final int TCARD_LOCK_STATE_0 = 0;
	/**  已锁定 **/public static final int TCARD_LOCK_STATE_1 = 1;
	
	/**  关闭 **/public static final int TACCOUNT_STATE_CLOSED = 0; 
	/**  开通 **/public static final int TACCOUNT_STATE_OPENED = 1; 
	
	/**  支付/消费 **/public static final int TORDER_TYPE_PAYMENT = 0; 
	/**  退款/退货 **/public static final int TORDER_TYPE_REFUND = 1; 
	/**  充值 **/public static final int TORDER_TYPE_CHARGE = 2; 
	/**  消费冲正**/ public static final int TORDER_TYPE_CANCEL=23;
	/**  消费撤销**/ public static final int TORDER_TYPE_REVERSAL= 24;
	/**  消费撤销冲正**/ public static final int TORDER_TYPE_REVERSAL_CANCEL= 25;
	
	/**  新订单，未处理(未支付、未退款、未冲正...) **/public static final int TORDER_STATE_NEW = 0; 
	/**  成功(支付成功、退款成功...) **/public static final int TORDER_STATE_SUCCESS = 1; 
	/**  失败 **/public static final int TORDER_STATE_FAILURE = 2; 
	/**  已冲正 **/public static final int TORDER_STATE_CANCEL = 3; 
	/**  已撤销 **/public static final int TORDER_STATE_REVERSAL = 4; 
	/**  退款申请 **/public static final int TORDER_STATE_REFUND_REQ = 9; 
	/**  退款拒绝 **/public static final int TORDER_STATE_REFUND_REFUSE = 10; 
	/**  退款商户确认 **/public static final int TORDER_STATE_REFUND_CHECK = 0; 
	
	/**  新订单，未处理(未支付、未退款、未冲正...) **/public static final int TORDER_PAYSTATE_NEW = 0; 
	/**  成功(支付成功、退款成功...) **/public static final int TORDER_PAYSTATE_SUCCESS = 1; 
	/**  失败 **/public static final int TORDER_PAYSTATE_FAILURE = 2; 
	
	/**  未退款 **/public static final int TORDER_RETURNSTATE_NEW = 0; 
	/**  部分退款 **/public static final int TORDER_RETURNSTATE_SUB = 1; 
	/**  全部退款 **/public static final int TORDER_RETURNSTATE_ALL = 2; 
	
	/**  未分账 **/public static final int TORDER_SHARINGSTATE_0 = 0;
	/**  分账成功 **/public static final int TORDER_SHARINGSTATE_1 = 1;
	/**  分账失败 **/public static final int TORDER_SHARINGSTATE_2 = 2;
	/**  无需分账 **/public static final int TORDER_SHARINGSTATE_3 = 3;
	
	/**  银行卡支付 **/public static final int TORDER_PAYTYPE_BANK = 0; 
	/**  账户支付 **/public static final int TORDER_PAYTYPE_ACCOUNT = 2; 
	/**  组合支付 **/public static final int TORDER_PAYTYPE_GROUP = 3; 
	/**  无账户支付 **/public static final int TORDER_PAYTYPE_NOACCOUNT = 4; 
	/**  POS交易 **/public static final int TORDER_PAYTYPE_POS = 10; 
	
	/**  担保支付 **/public static final int TORDER_PROTECTPAYSTATE_GUARANTEE = 0; 
	/**  一般支付 **/public static final int TORDER_PROTECTPAYSTATE_NORMAL = 1; 
	/**  担保成功 **/public static final int TORDER_PROTECTPAYSTATE_2 = 2; 
	/**
	 * 风险控制限额类型
	 * 单次额度限制
	 */
	public static final int TLIMIT_TYPE0=0;
	
	/**
	 * 风险控制限额类型
	 * 日累计额度限制
	 */
	public static final int TLIMIT_TYPE2=2;
	/**
	 * 风险控制限额类型
	 * 单日次数限制
	 */
	public static final int TLIMIT_TYPE1=1;
	
	/** 交易类型 账户支付/POS消费 **/public static final int ZHANGFHUZHIFU=0;
	/** 交易类型 退款 **/public static final int TUIKUAN=1;
	/** 交易类型 充值 **/public static final int CHONGZHI=2;
	/** 交易类型 转账 **/public static final int ZHUANZHANG=3;
	/** 交易类型 提现划款 **/public static final int TIXIANHUAKUAN=4;
    /** 交易类型 结算划款 **/public static final int JIESUANHUAKUAN=5;
    /** 交易类型 调账 **/public static final int TIAOZHANG=7;
    /** 交易类型 线下充值 **/public static final int XIANXIACHONGZHI=8;
    /** 交易类型 无账户支付 **/public static final int WUZHANGHUZHIFU=9;
    /** 交易类型 无账户退款 **/public static final int WUZHANGHUTUIKUAN=10;
    /** 交易类型 商户交易状态冻/解 **/public static final int USERCONTROLLE=11;
    /** 交易类型 补单 **/public static final int SINGLESUPPLEMENT=12;
    /** 交易类型 扎帐 **/public static final int ZHAZHANG=13;
    /** 交易类型 账户冻结 **/public static final int USERDONGJIE=14;
    /** 交易类型 账户交易冻结】 **/public static final int USERTRANS=15;
    /** 交易类型 账户交易解冻 **/public static final int USERTRANS1=16;
    /** 交易类型 账户资金冻结 **/public static final int TRANS_TYPE_17=17;  //state=0冻结,state=1解冻
    /**消费冲正           **/   public static final int TRANS_TYPE_23 = 23;
    /**消费撤销           **/   public static final int TRANS_TYPE_24 = 24;
    /**消费撤销冲正       **/   public static final int TRANS_TYPE_25 = 25;
    /**预授权             **/   public static final int TRANS_TYPE_26 = 26;
    /**预授权冲正         **/   public static final int TRANS_TYPE_27 = 27;
    /**预授权撤销         **/   public static final int TRANS_TYPE_28 = 28;
    /**预授权撤销冲正     **/   public static final int TRANS_TYPE_29 = 29;
    /**预授权完成         **/   public static final int TRANS_TYPE_30 = 30;
    /**预授权完成冲正     **/   public static final int TRANS_TYPE_31 = 31;
    /**预授权完成撤销     **/   public static final int TRANS_TYPE_32 = 32;
    /**预授权完成撤销冲正 **/   public static final int TRANS_TYPE_33 = 33;
    /**T+0提现 **/   public static final int TRANS_TYPE_34 = 34;
    /**T+0结算 **/   public static final int TRANS_TYPE_36 = 36;
    /** 交易类型 T+0结算划款通过 **/public static final int T0JIESUANHUAKUAN=37;
    /** 交易类型 T+0一键结算划款通过 **/public static final int T01JIESUANHUAKUAN=38;
    /** 交易类型 非T+0结算划款通过 **/public static final int FT0JIESUANHUAKUAN=39;
    /** 交易类型 非T+0一键结算划款通过 **/public static final int FT01JIESUANHUAKUAN=40;
    
    /** 通道到款确认 **/public static final int CHANNEL=41;
    /** 交易类型 转账 **/public static final int LICAI=50;
    
    /** 交易状态 未支付 **/public static final int TRANS_STATE_0=0;
    /** 交易状态 支付成功 **/public static final int TRANS_STATE_1=1;
    /** 交易状态 支付 失败**/public static final int TRANS_STATE_2=2;
    
	/**
	 * 黑名单状态 黑名单未生效状态 0
	 */
	public static final int HEIMINGDANSTATE0=0;
	/**
	 * 黑名单状态 黑名单生效状态 1
	 */
	public static final int HEIMINGDANSTATE1=1;
	
	/**
	 * 可疑交易规则 单笔大额可疑交易
	 */
	public static final int TRISKRULEID1=1;
	/**
	 * 可疑交易规则 日累计大额单位转账
	 */
	public static final int TRISKRULEID2=2;
	/**
	 * 日累计大额自然人转账
	 */
	public static final int TRISKRULEID3=3;
	/**
	 * 单笔大额充值
	 */
	public static final int TRISKRULEID4=4;
	/**
	 * 日累计大额充值
	 */
	public static final int TRISKRULEID5=5;
	/**
	 * 日累计大额提现
	 */
	public static final int TRISKRULEID6=6;
	/**
	 * 同一IP频繁交易
	 */
	public static final int TRISKRULEID7=7;
	/**
	 * 两个账户之间频繁交易
	 */
	public static final int TRISKRULEID8=8;
	/**
	 * 同一账户相同金额交易
	 */
	public static final int TRISKRULEID9=9;
	
	/**
	 * 同一IP相同金额交易
	 */
	public static final int TRISKRULEID10=10;
	/** 黑名单使用 **/public static final String SHENFENCERTCODE="SHENFENCERTCODE";
	/** 黑名单使用 **/public static final String GONGSHANGCERTCODE="GONGSHANGCERTCODE";
	/** 黑名单使用 **/public static final String HUZHAOCERTCODE="HUZHAOCERTCODE";
	/** 黑名单使用 **/public static final String TELEPHONE="TELEPHONE";
	/** 黑名单使用 **/public static final String EMAIL1="EMAIL1";
	/** 黑名单使用 **/public static final String MERNAME="MERNAME";
	/** 黑名单使用 **/public static final String BANKACCOUNT="BANKACCOUNT";
	/** 黑名单使用 **/public static final String LASTLOGINIP="LASTLOGINIP";
	/** 黑名单使用 **/public static final String MERID="MERID";
	/** 黑名单使用 **/public static final String POSID="POSID";

	/** 商户基本 0：普通用户 **/public static final Integer MERCLASS0=0;
	/** 商户基本 4：实名用户 **/public static final Integer MERCLASS4=4;
	/** 商户基本 7：VIP用户  **/public static final Integer MERCLASS7=7;
	/** 商户基本 3: 待审核状态 **/public static final Integer SHENHESTATE=3;	
	
	/** 账户冻结解冻 冻结账户状态 **/public static final int FREEZETACCOUNTSTATA=0;
	/** 账户冻结解冻 解冻账户状态 **/public static final int UNFREEZETACCOUNTSTATA=1;
	
	/** 操作日志 应用程序标识   PAY：支付平台 **/public static final String APPID_PAY="PAY";
	/** 操作日志 应用程序标识  MGR：运营平台 **/public static final String APPID_MGR="MGR";
	/** 操作日志 应用程序标识  Card：预付费卡平台 **/public static final String APPID_CARD="CARD";
	
	/** 操作日志 日志级别 DEBUG：调试信息 **/public static final String LOG_LEVEL_DEBUG="DEBUG";
	/** 操作日志 日志级别 INFO：提示信息 **/public static final String LOG_LEVEL_INFO="INFO";
	/** 操作日志 日志级别 WARNNING：告警信息 **/public static final String LOG_LEVEL_WARNNING="WARNNING";
	/** 操作日志 日志级别 ERROR：错误信息 **/public static final String LOG_LEVEL_ERROR="ERROR";
	/** 操作日志 日志级别 FATAL：致命错误信息 **/public static final String LOG_LEVEL_FATAL="FATAL";
	
	/** 操作日志 访问方式 WEB **/public static final String REQ_TYPE_WEB="WEB";
	/** 操作日志 访问方式 WAP **/public static final String REQ_TYPE_WAP="WAP";
	/** 操作日志 访问方式 POS **/public static final String REQ_TYPE_POS="POS";
	
	/** 商户角色变量设置 个人角色 **/public static final String GeRen_ROLE="1";
	/** 商户角色变量设置 企业角色 **/public static final String QiYe_ROLE="2";
	/** 商户角色变量设置 合作企业角色 **/public static final String HeZuoQiYe_ROLE="3";
	/** 商户角色变量设置 集团角色 **/public static final String JiTuan_ROLE="4";
	
	/** 商户是否为集团商户变量设置 是集团商户 **/public static final int Mer_Is_Group=1;
	/** 商户是否为集团商户变量设置 非集团商户  **/public static final int Mer_IsNot_Group=0;
	
	/** 商户是否是合作商户 合作商户 **/public static final int Mer_IS_COOPERATE=1;
	/** 商户是否是合作商户 非合作商户 **/public static final int Mer_IsNot_COOPERATE=0;
	
	/** 商户类型 单位  **/public static final int Mer_Type0=0;
	/** 商户类型 个人  **/public static final int Mer_Type1=1;
	/** 商户类型 卡用户  **/public static final int Mer_Type3=3;
	/** 商户类型 移动用户  **/public static final int Mer_Type4=4;
	
	/** 商户状态 商户关闭 **/public static final int Mer_State0=0;
	/** 商户状态 商户正常  **/public static final int Mer_State1=1;
	/** 商户状态 商户待激活  **/public static final int Mer_State2=2;
	/** 商户状态 集团归属商户待激活 **/public static final int Mer_State3=3;
	/** 拒绝开通 **/public static final int Mer_State4=4;
	
	/**
	 * 获得商户状态中文描述
	 * <p>
	 * 1：正常；
	 * 2：待开通；
	 * 3：集团待审核；
	 * 其它：关闭；
	 * @param state
	 * @return
	 */
	public static String  getChinese(String state){		
		if("1".equals(state.trim())){
			return "正常";
		}else if("2".equals(state.trim())){
			return "待开通";
		}if("3".equals(state)){
			return "集团待审核";
		}
		else {
			return "关闭";
		}
		
	}
	
	   /** 证书类型英文名 个人普通证书 **/public static String CERTTYPEENAME_CUSTOMERS  = "Customers"; 
	   /** 证书类型英文名 个人高级证书 **/public static String CERTTYPEENAME_BUSINESS_CUSTOMERS  = "Business Customers";
	   /** 证书类型英文名 企业普通 **/public static String CERTTYPEENAME_ENTERPRISES   = "Enterprises";
	   /** 证书类型英文名 企业高级 **/public static String CERTTYPEENAME_UNITS   = "Units";
	   /** 证书类型英文名 Web服务器证书 **/public static String CERTTYPEENAME_WEB_SERVERS  = "Web Servers";
	   
	    /** 企业普通证书对应的证件类型 工商登记证 **/public static final String ENTPAPERTYPE_REGISTRATION_CARD = "3"; 
		/** 企业普通证书对应的证件类型 税务登记证  **/public static final String PENTPAPERTYPE_TAX_CARD = "4";
		/**  企业普通证书对应的证件类型 组织机构代码 **/public static final String ENTPAPERTYPE_ORG_CARD = "7"; 
		/** 企业普通证书对应的证件类型 企业营业执照  **/public static final String ENTPAPERTYPE_BUSINESS_CARD = "8";
		/**  企业普通证书对应的证件类型 法人代码证 **/public static final String ENTPAPERTYPE_LEGALPERSON_CARD = "9"; 
		/**  企业普通证书对应的证件类型 其他 **/public static final String ENTPAPERTYPE_OTHERS = "Z"; 
	   
		/**
		 * 申请类型
		 */
		public static final String APPLYTYPE = "applyType";
		/** 申请类型 证书申请 **/public static final int APPLYTYPE_APPLYCERT  = 1; 
		/** 申请类型 证书补发 **/public static final int APPLYTYPE_CERTRENEW = 2;
		/** 申请类型 证书换发 **/public static final int APPLYTYPE_UPDATECERT  = 3;
		/** 申请类型 证书吊销 **/public static final int APPLYTYPE_CERTREVOKE  = 4;
		/** 申请类型 证书冻结 **/public static final int APPLYTYPE_FRAZZ  = 5;
		/** 申请类型 证书解冻 **/public static final int APPLYTYPE_UNFRAZZ  = 6;
		
		/** 申请状态 **/public static final String APPLYSTATUS = "applyStatus";
		/** 申请状态 1：待审核 **/public static final int APPLYSTATUS_ING = 1;
		/** 申请状态 2：审核通过 **/public static final int APPLYSTATUS_PASS = 2;
		/** 申请状态 3：审核拒绝 **/public static final int APPLYSTATUS_REFUSE = 3;
		/** 申请状态 4：制证完成 **/public static final int CERTSIGN_FINISHED = 4;
		/** 申请状态  5:下载完成 **/public static final int CERTDOWNLOAD_FINISHED = 5;
		
		/** 证书状态 **/public static final String CERTSTATUS = "certstatus";
		/** 证书状态 1：有效 **/public static final int CERTSTATUS_VALID = 1;
		/** 证书状态 2：冻结 **/public static final int CERTSTATUS_FREEZE = 2;
		/** 证书状态 3：作废 **/public static final int CERTSTATUS_REVOKE = 3;
		/** 证书状态 4：过期 **/public static final int CERTSTATUS_NOTVALID = 4;
		
		/** 返回结果 0:成功 **/public static final int RESULT_SUCC = 0;
		/** 返回结果 1：失败  **/public static final int RESULT_FAILED = 1;
		
		/**
		 * 组织机构代码
		 * <p>678</p>
		 */
		public static final String ORGECODE = "678";
	
		/** 增加的日志标识记录 用户注册成功 **/public static final int YONGHUZHUCESUCCESS=200;
		/** 增加的日志标识记录 用户注册失败 **/public static final int YONGHUZHUCEFAIL=201;
		/** 增加的日志标识记录 用户登录错误次数过多 **/public static final int YONGHUDENGLUFAIL=202;
		/** 增加的日志标识记录 解冻登录用户 **/public static final int JIEDONGDENGLUYONGHU=203;
		/** 增加的日志标识记录 修改交易密码成功 **/public static final int XIUGAIJIAOYIMIMASUC=204;
		/** 增加的日志标识记录 修改交易密码失败 **/public static final int XIUGAIJIAOYIMIMAFAIL=205;
		/** 增加的日志标识记录 修改登录密码成功 **/public static final int XIUGAIDENGLUMIMASUC=206;
		/** 增加的日志标识记录 用户重复登录 **/public static final int USERREPEATLOGIN=207;
	    /** 增加的日志标识记录 修改登录密码失败 **/public static final int XIUGAIDENGLUMIMAFAIL=208;
	    /** 增加的日志标识记录 用户登录 **/public static final int USERLOGIN=100;
	    /** 增加的日志标识记录 用户登出 **/public static final int USERLOGOUT=101;
	    /** 增加的日志标识记录 开通商户 **/public static final int KAITONGMER=102;
	    /** 增加的日志标识记录 创建操作员 **/public static final int CHUANGJIANCAOZUOYUAN=103;
	    /** 增加的日志标识记录 修改操作员 **/public static final int UPDATECAOZUOYUAN=12;
	    /** 增加的日志标识记录 子账户冻结 **/public static final int ZIZHANGHUDONGJIE=105;
	    /** 增加的日志标识记录 集团审核子商户 **/public static final int JITUANSHENHEMER=106;
	    /** 增加的日志标示记录 解锁操作员 **/ public static final int UNLOCK=209;
	    
	    /** 黑名单和限额错误 黑名单用户 **/public static final int HEIMINGDAN=300;
	    /** 黑名单和限额错误 交易限额 **/public static final int RISKMONEYERROR=301;
	    /** 黑名单和限额错误 限额次数 **/public static final int RISKCOUNTERROR=302;
	    
	    /** 银行退款交易错误码 400001 **/public static final int TKBANK1=400001;
	    /** 银行退款交易错误码 400002 **/public static final int TKBANK2=400002;
	    /** 银行退款交易错误码 400003 **/public static final int TKBANK3=400003;
	    /** 银行退款交易错误码 400004 **/public static final int TKBANK4=400004;
	    /** 银行退款交易错误码 400005 **/public static final int TKBANK5=400005;
	    /** 银行退款交易错误码 400006 **/public static final int TKBANK6=400006;
	    /** 银行退款交易错误码 400007 **/public static final int TKBANK7=400007;
	    /** 银行退款交易错误码 400008 **/public static final int TKBANK8=400008;

	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账对象为空 **/public static final int FREEZETRANSFERERROR1=500001;
	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账账户ID为空s **/public static final int FREEZETRANSFERERROR2=500002;
	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账金额非法 **/public static final int FREEZETRANSFERERROR3=500003;
	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账账户不存在 **/public static final int FREEZETRANSFERERROR4=500004;
	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账账户状态错误 **/public static final int FREEZETRANSFERERROR5=500005;
	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账该笔划款信息已审核或已划款 **/public static final int FREEZETRANSFERERROR6=500006;
	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账划款账户ID为空 **/public static final int FREEZETRANSFERERROR7=500007;
	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账请求入库失败 **/public static final int FREEZETRANSFERERROR8=500008;
	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账更新冻结账户金额失败 **/public static final int FREEZETRANSFERERROR9=500009;
	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账未知错误 **/public static final int FREEZETRANSFERERROR10=500010;
	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账更新冻结账户金额失败 **/public static final int FREEZETRANSFERERROR11=500011;
	    /** 账户银行卡转账冻结金额错误码返回 银行卡转账账户可转账金额小于转账金额 **/public static final int FREEZETRANSFERERROR12=500012;
	    
	    /** 银行卡转账账户可转账金额小于转账金额 **/public static final int FREEZETRANSFERERROR13=500013;
	    /** 银行卡转账账户可转账金额小于转账金额 **/public static final int FREEZETRANSFERERROR14=500031;
	    
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，找不到手续费方案 **/public static final int DOFREEZETRANSFERERROR1=5000014;
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，手续费公式，比率不能小于0 **/public static final int DOFREEZETRANSFERERROR2=5000015;
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，手续费最小限额不能小于0 **/public static final int DOFREEZETRANSFERERROR3=5000016;
	    /** 账户银行转账冻结金额解冻 手续费最大限额不能小于或等于0，但可为-1 **/public static final int DOFREEZETRANSFERERROR4=5000017;
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，手续费最大限额不能小于0 **/public static final int DOFREEZETRANSFERERROR5=5000018;
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，账户记录为空 **/public static final int DOFREEZETRANSFERERROR6=5000019;
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，用户余额小于账户银行卡转账金额加账户银行卡转账手续费 **/public static final int DOFREEZETRANSFERERROR7=5000020;
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，用户冻结金额小于账户银行卡转账金额 **/public static final int DOFREEZETRANSFERERROR8=5000021;
	    /** 账户银行转账冻结金额解冻 [提现划款]，更新划款表信息失败 **/public static final int DOFREEZETRANSFERERROR9=5000022;
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，插入交易信息失败 **/public static final int DOFREEZETRANSFERERROR10=5000023;
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，账户不存在或账户MAC值无效 **/public static final int DOFREEZETRANSFERERROR11=5000024;
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，插入账户明细记录失败 **/public static final int DOFREEZETRANSFERERROR12=5000025;
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，未知错误 **/public static final int DOFREEZETRANSFERERROR13=5000026;
	    /** 账户银行转账冻结金额解冻 [账户银行卡转账]，待更新数据为空返回错误信息 **/public static final int DOFREEZETRANSFERERROR14=5000027;
	    /** 账户银行转账冻结金额解冻  **/public static final int DOFREEZETRANSFERERROR15=5000028;
	    /** 账户银行转账冻结金额解冻  **/public static final int DOFREEZETRANSFERERROR16=5000029;
	    /** 账户银行转账冻结金额解冻  **/public static final int DOFREEZETRANSFERERROR17=5000030;
	    
	    
	  //黑名单
	  	public static String BLOCK_NAME_MER = "MERID";  //商户号黑名单
	  	
	  	public static String BLOCK_NAME_POS = "POSID"; //pos号黑名单
	  	
	  	public static String BLOCK_NAME_CARDNO =  "BANKACCOUNT";//银行卡号号黑名单

	  	/** 受理业务类型：充值  **/public static final int USERCONTROLLE_VALUE_0 = 0;
	  	/** 受理业务类型：  转账**/public static final int USERCONTROLLE_VALUE_1 = 1;
	  	/** 受理业务类型：  结算**/public static final int USERCONTROLLE_VALUE_2 = 2;
	  	/** 受理业务类型：  支付**/public static final int USERCONTROLLE_VALUE_3 = 3;
	  	/** 受理业务类型：  提现**/public static final int USERCONTROLLE_VALUE_4 = 4;
	  	/** 受理业务类型：  签到**/public static final int USERCONTROLLE_VALUE_5 = 5;
	  	/** 受理业务类型：  查余**/public static final int USERCONTROLLE_VALUE_6 = 6;
	  	/** 受理业务类型：  退货**/public static final int USERCONTROLLE_VALUE_7 = 7;
	  	/** 受理业务类型：  撤销**/public static final int USERCONTROLLE_VALUE_8 = 8;
	  	
	  	/**数据字典表新增判断手机号、电话号码是否选填开关**/public static final String TDATADIC_ID = "memberUser";
	    /**
	     * 证件类型
	     */
	    public static HashMap<String ,String> CERTTYPES =new HashMap<String ,String>();
	    
	    public static Map<String ,String> getCERTTYPES(){
	    	CERTTYPES .put("1", "工商营业执照");
	    	return CERTTYPES;
	    }

	    /** 任务类型：日终核算  **/public static final int TASK_TYPE_0 = 0;
	    /** 任务类型：日终结算  **/public static final int TASK_TYPE_1 = 1;
	    
	    
		/**  银行卡支付 **/public static final int TORDER_SUBTYPE_BANK = 0; 
		/**  账户支付 **/public static final int TORDER_SUBTYPE_ACCOUNT = 1; 
		/**  组合支付 **/public static final int TORDER_SUBTYPE_GROUP = 2; 
		/**  无账户支付 **/public static final int TORDER_SUBTYPE_NOACCOUNT = 3; 
		/**  预付费卡支付 **/public static final int TORDER_SUBTYPE_CARD = 4; 
		/**  预付费账户充值 **/public static final int TORDER_SUBTYPE_CARDGROUP = 5; 
		/**  预付费无账户充值 **/public static final int TORDER_SUBTYPE_CARDNOACCOUNT = 6; 
		/**  POS交易 **/public static final int TORDER_SUBTYPE_POS = 10; 
		
		/**POS渠道bankId*/public static final String POS_BANK_ID="0002";
		/**预付费卡bankId*/public static final String CARD="0001";
		/**个人用户bankId*/public static final String USER="EPAY";
		
		/**  未通知0**/public static final int NOTIFY_MER_STATE0 = 0; 
		/**  通知成功 1**/public static final int NOTIFY_MER_STATE1 = 1; 
		/**  通知失败 2**/public static final int NOTIFY_MER_STATE2 = 2; 	
		
		/**  未绑定0**/public static final String BIND_STATE0 = "0"; 
		/**  已绑定1 **/public static final String BIND_STATE1 = "1"; 
		
		/**  停用0**/public static final int BOX_STATE0 = 0; 
		/**  启用 1**/public static final int BOX_STATE1 = 1; 
	    
		/**
		 * #提现手续费方式，
		 * 1为手续费计算在提现金额之内（例：提现申请1000元扣除账户1000元，手续费收2元，实际打款998）；
		 * 0为手续费不计算在提现金额之内（例：提现申请1000元扣除账户1002元，手续费收2元，实际打款1000元）；
		 */
		public static final int FEE_TYPE_0 = 0; 
		public static final int FEE_TYPE_1 = 1; 
		
		
		/**
		 * #pos批结算
		 * 1对账平；
		 * 2对账不平
		 * 3出错
		 */
		public static final int BATCH_SETT_STATE_1 = 1; 
		public static final int BATCH_SETT_STATE_2 = 2; 
		public static final int BATCH_SETT_STATE_3 = 3; 
		
		/**
		 * pos应用类型标志
		 * 
		 */
		public static String PRO_TYPEFALG_0 ="0";//磁条类
		public static String PRO_TYPEFALG_1 ="1";//Ic卡类
		
		
		
		/**
		 * 风控
		 */
		public static Long RISK_RULE_1 = 1L;//	单笔交易金额控制
		public static Long RISK_RULE_2 = 2L ;//	日交易笔数控制
		public static Long RISK_RULE_3 = 3L;//	交易卡类型控制
		public static Long RISK_RULE_4 = 4L;//	经营时间管控
		public static Long RISK_RULE_5 = 5L;//	日交易金额控制
		public static Long RISK_RULE_10= 10L;//	信用卡单笔限制
		public static Long RISK_RULE_11= 11L;//	单卡日累计限额
		public static Long RISK_RULE_12= 12L;//	单卡日累计笔数限制
		
		
		/**互联网支付*/public static final int ORDER_BUSI_TYPE_0 = 0;
		/**POS收单*/public static final int ORDER_BUSI_TYPE_1 = 1;
		/**手机移动支付*/public static final int ORDER_BUSI_TYPE_2 = 2;
		/**电视支付*/public static final int ORDER_BUSI_TYPE_3 = 3;
		
		/**硬件类型  0.艾21 1.pos 5.盒子  6.音频pos 8.蓝牙pos 9.bbpos 10.掌芯宝 11.QPOS*/
		public static short INVENTORY_i21Box=0;
		public static short INVENTORY_POS=1;
		public static short INVENTORY_shortBox=5;
		public static short INVENTORY_YPPOS=6;
		public static short INVENTORY_MPOS=8;
		public static short INVENTORY_BBPOS=9;
		public static short INVENTORY_ZXBPOS=10;
		public static short INVENTORY_QPOS=11;
		
		/**企业注册*/
		//审核状态
		public static final int AUDIT_STATE_0=0;//未审核
		public static final int AUDIT_STATE_1=1;//已完成审核
		public static final int AUDIT_STATE_2=2;//审核失败
		public static final int AUDIT_STATE_3=3;//未实名验证
		//注册步骤
		public static final int REG_STEP_0=0;//未进行实名验证
		public static final int REG_STEP_1=1;//进行实名验证
		public static final int REG_STEP_2=2;//填写企业对公账号
		public static final int REG_STEP_3=3;//填写法人代表信息
		public static final int REG_STEP_4=4;//填写代理人信息
		public static final int REG_STEP_5=5;//信息填写完毕
		public static final int REG_STEP_6=6;//审核阶段
		
		public static final int COMP_TYPE0=0;//企业
		public static final int COMP_TYPE1=1;//个人
		
		/**
		 * 增值业务产品ID：卡卡转账
		 */
		public static final int CARD_CARD_TRANSFER = 1;
		/**
		 * 增值业务产品ID：信用卡还款
		 */
		public static final int CREDIT_CARD_PAYMENT = 2;
		
}
