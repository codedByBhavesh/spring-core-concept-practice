package org.example.config;

import org.example.beans.Hotel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Hotel hotelId() {

        Hotel info = new Hotel();

        info.setName("BHAVESH");
        info.setLocation("Mumbai");
        info.setRoom(101);
        info.setRating(4.5);

        return info;
    }
}


