package com.example.LoanRecords;

import java.sql.SQLException;

public interface DaoInterface {
    public void add(LoanTable lt) throws ClassNotFoundException, SQLException;
    public LoanTable edit (LoanTable lt, String clientNo) throws SQLException, ClassNotFoundException;
    public void delete(String clientNo) throws SQLException, ClassNotFoundException;
    public void display() throws SQLException, ClassNotFoundException;
}
