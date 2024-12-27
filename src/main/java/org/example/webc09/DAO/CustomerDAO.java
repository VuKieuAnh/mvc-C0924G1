package org.example.webc09.DAO;

import org.example.webc09.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {

    public static final String URL_JDBC = "jdbc:mysql://localhost:3306/c09jdbc";
    public static final String USER = "root";
    public static final String PASSWORD = "123456@Abc";
    public static final String SELECT_FROM_CUSTOMER = "select * from customer;";
    private static final String CREATE_CUSTOMER = "insert into customer(name, email, phone) values (?, ?, ?);";
    //    Connection
    private Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(URL_JDBC,
                    USER, PASSWORD
             );
            System.out.println("Connection established");
            return connection;
        } catch (SQLException e) {
            System.out.printf("SQL Exception: %s%n", e);
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Customer> findAll() {
        Connection connection = getConnection();
        List<Customer> customers = new ArrayList<>();
        try {
//            statement: tao cau query tuong tac voi db
//            de chay query thong thuong: PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_CUSTOMER);
//            chay query ket qua se dc luu ResultSet
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
//                lay lan luot cac thuoc tinh bang resultset
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                Customer customer = new Customer(id, name, email, phone);
                customers.add(customer);
//                System.out.println(customer);
            }
//            return customers;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customers;
    }

    @Override
    public void save(Customer customer) {
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_CUSTOMER);
//            <index cua ?>: thu tu cua tham so trong sql statement bat dau tu 1
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getEmail());
            preparedStatement.setString(3, customer.getPhone());
            System.out.println(preparedStatement);
            int a = preparedStatement.executeUpdate();
//            xoa ban ghi: excuteUpdate
//            lay so ban ghi bi xoa
//            tim kiem: -> lay so luong ban ghi tim kiem dc
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
