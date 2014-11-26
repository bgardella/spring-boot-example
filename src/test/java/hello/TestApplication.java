package hello;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
@ContextConfiguration(classes = Application.class)
public class TestApplication {

    @Autowired
    private PersonRepository respository;
    
    private static ConfigurableApplicationContext appContext;
    
    @BeforeClass
    public static void startBootApp(){
        appContext = SpringApplication.run(Application.class, "");
    }
    
    @AfterClass
    public static void shutdownBootApp(){
        appContext.close();
    }

    
    
    
  
}
