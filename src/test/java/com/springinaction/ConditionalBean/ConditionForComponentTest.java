package com.springinaction.ConditionalBean;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = Config.class)
public class ConditionForComponentTest {

//    @Autowired
//    private ConditionForComponent conditionForComponent;

//    @Test
//    public void test(){
//        conditionForComponent.test();
//        Assert.assertNotNull(conditionForComponent);
//    }

    @Test
    public void testByJavaConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ConditionForComponent conBean = context.getBean(ConditionForComponent.class);
        Assert.assertNotNull(conBean);
        conBean.test();
    }
}