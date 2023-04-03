package org.example.core.teste.gubee.diagram;

public class WhatsAppPresenter implements PresenterNotification{
    @Override
    public void notification(String message) {
        System.out.printf("whatApp% s", message);
    }
}
