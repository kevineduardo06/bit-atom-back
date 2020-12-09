package br.senai.bitatom.configurations;

import br.senai.bitatom.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;



@Configuration
public class SecurityConfiguration  {


//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf().disable()
//                .authorizeRequests().anyRequest().authenticated()
//                .and().httpBasic();
//    }
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder authentication)
//            throws Exception
//    {
//        authentication.inMemoryAuthentication()
//                .withUser(paciente.getEmail())
//                .password(passwordEncoder().encode(paciente.getSenha()))
//                .authorities("ROLE_USER");
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
