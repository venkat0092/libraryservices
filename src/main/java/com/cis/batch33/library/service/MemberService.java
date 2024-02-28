package com.cis.batch33.library.service;

//import com.cis.batch33.library.model.Member;

import com.cis.batch33.library.entity.LibraryMember;
import com.cis.batch33.library.repository.LibraryBookRepository;
import com.cis.batch33.library.repository.LibraryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private LibraryMemberRepository memberRepository;
    @Autowired
    private LibraryBookRepository libraryBookRepository;

    //private Map<Long, Member> memberMap = new HashMap<>();

    public LibraryMember createMember(LibraryMember member){

        // call the database
        //Integer memberId = new Random().nextInt();
        //member.setMemberId(memberId);
        //memberMap.put(memberId, member);
        //return  member;
        return memberRepository.save(member);
    }


    public LibraryMember getMember(Integer memberId) {
        //return memberMap.get(memberId);
        Optional<LibraryMember> memberOptional = memberRepository.findById(memberId);
        return  memberOptional.orElse(new LibraryMember());
    }

    public LibraryMember updateMember(LibraryMember member) {
        //Integer memberId = member.getMemberId();
        //memberMap.put(memberId, LibraryMember);
        return memberRepository.save(member);
    }

    public void deleteMember(Integer memberId) {
        memberRepository.deleteById(memberId);
    }
}
// relational databases ( SQL )
// tables and rows, foreign key, structured
// mysql, oracle, postgres, db2, H2 Microsoft Sql Server
// SQL - structured query language
// programming -
// create and manage tables - DDL - data definition language
// create and manage data within tables - DML - Data manipulation
// access control - DCL - data control language
// install mysql
// TOAD, mysql workbench - IDE

// non- relational databases ( No-SQL)
// unstructured
// document based - mongodb,
// key value database - redis, dynamodb,  cassandra
// graph database -


// schema
// tables
// rows and columns
// functions -
// stored procedures -

// user name and password


// JAVA to Database connectivity

//  JDBC package , java.sql.*

// Connection - url, username and password, mysql - driver
// PreparedStatement
// ResultSet
// CallabaleStatement

// ORM - object relational mapping
// JPA Repositories

// GET POST PUT DELETE - member and book