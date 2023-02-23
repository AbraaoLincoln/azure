package com.test.notification;

import com.test.notification.dto.Notification;
import com.test.notification.service.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class NotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

	@Bean
	public Consumer<Notification> saveNotification(NotificationService notificationService) {
		return notification -> {
			notificationService.saveNotification(notification);
		};
	}

}
