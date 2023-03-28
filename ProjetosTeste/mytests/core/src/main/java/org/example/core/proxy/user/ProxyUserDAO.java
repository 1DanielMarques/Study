package org.example.core.proxy.user;

public class ProxyUserDAO implements UserDAO {
    private UserDAO userDAO;
    private static int cont = 1;

    public ProxyUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void find(int id) throws InterruptedException {
        System.out.println("Chamou método " + cont + " vezes.");
        userDAO.find(id);
        cont++;
    }
}
