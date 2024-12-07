package org.heg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.heg.interceptors.MesurableInterceptor;

@Configuration
@EnableAspectJAutoProxy
public class AppConfiguration {

    @Bean
    public MesurableInterceptor myInterceptor() {
        return new MesurableInterceptor();
    }

}
