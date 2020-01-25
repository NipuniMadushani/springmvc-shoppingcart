package lk.ijse.absd.springmvc;

import lk.ijse.absd.springmvc.controller.ProductController;
import lk.ijse.absd.springmvc.main.WebAppConfig;
import lk.ijse.absd.springmvc.main.WebRootConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class, WebRootConfig.class})
public class ProductControllerTest {
    @Autowired
    private ProductController productController;

    @Test
    public void test(){
        Assert.assertNotNull(productController.list());

    }
}
