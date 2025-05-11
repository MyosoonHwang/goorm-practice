package study.groom.domain.cloth.domain.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import study.groom.domain.cloth.domain.entity.Category;
import study.groom.domain.cloth.domain.entity.Cloth;

public interface ClothRepository extends JpaRepository<Cloth,Integer>, JpaSpecificationExecutor<Cloth> {
}
