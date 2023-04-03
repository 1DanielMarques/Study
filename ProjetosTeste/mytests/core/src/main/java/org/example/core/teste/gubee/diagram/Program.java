package org.example.core.teste.gubee.diagram;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Program {

    public static void main(String[] args) {
        //controller
        ScheduledExecutorService controller = Executors.newSingleThreadScheduledExecutor();

        // usa Use case input port
        UseCaseNotification notificationUseCase = new PoolingUseCaseNotification(); // Use case interactor


        //PresenterNotification emailPresenter = (message) -> System.out.printf("email %s", message);
        PresenterNotification emailPresenter = new EmailPresenter();

        //PresenterNotification whatsAppPresenter = (message) -> System.out.printf("whatApp% s", message);
        PresenterNotification whatsAppPresenter = new WhatsAppPresenter();

        //PresenterNotification smsPresenter = (message) -> System.out.printf("sms %s", message);
        PresenterNotification smsPresenter = new SmsPresenter();

        PresenterNotification[] notifications = {emailPresenter, whatsAppPresenter, smsPresenter};

        controller.scheduleAtFixedRate(() -> {
            var nextPos = Math.abs(new Random().nextInt()) % 3;
            notificationUseCase.notifyEveryHour(UUID.randomUUID().toString(), notifications[nextPos]);
            System.out.println();
        }, 1, 1, TimeUnit.SECONDS);


    }

}
