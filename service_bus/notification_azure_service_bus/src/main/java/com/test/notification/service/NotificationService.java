package com.test.notification.service;

import com.test.notification.dto.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final StreamBridge streamBridge;

    public void sendNotification(Notification notification) {
        streamBridge.send("sbt-notification", notification);
    }

    public void saveNotification(Notification notification) {
        System.out.println(notification.getCoupon());
        System.out.println(notification.getExpirationDate());
    }
}
