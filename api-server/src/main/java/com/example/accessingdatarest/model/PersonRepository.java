package com.example.accessingdatarest.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * collectionResourceRel => HATEOAS ������ ��ü����Ʈ ��ȸ _embedded�� collection json path�� �� ��Ī
 * path => ���ҽ� ���� url path
 * 
 * @author "Jaeboo Jung"
 *
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {


}
