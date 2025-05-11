package study.groom.domain.member.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.history.domain.entity.MemberLike;

public interface MemberRepository extends JpaRepository<MemberLike,Long> {
}
