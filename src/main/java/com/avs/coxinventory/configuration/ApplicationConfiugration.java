package com.avs.coxinventory.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class ApplicationConfiugration extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("cox").password("welcome").roles("ADMIN", "USER")
                .and().withUser("user").password("user").roles("USER");
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/h2-console/**").disable().
                headers().frameOptions().disable().and()
                .authorizeRequests().antMatchers("/**/favicon.ico").permitAll()
                .and().authorizeRequests().antMatchers("/article/**").permitAll()
                .and().authorizeRequests().antMatchers("/webjars/**").permitAll()
                .and().authorizeRequests().antMatchers("/static/css").permitAll()
                .and().authorizeRequests().antMatchers("/js").permitAll()
                .and().authorizeRequests().antMatchers("/pay").permitAll()
                .and().authorizeRequests().antMatchers("/register").permitAll()
                .and().formLogin().loginPage("/login").permitAll();


    }
}