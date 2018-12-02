import com.jwt.ssd.controller.UserController;
import com.jwt.ssd.pojo.User;
import com.jwt.ssd.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml","classpath:springmvc.xml"})
public class Test {

    @Resource(name = "userController")
    private UserController userController;

    @Resource(name = "userService")
    private UserService userService;

    @org.junit.Test
    public void test01() {
        User user = userService.findByUsername("admin");
        System.out.println(user);
    }

    @org.junit.Test
    public void test02() {
        User user = userController.findByUsername("admin");
        System.out.println(user);
    }
}
