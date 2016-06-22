package spring.data.mongodb.dto;

import org.springframework.data.repository.PagingAndSortingRepository;


//아무것도 정의하지 않았지만 이미 CRUD에 접근할 기본 메소드를 갖고있는 repository를 갖고 있음. : springdata 내부에서 자동으로 매핑
public interface ScoreRepository extends PagingAndSortingRepository<Score, String>{

}
