package org.example.core.teste.gubee.diagram;

public class SmsPresenter implements PresenterNotification{
    @Override
    public void notification(String message) {
        System.out.printf("sms %s", message);
    }
}
