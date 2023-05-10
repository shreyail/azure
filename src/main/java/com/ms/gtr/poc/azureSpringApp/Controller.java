package com.ms.gtr.poc.azureSpringApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    public class AzureController {
        @RequestMapping(value="/controller", method=GET)
        @ResponseBody
        public String foo() {
            return "Response!";
        }
    }

}
