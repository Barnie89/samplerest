package com.samplerest.run;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.samplerest.base.test01;
import com.samplerest.base.test02;
import com.samplerest.base.test03;
import com.samplerest.base.test04;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	test01.class,
	test02.class,
	test03.class,
	test04.class
	
})
public class ApiSuite {
	
	

}
