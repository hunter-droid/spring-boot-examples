package spring.boot.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.text.MessageFormat;

@Configuration
//@ConfigurationProperties(prefix = "website")
@PropertySource(value = "classpath:application.properties", encoding = "utf-8")
public class WebSiteConfig {
    @Value("${website.title}")
    private String title;
    @Value("${website.domain}")
    private String domain;
    @Value("${website.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Title:{0} Domin:{1} Description:{2}", title, domain, description);
    }
}
