package org.cloud.configuration;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import jakarta.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf-> csrf.disable())
		.authorizeHttpRequests(auth -> auth
				.requestMatchers("/css/**", "/js/**", "/images/**", "/favicon.ico")
				.permitAll().requestMatchers("/", "/api/member/join", "/api/member/login", "/api/member/insertMember", "/api/board/openBoardList")
				.permitAll().anyRequest().authenticated())
		.formLogin(login -> login
				.loginProcessingUrl("/api/member/loginProc")
				.usernameParameter("userId")
				.passwordParameter("password")
				.successHandler((request, response, authentication) -> {
					response.setStatus(HttpServletResponse.SC_OK);
					response.setContentType("application/json;charset=UTF-8");
					response.getWriter().write("{\"status\":\"success\",\"userId\":\""+ authentication.getName() + "\"}");
				})
				.failureHandler((request, response, exception) -> {
					response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
					response.setContentType("application/json;charset=UTF-8");
					response.getWriter().write("{\"status\":\"error\", \"message\":\"로그인에 실패했습니다.\"}");
				})
				.permitAll())
		.logout(logout -> logout
				.logoutUrl("/api/member/logout")
				.logoutSuccessHandler((request, response, authentication) -> {
					response.setStatus(HttpServletResponse.SC_OK);
					response.setContentType("aplication/json;charset=UTF-8");
					response.getWriter().write("{\"status\":\"success\", \"message\":\"logout_success\"}");
				})
				.invalidateHttpSession(true)
				.deleteCookies("JSESSIONID"));
		
		return http.build();
	}
	
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(List.of("http://localhost:5173"));
		configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		configuration.setAllowedHeaders(List.of("*"));
		configuration.setAllowCredentials(true);
		
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		
		return source;
	}
}









