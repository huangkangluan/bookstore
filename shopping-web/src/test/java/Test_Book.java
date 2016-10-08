import com.fc.platform.commons.page.Page;
import com.hzit.StartWebApp;
import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Dingdanxx;
import com.hzit.dao.entity.Userinfo;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.MyorderVo;
import com.hzit.service.BookService;
import com.hzit.service.DingdanxxService;
import com.hzit.service.MyorderService;
import com.hzit.service.UserInfoService;
import com.hzit.service.impl.BookServiceImpl;
import com.hzit.service.impl.UserInfoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = StartWebApp.class)
public class Test_Book {
    @Autowired
    private BookService bookService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private DingdanxxService dingdanxxService;
    @Autowired
    private MyorderService myorderService;
   @Test
    public void findall(){
        Page<Book> list=bookService.findPage(0,5);
        for (Book b:list){
            System.out.println(b.getBookName());
        }
    }

    @Test
    public void login(){
        //UserInfoServiceImpl us=new UserInfoServiceImpl();
//        Map m=new HashMap();
//        m.put("userName","李斯康");
//        m.put("userPwd","88881");
//        List<Userinfo> list= userInfoService.login(m);
//        if(list!=null){
//            System.out.println("登录成功");
//        }
//        else {
//            System.out.println("失败");
//        }
    }
    @Test
    public void find_Dingdanxx(){
        List<Dingdanxx> list=dingdanxxService.findAll();
        for (Dingdanxx d:list){
            System.out.println(d.getOrderPrice());
        }
    }
    @Test
     public void addorder(){


        MyorderVo myorderVo =new MyorderVo();

        myorderVo.setUserId(1);
        BookVo bv=new BookVo();
        bv.setBookId(1);
        bv.setBookPrice(22);
        bv.setCount(2);

        BookVo bv2=new BookVo();
        bv2.setBookId(2);
        bv2.setBookPrice(3332);
        bv2.setCount(44);

        List list=new ArrayList();
        list.add(bv);
        list.add(bv2);
        myorderVo.setGetbooklist(list);
        myorderService.addOrder(myorderVo);



    }


}


