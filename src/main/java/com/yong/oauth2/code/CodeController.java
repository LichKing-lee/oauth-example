package com.yong.oauth2.code;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class CodeController {
        @RequestMapping("authorization-code")
        public String authorizationCodeTest(@RequestParam("code") String code) {
            String curl = String.format("curl " +
                    "-F \"grant_type=authorization_code\" " +
                    "-F \"code=%s\" " +
                    "-F \"scope=read\" " +
                    "-F \"client_id=foo\" " +
                    "-F \"client_secret=bar\" " +
                    "-F \"redirect_uri=http://localhost:8080/test/authorization-code\" " +
                    "\"http://foo:bar@localhost:8080/oauth/token\"", code);
            return curl;
        }
}
