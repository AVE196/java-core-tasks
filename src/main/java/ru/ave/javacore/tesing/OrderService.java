package ru.ave.javacore.tesing;


public class OrderService {

    private final NotificationService notificationService;
    private final PaymentService paymentService;

    public OrderService(NotificationService notificationService, PaymentService paymentService) {
        this.notificationService = notificationService;
        this.paymentService = paymentService;
    }

    public void createOrder(String name, double price) {
            boolean isGood = paymentService.pay(price);
            if (isGood) notificationService.sendNotification();
    }
}
