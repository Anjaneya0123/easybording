package com.jsp.jst_ticket_booking_spring_boot.configure;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

    @Configuration
    public class WebConfig {

        @Bean
        public CorsFilter corsFilter() {
            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            CorsConfiguration config = new CorsConfiguration();
            config.addAllowedOrigin("http://localhost:5173"); // Allow your frontend URL
            config.addAllowedMethod("*");
            config.addAllowedHeader("*");
            source.registerCorsConfiguration("/**", config);
            return new CorsFilter(source);
        }
    }
