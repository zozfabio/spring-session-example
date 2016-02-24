package br.edu.unidavi.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;
import static org.springframework.web.context.WebApplicationContext.SCOPE_SESSION;

@RestController @Lazy @Scope(SCOPE_SESSION)
@RequestMapping("/")
class Ctrl implements Serializable
{
    private static final byte serialVersionUID = 1;

    private Integer counter = 0;

    @RequestMapping(produces = TEXT_PLAIN_VALUE)
    public String home() {
        return (counter++).toString();
    }
}
