package com.javaadvanced.simulado.repository;

import com.javaadvanced.simulado.entity.Blog;
import com.javaadvanced.simulado.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    // JPQL
    @Query(value = "SELECT b FROM Blog b")
    List<Blog> jpqlTest1(String title);

    // JPQL
    @Query(value = "SELECT o, b FROM Owner o JOIN o.blogList b WHERE o.name=:title")
    List<Owner> jpqlTest2(@Param("title") String title);

    // JPQL
    //@Modifying
    //@Query(value = "update Owner o set o.name = :nome")
    //int jpqlTest3(@Param("nome") String nome);

    // Native Query
    @Query(value="select * from blogs b where b.title= :title", nativeQuery=true)
    List<Blog> getBlogsByTitleNative(String title);

}