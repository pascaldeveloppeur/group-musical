package com.moriset.groupmusical;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.moriset.groupemusical.repository.ImemberRepository;
import com.moriset.groupmusical.model.Member;



@SpringBootTest
@EnableJpaRepositories(basePackages = {"com.moriset"})
class GroupMusicalApplicationTests {
	
	@Autowired
	private ImemberRepository memberRepository;

	@Test
	public void testCreateMember() {
		Member member = new Member("YAKOU YAMI","Pascal",new Date(),8500);
		memberRepository.save(member);
	}
	
	@Test
	
	public void testFindMember() {
		Member m = memberRepository.findById(2L).get();
		System.out.println(m);
		
	}
@Test
	
	public void testUpdateMember() {
		Member m = memberRepository.findById(3L).get();
		m.setFirstName("TCHAPGUA KAMGA");
		m.setLastName("Williams");
		memberRepository.save(m);
		
	}
@Test

public void testDeleteMember() {
	memberRepository.deleteById(1L);
	
}

@Test

public void testlisterTousMembers() {
	List<Member> members = memberRepository.findAll();
	for(Member m: members)
	{
		System.out.println(m);
	}
	
}

}
