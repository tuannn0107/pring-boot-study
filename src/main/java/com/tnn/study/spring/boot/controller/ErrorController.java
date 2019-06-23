package com.tnn.study.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tuannn.
 */
@Controller
public class ErrorController {

    @GetMapping(value = "/error")
    public String renderErrorPage(final Model model, final HttpServletRequest request) {

        final int errorCode = getHttpStatusCode(request);
        model.addAttribute("errorCode", errorCode);

        switch (errorCode) {
            case 404:
                model.addAttribute("errorMsg", "Website is under development.");
                break;
            case 500:
                model.addAttribute("errorMsg", "Error occurred.");
                break;
            default:
                model.addAttribute("errorMsg", "Error occurred.");
        }
        return "common/error";
    }

    private int getHttpStatusCode(final HttpServletRequest request) {
        return (int) request.getAttribute("javax.servlet.error.status_code");
    }
}
