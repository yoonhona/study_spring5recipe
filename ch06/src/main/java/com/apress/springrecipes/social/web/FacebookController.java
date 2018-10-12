package com.apress.springrecipes.social.web;

import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/facebook")
public class FacebookController {

    private final Facebook facebook;

    public FacebookController(Facebook facebook) {
        this.facebook = facebook;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        User user = facebook.userOperations().getUserProfile();
        return "facebook";
    }

    @PostMapping
    public String feed(@RequestParam("status") String status) {
        facebook.feedOperations().updateStatus(status);
        return "redirect:/facebook";
    }
}
