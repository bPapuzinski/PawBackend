package com.paw.controller;

import act.controller.Controller;
import org.osgl.mvc.annotation.GetAction;

@Controller
public class HealthController {

    @GetAction("/health")
    public String health (String asd) {
        return "Running";
    }
}
