package com.component.products;

import com.component.products.config.TestDatabaseConfig;
import io.specmatic.test.SpecmaticContractTest;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ProductsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = {TestDatabaseConfig.class})
@ActiveProfiles("contract-tests")
public class ContractTests implements SpecmaticContractTest {
}
