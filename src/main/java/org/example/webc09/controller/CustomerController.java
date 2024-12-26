package org.example.webc09.controller;

import org.example.webc09.model.Customer;
import org.example.webc09.service.CustomerService;
import org.example.webc09.service.ICustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/customers")
public class CustomerController extends HttpServlet {

    private ICustomerService customerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        action = action==null?"":action;
        switch (action) {
            case "create":
//                hien thi form tao moi
                showFormCreate(req, resp);
                break;
            default:
                showAllCustomer(req, resp);
        }
      }

    private static void showFormCreate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher1 = req.getRequestDispatcher("/customer/create.jsp");
        dispatcher1.forward(req, resp);
    }

    private void showAllCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/customer/index.jsp");
        List<Customer> list = customerService.findAll();
        req.setAttribute("list", list);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        lay danh sach tham so
        createCustomer(req, resp);

    }

    private void createCustomer(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int customerId = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        Customer customer = new Customer(customerId, name, email, phone);
        customerService.save(customer);
        resp.sendRedirect(req.getContextPath() + "/customers");
    }

    //    1: hien thi form tao moi du lieu
//    2: su kien submit form tao moi
}
