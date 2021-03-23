
import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.impl.UserServiceImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appCont = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        System.out.println("Bean definition names: " + Arrays.toString(appCont.getBeanDefinitionNames()));
        UserService service = appCont.getBean(UserServiceImpl.class);
        List<User> allUsers = service.getAllUsers();
        for (User users : allUsers){
            System.out.println(users.getUserId() + " "
            + users.getEmail() + " " + users.getLogin());
        }
    }
}
