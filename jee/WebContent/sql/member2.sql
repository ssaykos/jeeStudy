create table member (
    memberid varchar2(10),
    password varchar2(10),
    name     varchar2(20),
    email    varchar2(80)
);
commit;

-- 데이터 삭제--
drop table member; commit;

-- 데이터 삽입(1)--
insert into member( memberid, password, name, email )
values('hong', 'hong', '홍길동', 'hong@naver.com'); commit;
-- SQL에서는 더블쿼터가 없다 DB가 만들어졌을때는 없는 용어였기 때문....즉 싱글쿼터만 써야되--

-- 데이터 삽입(2)--
insert into member
values('hong2', 'hong2', '홍길동2', 'hong@naver.com2'); commit;

-- 데이터 삽입(3)--널인값이 있을경우
insert into member( memberid, password, name )
values('hong2', 'hong2', '홍길동2'); commit;


-- 데이터 조회--
select * from member;

-- 데이터 조회(where 절 사용) --
select * from member;
where memberid = 'hong2';

if(memberid == "hong") {
 System.out.println(member);
 
-- 두가지 조건을 가지고 검색
 
select * from member
where name = '홍길동' and email = 'hong@naver.com';

-- 같지 않을때 검색
select * from member
where email is null;

--null 이 아닌경우
select * from member
where email is not null;

--조건문 검색 like
select * from member
where name like '홍%'; --이름이 홍으로 시작하는 사람의 모든 데이터를 출력

select * from member
where name like '%길%'; --중간에 길 자가 들어가는 이름을 가진 모든 데이터를 출력

--정렬
select * from member
where name like '%길%'
order by name asc; -- 가나다순 오름차순

select * from member
where name like '%길%'
order by name desc; --내림차순

--중복정렬
select * from member
order by name asc, memberid asc;

--내장된 함수
select count(*) from member;
--count()는 인스턴스 (row)의 수량을 출력함.
--그런데 파라미터 자리의 * count(*)이 오면 전체 갯수를 리턴.

--데이터 수정
update member
set name='최길동' where memberid='hong2' and email is null;

--데이터 수정 2
update member
set memberid='choi',password='choi' where name='최길동';

--데이터 삭제 delet !!  // 테이블 삭제 drop,
--차이는 클래스를 제거 하던지// 인스턴스를 제거하는 처리

delete from member where email = 'hong@naver.com2';
