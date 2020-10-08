package gradle_mybatis_spring_study.mapper;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gradle_mybatis_spring_study.config.ContextRoot;
import gradle_mybatis_spring_study.dto.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextRoot.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentMapperTest {
	private static final Log log = LogFactory.getLog(StudentMapperTest.class);
	
	@After
	public void tearDown() throws Exception {
	System.out.println();
	}
	
	@Autowired
	private StudentMapper mapper;
	@Test
	public void testSelectStudentByNo() {
		System.out.println("testSelectStudentByNo()");
		Student student = new Student();
		student.setStudId(1);
		Student selectedStd = mapper.selectStudentByNo(student);
		Assert.assertNotNull(selectedStd);
		
		log.debug(selectedStd.toString());
	}
	
	@Test
	public void testSelectStudentByNoWithResultMap() {
		System.out.println("testSelectStudentByNoWithResultMap()");
		Student student = new Student();
		student.setStudId(1);
		Student selectedStd = mapper.selectStudentByNoWithResultMap(student);
		Assert.assertNotNull(selectedStd);
		
		log.debug(selectedStd.toString());
	}

	@Test
	public void testSelectStudentByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		List<Student> list = mapper.selectStudentByAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}
	
}
