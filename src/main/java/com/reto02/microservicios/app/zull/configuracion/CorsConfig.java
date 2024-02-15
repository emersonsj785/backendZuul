package com.reto02.microservicios.app.zull.configuracion;

import org.springframework.web.filter.CorsFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // Permitir todas las solicitudes de origen (puedes restringirlo a un origen específico si lo deseas)
        config.addAllowedMethod("*"); // Permitir todos los métodos HTTP
        config.addAllowedHeader("*"); // Permitir todos los encabezados
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
