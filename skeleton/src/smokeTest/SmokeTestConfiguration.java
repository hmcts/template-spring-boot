package uk.gov.hmcts.${{ values.product}}.${{ values.component | replace("-", "") }}.smoketests;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("uk.gov.hmcts.${{ values.product}}-${{ values.component }}.smoketests")
@PropertySource("application.properties")
public class SmokeTestConfiguration {
  //TODO: implement smoke tests here
}