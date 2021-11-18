package uk.gov.hmcts.${{ values.product}}.${{ values.component | replace("-", "") }}.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

/**
 * Default endpoints per application.
 */
@RestController
public class RootController {

    @GetMapping("/")
    public ResponseEntity<String> welcome() {
        return ok("This is the ${{ values.product }}-${{ values.component }} application");
    }
}
