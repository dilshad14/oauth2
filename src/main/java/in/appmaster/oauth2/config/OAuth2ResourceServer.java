package in.appmaster.oauth2.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
 
@Configuration
@EnableWebSecurity
public class OAuth2ResourceServer extends WebSecurityConfigurerAdapter  
{
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/api/**").authenticated()
            .antMatchers("/").permitAll()
            .and()
            .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
    }
}