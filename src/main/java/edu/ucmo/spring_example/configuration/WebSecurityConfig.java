package edu.ucmo.spring_example.configuration;

import edu.ucmo.spring_example.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                // Specifies the userDetailsService object that Spring will call
                // with usernames and expect authorities to be returned.
                .userDetailsService(userDetailsService)
                // Specifies that we will use the given password encoder to
                // hash passwords for storage and comparison.
                .passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // Section of configuration that controls access to specific HTTP routes.
                // First function call specifies to use authorization on requests
                // Anyone can access the /info page, even if not logged in.
                // Only admins can access the user table API
                // All other pages and APIs may be accessed by both users and admins.
                .authorizeRequests()
                .antMatchers("/info").permitAll()
                .antMatchers("/").hasAnyAuthority("USER","ADMIN")
                .antMatchers("/cars").hasAnyAuthority("USER","ADMIN")
                .antMatchers("/cars/**").hasAnyAuthority("USER","ADMIN")
                .antMatchers(HttpMethod.POST, "/cars").hasAnyAuthority("USER","ADMIN")
                .antMatchers(HttpMethod.PUT, "/cars/**").hasAnyAuthority("USER","ADMIN")
                .antMatchers("/users").hasAuthority("ADMIN")
                .and()
                // Section of configuration that specifies the login form
                // The username and password parameter function calls specify the name of the field in the
                // HTML form that should be used for that paremeter.
                // The loginPage() call specifies the route that will be used for the login page
                //   (Points to the LoginController in our case.)
                // Finally, all users can access the login page.
                .formLogin()
                .usernameParameter("user_name")
                .passwordParameter("password")
                .loginPage("/login")
                .permitAll()
                .and()
                // Section of configuration that deals with logout.
                // We make sure and invailidate the current session and delete the session cookies
                // Once again, all users can access the logout page.
                .logout()
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")
                .permitAll();

    http
            // Specifies that we will use Cross Site Request Forgery tokens
            // and calls a factory method to get an instance of the repository to use for tokens.
            .csrf()
            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());

    }
}