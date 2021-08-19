package com.example.LoanRecords;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoImplementation implements DaoInterface{

    Connection con;

    public DaoImplementation(Connection con) {this.con = con;}

    @Override
    public void add(LoanTable lt) throws ClassNotFoundException, SQLException {
        String qre1 = "insert into loantable values(?,?,?,?,?)";
        PreparedStatement obj1 = con.Connection().prepareStatement(qre1);
        obj1.setString(1, lt.getClientNo());
        obj1.setString(2, lt.getClientName());
        obj1.setDouble(3, lt.getLoanAmount());
        obj1.setInt(4, lt.getYears());
        obj1.setString(5, lt.getLoanType());
        obj1.executeUpdate();
        System.out.println();
        System.out.println("One record added");
    }

    @Override
    public LoanTable edit(LoanTable lt, String clientNo) throws SQLException, ClassNotFoundException {
        String qre1 = "update loantable set clientno = ?, clientname = ?," +
                "loanamount = ?, years = ?, loantype = ? where clientno = ?";
        PreparedStatement obj1 = con.Connection().prepareStatement(qre1);
        obj1.setString(1, lt.getClientNo());
        obj1.setString(2, lt.getClientName());
        obj1.setDouble(3, lt.getLoanAmount());
        obj1.setInt(4, lt.getYears());
        obj1.setString(5, lt.getLoanType());
        obj1.setString(6, clientNo);
        obj1.executeUpdate();
        System.out.println("One record edited");
        return lt;
    }

    @Override
    public void delete(String clientNo) throws SQLException, ClassNotFoundException {
        String qre1 = "delete from loantable where clientno = ?";
        PreparedStatement obj1 = con.Connection().prepareStatement(qre1);
        obj1.setString(1, clientNo);
        obj1.executeUpdate();
        System.out.println("One record deleted");
    }

    @Override
    public void display() throws SQLException, ClassNotFoundException {
        LoanTable ltDisplay;

        String qre1 = "select * from loantable";
        PreparedStatement obj1 = con.Connection().prepareStatement(qre1);
        ResultSet rs = obj1.executeQuery();
        while(rs.next()){
            ltDisplay = new LoanTable(rs.getString("clientno"), rs.getString("clientname"),
                rs.getDouble("loanamount"), rs.getInt("years"), rs.getString("loantype"));
            System.out.println();
            System.out.println("Client Number: " + ltDisplay.getClientNo());
            System.out.println("Client Name: " + ltDisplay.getClientName());
            System.out.println("Loan Amount: " + ltDisplay.getLoanAmount());
            System.out.println("Years: " + ltDisplay.getYears());
            System.out.println("Loan Type: " + ltDisplay.getLoanType());
        }
    }
}
