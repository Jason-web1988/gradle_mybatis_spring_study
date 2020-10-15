package gradle_mybatis_spring_study.service;

import static org.junit.Assert.*;

import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gradle_mybatis_spring_study.config.ContextRoot;
import gradle_mybatis_spring_study.dto.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextRoot.class})
public class StudentServiceTest {
    protected static final Log log = LogFactory.getLog(StudentServiceTest.class);

    @After
    public void tearDown() throws Exception {
        System.out.println();
    }

    @Autowired
    private StudentService service;

    @Test
    public void testSelectStudentForMap() {
        log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

        Map<Integer, String> map = service.selectStudentForMap(1);
        Assert.assertNotNull(map);
        map.forEach((k,v)->{log.debug(k + " -> " +  v);});
    }

    @Test
    public void testSelectStudentForMap2() {
        log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

        Map<Integer, Student> map = service.selectStudentForMap2(1);
        Assert.assertNotNull(map);
        map.forEach((k,v)->{log.debug(k + " -> " +  v);});
    }

}
