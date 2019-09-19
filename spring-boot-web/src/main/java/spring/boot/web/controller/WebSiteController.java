package spring.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.web.config.WebSiteConfig;

@RequestMapping("/website")
@RestController
public class WebSiteController {

    @Autowired
    private WebSiteConfig webSiteConfig;

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return webSiteConfig.toString();
    }
}
