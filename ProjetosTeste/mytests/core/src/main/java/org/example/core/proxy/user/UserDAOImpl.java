package org.example.core.proxy.user;

public class UserDAOImpl implements UserDAO {
    @Override
    public void find(int id) throws InterruptedException {
        System.out.println("Searching User[" + id + "]. . .");
        Thread.sleep(1000);
        System.out.println("User[" + id + "]");

    }
}
