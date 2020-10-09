package mybatis_puls.demo.contrler;

import mybatis_puls.demo.domain.User;
import mybatis_puls.demo.mapper.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserContrler {
    @Autowired
    private User2Mapper user2Mapper;
    @RequestMapping("test")
    public Object test1(){
        List<User> users = user2Mapper.selectList(null);
        return  users;
    }
}
