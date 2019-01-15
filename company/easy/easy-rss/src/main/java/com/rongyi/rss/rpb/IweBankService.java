package com.rongyi.rss.rpb;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.easy.rpb.vo.*;

import java.util.Map;

/**
 * 微众支付服务接口
 * conan
 * 2017/2/27 13:46
 **/
public interface IweBankService {

    /**
     * 微众微信刷卡支付
     * @param ryMchVo 容易商户信息
     * @param wwPunchCardPayVo 刷卡支付业务参数
     * @return map
     */
    Map<String,Object> webankWechatPunchCardPay(RyMchVo ryMchVo,WwPunchCardPayVo wwPunchCardPayVo) throws TradePayException;

    /**
     * 微众微信支付查询
     * @param ryMchVo 容易商户信息
     * @param orderNo 订单号
     * @param payType 支付方式(0:支付宝,1:微信)
     * @param weBankMchNo 订单号
     * @return map
     */
    Map<String,Object> weBankWechatPayQuery(RyMchVo ryMchVo,String orderNo,Integer payType,String weBankMchNo) throws TradePayException;


    /**
     * 微众银行微信退款
     * @param orderNo 订单号
     * @param refundAmount 退款金额
     * @param refundReason 退款原因
     * @param weBankMchNo 微众商户号
     * @return map
     */
    Map<String,Object> webankWechatRefund(String orderNo,Integer refundAmount,String refundReason,String weBankMchNo) throws TradePayException;

    /**
     * 微众银行微信退款查询
     * @param orderNo 订单号
     * @param payType 支付方式(0:支付宝,1:微信)
     * @param weBankMchNo 微众商户号
     * @return map
     */
   // Map<String,Object> webankWechatRefundQuery(String orderNo,Integer payType,String weBankMchNo) throws TradePayException;

    /**
     * 微众银行微信刷卡支付撤销
     * @param orderNo 订单号
     * @param payType 支付方式(0:支付宝,1:微信)
     * @param weBankMchNo 微众商户号
     * @return map
     */
    Map<String,Object> weBankWechatReverse(String orderNo,Integer payType,String weBankMchNo) throws TradePayException;

    /**
     * 微众支付宝刷卡支付
     * @param ryMchVo 容易商户信息
     * @param waPunchCardVo 刷卡支付业务参数
     * @return map
     */
    Map<String,Object> webankAliPunchCardPay(RyMchVo ryMchVo,WaPunchCardVo waPunchCardVo) throws TradePayException;

    /**
     * 微众支付宝支付查询
     * @param ryMchVo 容易商户信息
     * @param orderNo 订单号
     * @param payType 支付方式(0:支付宝,1:微信)
     * @param weBankMchNo 订单号
     * @return map
     */
    Map<String,Object> weBankAliPayQuery(RyMchVo ryMchVo,String orderNo,Integer payType,String weBankMchNo) throws TradePayException;


    /**
     * 微众支付宝退款
     * @param orderNo 订单号
     * @param refundAmount 退款金额
     * @param refundReason 退款原因
     * @param weBankMchNo 微众商户号
     * @return map
     */
    Map<String,Object> webankAliRefund(String orderNo,Integer refundAmount,String refundReason,String weBankMchNo) throws TradePayException;

    /**
     * 微众支付宝退款查询
     * @param orderNo 订单号
     * @param payType 支付方式(0:支付宝,1:微信)
     * @param weBankMchNo 微众商户号
     * @param refundNo 退款请求号
     * @return map
     */
    Map<String,Object> webankAliRefundQuery(String orderNo,Integer payType,String weBankMchNo,String refundNo) throws TradePayException;


    /**
     * 微众银行支付宝刷卡支付撤销
     * @param orderNo 订单号
     * @param payType 支付方式(0:支付宝,1:微信)
     * @return map
     */
    Map<String,Object> weBankAliReverse(String orderNo,Integer payType,String weBankMchNo) throws TradePayException;


    /**
     * 微众支付宝支付查询
     * @param ryMchVo 容易商户信息
     * @param waScanPaySignVo 业务参数
     * @return map
     */
    Map<String,Object> weBankAliScanPaySign(RyMchVo ryMchVo,WaScanPaySignVo waScanPaySignVo) throws TradePayException;

    Map<String,Object> weBankWechatScanPaySign(RyMchVo ryMchVo,WwScanPaySignVo wwScanPaySignVo) throws TradePayException;

    Map<String,Object> weBankWechatAppletScanPaySign(RyMchVo ryMchVo,WwScanPaySignVo wwScanPaySignVo) throws TradePayException;
    /**
     * 微众银行微信部分退款查询
    * @param orderNo 订单号
    * @param payType 支付方式(0:支付宝,1:微信)
     *@param refundNo 商户退款单号
    * @param weBankMchNo 微众商户号
    * @return map
    */
    Map<String,Object> webankWechatPartRefundQuery(String orderNo,Integer payType,String refundNo,String weBankMchNo) throws TradePayException;

}