package org.example.core.teste.gubee;

public class EmailPresenter implements PresenterNotification{
    @Override
    public void notification(String message) {
        System.out.printf("email %s", message);
    }
}
