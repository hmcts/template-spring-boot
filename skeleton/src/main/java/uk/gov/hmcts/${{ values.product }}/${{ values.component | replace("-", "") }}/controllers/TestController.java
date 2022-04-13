package uk.gov.hmcts.${{ values.product}}.${{ values.component | replace("-", "") }}.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Test endpoint.
 */
@RestController
public class TestController {

    @Operation(summary = "Test api",
        description = "This is a test endpoint"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "A test message"),
        @ApiResponse(responseCode = "404", description = "No welcome could be found")
    })
    @RequestMapping(value = "/testing", method = GET, produces = TEXT_PLAIN_VALUE)
    public ResponseEntity<String> welcome() {
        return ok("Hello and welcome to the test");
    }
}