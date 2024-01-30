package com.jpabook02.jpashop02;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em; // 이 어노테이션이 있으면 Entitymanager를 주입해준다.

    public Long save(Member member) {
        em.persist(member);
        return member.getId();
        // 커멘드와 쿼리를 분리하라. id만 리턴함으로써 나중에 조회할 수 있게 설정
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
