package com.cg.main.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.entities.Composer;
import com.cg.main.repository.ComposerRepository;
import com.cg.main.service.ComposerService;

import antlr.collections.List;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)

public class ArtistTest {

	@Mock
	private ComposerRepository composerRepository;

	@InjectMocks
	private ComposerService composerService;
	//---------------------GETALL METHOD------------------------------
		@Test
		public void getAllComposerTest() throws Exception{
			java.util.List<Composer> expectedComposerList= new ArrayList<>();
			Composer expectedComposer = new Composer();
			expectedComposer.setcomposerId(1000);
			expectedComposer.setComposer_name("abcd");
			expectedComposer.setComposer_dob("dec");
			expectedComposer.setComposer_died("nov");
			expectedComposer.setCreated_by(1);
			expectedComposer.setCreated_on("2april");
			expectedComposer.setUpdated_by(2);
			expectedComposer.setUpdated_on("2may");
			expectedComposer.setDeletedflag(false);
			
			//expectedComposerList.add(expectedComposer);
		//	when(ComposerRepository.findAll()).thenReturn(expectedComposerList);
			java.util.List<Composer> actualComposerList = composerService.getAllComposer();
			System.out.println(actualComposerList.toString());
			System.out.println(actualComposerList.toString());
			assertEquals(actualComposerList, expectedComposerList);

		}
		//--------------------POST METHOD----------------------------
		@Test
		public void createComposerTest() throws Exception{
			Composer actualComposer = new Composer();
			actualComposer.setcomposerId(1000);
			actualComposer.setComposer_name("abcd");
			actualComposer.setComposer_dob("dec");
			actualComposer.setComposer_died("nov");
			actualComposer.setCreated_by(1);
			actualComposer.setCreated_on("2april");
			actualComposer.setUpdated_by(2);
			actualComposer.setUpdated_on("2may");
			when(composerRepository.save(actualComposer)).thenReturn(actualComposer);

			Composer expectedComposer = composerService.addComposer(actualComposer);
			System.out.println(actualComposer.toString());
			System.out.println(expectedComposer.toString());
			assertEquals(expectedComposer, actualComposer);

		}
		//-----------------------------------------PUT METHOD------------------------------------------

		@Test
		public void updateComposerTest() {
			Composer actualComposer = new Composer();
			actualComposer.setcomposerId(1000);
			actualComposer.setComposer_name("abcd");
			actualComposer.setComposer_dob("dec");
			actualComposer.setComposer_died("nov");
			actualComposer.setCreated_by(1);
			actualComposer.setCreated_on("2april");
			actualComposer.setUpdated_by(2);
			actualComposer.setUpdated_on("2may");
			//actualComposer.setComposerDeletedFlag(false);
			when(composerRepository.getOne(1000)).thenReturn(actualComposer).thenReturn(actualComposer);
			Composer expectedComposer = composerService.updateComposer(actualComposer.getComposerId(), actualComposer);
			System.out.println("actual");
			System.out.println(actualComposer.toString());
			System.out.println("expected");

			System.out.println(expectedComposer.toString());
			assertEquals(expectedComposer, actualComposer);
			
			
		}
		
		
		
		
		
}
