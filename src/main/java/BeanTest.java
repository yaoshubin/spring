import com.spring.beans.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: shubin_yao
 * @Date: 2021/09/24/13:32
 * @Description:
 */
public class BeanTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-contxt.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
