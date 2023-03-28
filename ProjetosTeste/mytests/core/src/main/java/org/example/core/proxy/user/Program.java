package org.example.core.proxy.user;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        UserDAO user = new ProxyUserDAO(new UserDAOImpl());
        user.find(1);
        user.find(2);
        user.find(3);


    }
}
