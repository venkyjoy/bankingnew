package com.bankingnew;

public class Transaction {
    private int tranNumber;
    private int actNumber;
    private int tranAmount;
    private String tranType;
    private int balanceAfterThisTransacction;
    public Transaction() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Transaction(int tranNumber, int actNumber, int tranAmount, String tranType,
                       int balanceAfterThisTransacction) {
        super();
        this.tranNumber = tranNumber;
        this.actNumber = actNumber;
        this.tranAmount = tranAmount;
        this.tranType = tranType;
        this.balanceAfterThisTransacction = balanceAfterThisTransacction;
    }
    public int getTranNumber() {
        return tranNumber;
    }
    public void setTranNumber(int tranNumber) {
        this.tranNumber = tranNumber;
    }
    public int getActNumber() {
        return actNumber;
    }
    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }
    public int getTranAmount() {
        return tranAmount;
    }
    public void setTranAmount(int tranAmount) {
        this.tranAmount = tranAmount;
    }
    public String getTranType() {
        return tranType;
    }
    public void setTranType(String tranType) {
        this.tranType = tranType;
    }
    public int getBalanceAfterThisTransacction() {
        return balanceAfterThisTransacction;
    }
    public void setBalanceAfterThisTransacction(int balanceAfterThisTransacction) {
        this.balanceAfterThisTransacction = balanceAfterThisTransacction;
    }

}