package com.crack.interview.repository;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface AbstractRepository<T, E extends Serializable> extends PagingAndSortingRepository<T, Serializable>{

}
