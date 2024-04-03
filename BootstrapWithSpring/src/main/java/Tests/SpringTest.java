package Tests;

import config.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {WebConfig.class, PersistenceExceptionTranslationAutoConfiguration.class},
        loader =  AnnotationConfigContextLoader.class
)
public class SpringTest {

    @Test
    public void whenSpringContextIsInitiated_thenNoExceptions(){
        // When
    }
}
