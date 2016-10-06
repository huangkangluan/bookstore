import com.fc.platform.commons.page.Page;
import com.hzit.StartWebApp;
import com.hzit.dao.entity.Book;
import com.hzit.service.impl.BookServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/10/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = StartWebApp.class)
public class Test_Book {
    @Autowired
    private BookServiceImpl bookService;
    @Test
    public void findall(){
        Page<Book> list=bookService.findPage(0,5);
        for (Book b:list){
            System.out.println(b.getBookName());
        }
    }
}
