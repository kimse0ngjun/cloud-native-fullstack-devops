//package org.cloud.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.csrf.CsrfAuthenticationStrategy;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		http.csrf(csrf-> csrf.disable())
//		.authorizeHttpRequests(auth -> auth
//				.requestMatchers("/css/**", "/js/**", "/images/**", "/favicon.ico")
//				.permitAll().requestMatchers("/", "/notice", "/login", "/join", "/idCheck/**")
//				.permitAll().anyRequest().authenticated())
//		.formLogin(login -> login
//                .loginPage("/login")
//                .usernameParameter("userId")
//                .passwordParameter("userPw")
////                .defaultSuccessUrl("/", true)
//                .permitAll()
//            )
//		.logout(logout -> logout
//				.logoutUrl("/logout")
//				.logoutSuccessUrl("/") 
//				.invalidateHttpSession(true)
//				.deleteCookies("JSESSIONID"));
//		
//		return http.build();
//	}
//}

package org.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // POST 요청(로그인, 가입)을 허용하기 위해 필수
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/**").permitAll() 
                .anyRequest().permitAll()
            )
            .formLogin(login -> login.disable()) 
            .logout(logout -> logout.disable());
        
        return http.build();
    }
}