package com.example.LoanRecords;

public class LoanTable {
    private String clientNo;
    private String clientName;
    private double loanAmount;
    private int years;
    private String loanType;

    public LoanTable(String clientNo, String clientName, double loanAmount, int years, String loanType) {
        this.clientNo = clientNo;
        this.clientName = clientName;
        this.loanAmount = loanAmount;
        this.years = years;
        this.loanType = loanType;
    }

    public String getClientNo() {return clientNo;}

    public void setClientNo(String clientNo) {this.clientNo = clientNo;}

    public String getClientName() {return clientName;}

    public void setClientName(String clientName) {this.clientName = clientName;}

    public double getLoanAmount() {return loanAmount;}

    public void setLoanAmount(double loanAmount) {this.loanAmount = loanAmount;}

    public int getYears() {return years;}

    public void setYears(int years) {this.years = years;}

    public String getLoanType() {return loanType;}

    public void setLoanType(String loanType) {this.loanType = loanType;}
}
