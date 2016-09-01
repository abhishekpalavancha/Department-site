package model;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class junittest {

	@Test
	public void test() {
		alumniinfo alumniinfotest = new alumniinfo();
		alumniinfotest.setName("testalumni");
		alumniinfotest.setDescription("test description");
		int result=alumniinfotest.save();
		assertEquals(1,result);
		
		addcourses addcoursestest = new addcourses();
		addcoursestest.setCourseid("111");
		addcoursestest.setCoursename("test Coursename");
		int result1=alumniinfotest.save();
		assertEquals(1,result1);
		
		Event eventtest = new Event();
		eventtest.setEventid("111");
		eventtest.setEvent("event111");
		eventtest.setDescription("description");
		int result2=alumniinfotest.save();
		assertEquals(1,result2);
		
		exam examttest = new exam();
		examttest.setNameofexam("csi111");
		examttest.setDateofexam("event111");
		examttest.setOptionallinks("link");
		int result3=examttest.save("789");
		assertEquals(1,result3);
		
		infocourse infocoursetest = new infocourse();
		infocoursetest.setCourseid("11");
		infocoursetest.setOfficehours("11-2");
		infocoursetest.setTainfo("testgood");
		infocoursetest.setTainfo("full");
		int result4=infocoursetest.save();
		assertEquals(1,result4);
		
		jobs jobstest = new jobs();
		jobstest.setIdentity("testid1212");
		jobstest.setJobs("sde");
		jobstest.setDescription("good");
		jobstest.setJobid("job111");
		int result5=examttest.save("789");
		assertEquals(1,result5);
		
		phdinfo phdinfotest = new phdinfo();
		phdinfotest.setPhdid("111");
		phdinfotest.setSemester("3");
		phdinfotest.setOtherinformation("good");
	
		int result7=examttest.save("789");
		assertEquals(1,result7);
		
		news newstest = new news();
		newstest.setIdentity("testid1212");
		newstest.setNews("sde");
		newstest.setDescription("good");
		newstest.setNewsid("job111");
		int result6=examttest.save("789");
		assertEquals(1,result6);
		
		register registertest = new register();
		registertest.setNetid("797876");
		registertest.setPassword("passwrd");
		registertest.setFirstname("ab");
		registertest.setLastname("hi");
		int result9=registertest.save();
		assertEquals(1,result9);
		
		enroll enrolltest = new enroll();
		enrolltest.setIdentity("312");
		enrolltest.setNet("789");
		
		int result10=registertest.save();
		assertEquals(1,result10);
		
		
	}

}
