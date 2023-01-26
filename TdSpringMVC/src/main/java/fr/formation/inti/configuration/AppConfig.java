//package fr.formation.inti.configuration;
//
//import java.util.Locale;
//
//import org.springframework.context.MessageSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.ReloadableResourceBundleMessageSource;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.servlet.LocaleResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.i18n.CookieLocaleResolver;
//import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = { "fr.formation.inti.*" })
//public class AppConfig implements WebMvcConfigurer {
//
//	@Bean
//	public InternalResourceViewResolver resolver() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setViewClass(JstlView.class);
//		resolver.setPrefix("/WEB-INF/views/");
//		resolver.setSuffix(".jsp");
//		return resolver;
//	}
//
//	@Bean(name = "messageSource") // permet de charger les msg qu'on mettra dans un fichier properties
//	public MessageSource getMessageResource() {
//		ReloadableResourceBundleMessageSource messageResource = new ReloadableResourceBundleMessageSource();
//		messageResource.setBasename("/i18m/message");
//		messageResource.setDefaultEncoding("UTF-8");
//		return messageResource;
//	}
//
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/").setViewName("index");
//	}
//
//	@Bean
//	public LocaleResolver localeResolver() {
//		CookieLocaleResolver resolver = new CookieLocaleResolver();
//		resolver.setDefaultLocale(new Locale("fr"));
//		resolver.setCookieName("myLocaleCookie");
//		resolver.setCookieMaxAge(4800);
//		return resolver;
//	}
//
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
//		interceptor.setParamName("mylocale");
//		registry.addInterceptor(interceptor);
//	}
//
//	@Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry
//          .addResourceHandler("/resources/**")
//          .addResourceLocations("/resources/");	
//    }
//
//}
