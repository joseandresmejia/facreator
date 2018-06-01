package com.iofractal.facreator.persistencia.test.user;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iofractal.facreator.persistencia.entity.user.User;
import com.iofractal.facreator.persistencia.repository.user.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/com/iofractal/facreator/conf/application-context-persistencia.xml" })
public class UsuarioTest {

	private static final Logger LOG = Logger.getLogger(UsuarioTest.class);

	@Autowired
	UserRepository userRepository;
	
	
	@Test
	public void test()  {

		Iterable<User> lista = userRepository.findAll();
		for (User user : lista) {
			System.out.println("name: "+ user.getUsername());
			System.out.println("password: " + user.getPassword());

		}
	}

}