package github.freeseawind.springboot.helloworld.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import github.freeseawind.service.IDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/** 
 * @author freeseawind   
 */
@SpringBootApplication
@Controller
@DubboComponentScan(basePackages = "github.freeseawind.springboot.helloworld.consumer")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerTest.class)
public class ConsumerTest
{
    @Reference
    private IDemoService demoService;
    
    @Test
    public void testRPC()
    {
        String str = demoService.sayHello("freeseawind");
        
        assertEquals("Hello freeseawind", str);
    }
}
