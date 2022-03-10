package com.lavorwebtokens;

import com.lavorwebtokens.config.JwtFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JfsJwtTwoApplication {
    @Bean
    public FilterRegistrationBean<JwtFilter> jwtFilter()

    {
        FilterRegistrationBean<JwtFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter( new JwtFilter() );
        registrationBean.addUrlPatterns( "/api/*" );
        return registrationBean;
    }

}
