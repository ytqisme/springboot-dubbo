package com.springboot.dubbo.demo.provider.orm.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @auther CodeGenerator
 * @create 2020-11-28 23:05:43
 * @describe ATM流水表实体类
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AtmLog对象", description = "ATM流水表")
public class AtmLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "卡号")
    private String cardNo;

    @ApiModelProperty(value = "操作类型：1：取出0：存入")
    private String optTp;

    @ApiModelProperty(value = "流水号")
    private String txnNo;

    @ApiModelProperty(value = "交易金额，分")
    private BigDecimal txnAmt;

    @ApiModelProperty(value = "交易日期")
    private Date txnDt;

    @ApiModelProperty(value = "交易时间")
    private Date txnTm;

    @ApiModelProperty(value = "交易结果")
    private String txRetCd;

    @ApiModelProperty(value = "交易结果描述")
    private String txRetMsg;


    public String getCardNo() {
        return cardNo;
    }

    public AtmLog setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }

    public String getOptTp() {
        return optTp;
    }

    public AtmLog setOptTp(String optTp) {
        this.optTp = optTp;
        return this;
    }

    public String getTxnNo() {
        return txnNo;
    }

    public AtmLog setTxnNo(String txnNo) {
        this.txnNo = txnNo;
        return this;
    }

    public BigDecimal getTxnAmt() {
        return txnAmt;
    }

    public AtmLog setTxnAmt(BigDecimal txnAmt) {
        this.txnAmt = txnAmt;
        return this;
    }

    public Date getTxnDt() {
        return txnDt;
    }

    public AtmLog setTxnDt(Date txnDt) {
        this.txnDt = txnDt;
        return this;
    }

    public Date getTxnTm() {
        return txnTm;
    }

    public AtmLog setTxnTm(Date txnTm) {
        this.txnTm = txnTm;
        return this;
    }

    public String getTxRetCd() {
        return txRetCd;
    }

    public AtmLog setTxRetCd(String txRetCd) {
        this.txRetCd = txRetCd;
        return this;
    }

    public String getTxRetMsg() {
        return txRetMsg;
    }

    public AtmLog setTxRetMsg(String txRetMsg) {
        this.txRetMsg = txRetMsg;
        return this;
    }

    @Override
    public String toString() {
        return "AtmLog{" +
                "cardNo=" + cardNo +
                ", optTp=" + optTp +
                ", txnNo=" + txnNo +
                ", txnAmt=" + txnAmt +
                ", txnDt=" + txnDt +
                ", txnTm=" + txnTm +
                ", txRetCd=" + txRetCd +
                ", txRetMsg=" + txRetMsg +
                "}";
    }
}