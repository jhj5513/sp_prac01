package spring.data.mongodb.dto;

import org.springframework.data.repository.PagingAndSortingRepository;


//�ƹ��͵� �������� �ʾ����� �̹� CRUD�� ������ �⺻ �޼ҵ带 �����ִ� repository�� ���� ����. : springdata ���ο��� �ڵ����� ����
public interface ScoreRepository extends PagingAndSortingRepository<Score, String>{

}
