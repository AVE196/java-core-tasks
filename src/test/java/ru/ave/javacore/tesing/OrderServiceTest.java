package ru.ave.javacore.tesing;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class OrderServiceTest {

    @Test
    void sendNotificationAfterGoodPay(){
        PaymentService paymentServiceMock = Mockito.mock(PaymentService.class);
        NotificationService notificationServiceMock = Mockito.mock(NotificationService.class);
        OrderService orderService = new OrderService(notificationServiceMock, paymentServiceMock);

        Mockito.when(paymentServiceMock.pay(100)).thenReturn(true);
        orderService.createOrder("Apple", 100);

        Mockito.verify(notificationServiceMock, Mockito.times(1)).sendNotification();

    }

    @Test
    void notSendNotificationAfterBadPay(){

        PaymentService paymentServiceMock = Mockito.mock(PaymentService.class);
        NotificationService notificationServiceMock = Mockito.mock(NotificationService.class);
        OrderService orderService = new OrderService(notificationServiceMock, paymentServiceMock);

        Mockito.when(paymentServiceMock.pay(10000000)).thenReturn(false);
        orderService.createOrder("Apple", 10000000);

        Mockito.verify(notificationServiceMock, Mockito.times(0)).sendNotification();

    }

}