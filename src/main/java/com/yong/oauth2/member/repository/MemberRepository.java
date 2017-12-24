package com.yong.oauth2.member.repository;

import com.yong.oauth2.member.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
}
