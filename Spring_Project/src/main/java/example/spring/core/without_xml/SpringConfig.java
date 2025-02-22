package example.spring.core.without_xml;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration // Marks this class as a Configuration Unit
@ComponentScan(basePackages = { "another", "third", "example" }) // Used to perform package scan
public class SpringConfig {
	@Bean // Marks this method as a Bean Configuration Specific Method
	public GreetingImpL getGreetingImpl() {
		GreetingImpL gi = new GreetingImpL();
		return gi;
	}

	// Configuring a bean of type MessageImpl with some different ID: myMessage
	@Bean("myMessage") // changing default ID to myMessage
	public MessageImpl getMessageImpl() {
		MessageImpl mi = new MessageImpl();
		return mi;
	}

	// Configuring a bean of type: java.util.Collection
	@Bean("allCourses")
	public Collection<String> getCourseList() {
		Collection<String> courseList = Arrays.asList("Core Java", "Spring", "React", "Angular", "AWS");
		return courseList;
	}

	@Bean("myTest")
	@Lazy // marks this bean as Lazy so that it must gets loaded lazily.
			// This is equivalent of lazy-init = "true"
	@Scope("prototype")
	public TestImpl getTestImpl() {
		TestImpl ti = new TestImpl();
		return ti;
	}

}
