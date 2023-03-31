package org.example.core.teste.gubee;

public class WhatsAppPresenter implements PresenterNotification{
    @Override
    public void notification(String message) {
        System.out.printf("whatApp% s", message);
    }
}
