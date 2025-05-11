package study.groom.domain.history.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.history.domain.entity.HistoryImage;

public interface HistoryRepository extends JpaRepository<HistoryImage,Long> {
}
