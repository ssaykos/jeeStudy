--ddl 테이블생성
create table member (
    memberid varchar2(10) primary key,--해당 컬럼 값은 반드시 존재해야 하며, 유일해야 함
    						--간편하게 추가 할때 이렇게 하지만 추천하지 않는다.
    password varchar2(10) not null,--null 비허용
    name     varchar2(20) not null,
    email    varchar2(80) ,
    constraint member_pk primary key(memberid),
    constraint member_fk_address foreign key(addressid) 
    references ADDRESS(addressid)
    
);
create table ADDRESS(
	addressid varchar2(10)
	constraint address_pk primary key(addressid)
);
commit;

-- ddl데이터 삭제--
drop table member; commit;

-- dml데이터 삽입(1)--
insert into member( memberid, password, name, email )
values('hong', 'hong', '홍길동', 'hong@naver.com'); commit;
-- SQL에서는 더블쿼터가 없다 DB가 만들어졌을때는 없는 용어였기 때문....즉 싱글쿼터만 써야되--

-- dml데이터 삽입(2)--
insert into member
values('hong2', 'hong2', '홍길동2', 'hong@naver.com2'); commit;

-- dml데이터 삽입(3)--널인값이 있을경우
insert into member( memberid, password, name )
values('hong2', 'hong2', '홍길동2'); commit;


-- dml데이터 조회--
select * from member;

-- dml데이터 조회(where 절 사용) --
select * from member;
where memberid = 'hong2';

if(memberid == "hong") {
 System.out.println(member);
 
-- dml두가지 조건을 가지고 검색
 
select * from member
where name = '홍길동' and email = 'hong@naver.com';

-- dml같지 않을때 검색
select * from member
where email is null;

--dml null 이 아닌경우
select * from member
where email is not null;

--dml 조건문 검색 like
select * from member
where name like '홍%'; --이름이 홍으로 시작하는 사람의 모든 데이터를 출력

select * from member
where name like '%길%'; --중간에 길 자가 들어가는 이름을 가진 모든 데이터를 출력

--dml 정렬
select * from member
where name like '%길%'
order by name asc; -- 가나다순 오름차순

select * from member
where name like '%길%'
order by name desc; --내림차순

--dml 중복정렬
select * from member
order by name asc, memberid asc;

--dml 내장된 함수
select count(*) from member;
--count()는 인스턴스 (row)의 수량을 출력함.
--그런데 파라미터 자리의 * count(*)이 오면 전체 갯수를 리턴.

--dml 데이터 수정
update member
set name='최길동' where memberid='hong2' and email is null;

--dml 데이터 수정 2
update member
set memberid='choi',password='choi' where name='최길동';

--dml데이터 삭제 delet !!  // 테이블 삭제 drop,
--차이는 클래스를 제거 하던지// 인스턴스를 제거하는 처리

delete from member where email = 'hong@naver.com2';

--ddl 테이블 수정 컬럼을 추가하는 구문
alter table member
add age number;commit;

--컬럼을 삭제
alter table member
drop column age;
commit;

--컬럼의 유형 변경
alter table member
modify age varchar(20);commit;

--컬럼 출력하기
desc member;

--인스턴스 간에 값을 식별할 수 있는 유일한 값이 필요하다
--=>제약조건 (constraint)
--1. null or not null
--2. unique or not unique
--3. check() 예)boolean 이면 참거짓.. 혹은 남여
--4. not null+unique =>primary key(기본키)PK
--5. 참조값 : 관계정의에 필요한 키값 => ([임의의 말로는])상속(부모-자식) =>foregin key(외래키)FK
--최대한 연산같은것은 프론트 단으로 보내서 연산 한후에 넘어오기때문에
--위의 연산은 데이터 베이스 에서는 위의 문장은 쓰지 않는것이 좋은것이다...

--primary key 추가 하기(memberid칼럼에 프라이머리키 기능주기)
alter table member
add constraint member_pk primary key(memberid);
commit;
--primary key는 하나만 줘야 한다.그리고 그것에 대한 별칭 또한 다른 테이블 에서도 유일 해야 한다.

--primary key 삭제
alter table member
drop primary key;

--pk조회
select table_name,
constraint_name,
constraint_type 
from user_constraints 
where table_name='MEMBERID';

--칼럼명 변경
alter table member
rename column memeberid to id;
commit;

--fk나누는법
