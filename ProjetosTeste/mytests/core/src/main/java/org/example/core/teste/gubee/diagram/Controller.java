package org.example.core.teste.gubee.diagram;

import java.util.UUID;

public class Controller {

    private UseCaseNotification useCaseNotification;

    public Controller() {
        this.useCaseNotification = new PoolingUseCaseNotification();
    }

    void sendMessage(){
        this.useCaseNotification.notifyEveryHour(UUID.randomUUID().toString(), new EmailPresenter());
    }

}
