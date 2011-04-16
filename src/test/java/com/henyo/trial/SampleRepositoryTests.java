package com.henyo.trial;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class SampleRepositoryTests {
	@Autowired
	SampleRepository sampleRepository;
	
	@Test
	public void testSave(){
		Sample sample = new Sample();
		sample.setName("sample1");
		sampleRepository.save(sample);
		assertNotNull("id should not be null",sample.getId());
	}

}
