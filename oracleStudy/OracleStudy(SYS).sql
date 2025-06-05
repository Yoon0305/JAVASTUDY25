desc emp;   -- emp 테이블 구조보기
select * from emp; -- emp 테이블 내용보기

desc dept;  -- dept 테이블 구조보기
select * from dept; --dept 테이블 내용보기

desc bonus; -- bonus 테이블 구조보기
select * from bonus; -- bonus 테이블 내용보기

desc salgrade;  --salgrade 테이블 구조보기
select * from salgrade; -- salgrade 테이블 내용보기

SELECT EMPNO, ENAME, DEPTNO FROM EMP; -- EMP(직원 정보 테이블)에서 사원번호(EMPNO), 사원 이름(ENAME), 부서번호(DEPTNO)만 선택

SELECT DISTINCT DEPTNO FROM EMP; -- SELECT DISTINCT를 이용해서 중복 열 제거 (테이블에서 데이터 추출 시, 중복된 부서 번호 제거 후 출력 즉, CATEGORIZE) DISTINCT- 특정짓다.

SELECT DISTINCT JOB, DEPTNO FROM EMP -- DISTINCT 는 중복을 제거하는 것이므로, JOB + DEPTNO 의 값중에서 중복되지 않은 종류들만 출력

SELECT ALL JOB, DEPTNO FROM EMP; -- DISTINCT와 반대개념. EMP상에 존재하는 모든 JOB + DEPTNO의 결합된 값들을 모두 출력. READ ALL 과 같은 개념.

SELECT ENAME, SAL, SAL*12+COMM, COMM FROM EMP; -- EMP 테이블에서 사원명, 급여, 급여x12+추가수당 을 선택해서 출력. 추가수당(COMM)이 null값인 사람들은 출력되지 않았음.

SELECT ENAME, SAL, SAL+SAL+SAL+SAL+SAL+SAL+SAL+SAL+SAL+SAL+SAL+SAL+COMM, COMM FROM EMP; --곱하기를 사용하지 않아도 연산식 내의 COMM값이 null인 사람들은 여전히 출력되지 않음.

-- 별칭 지적 방식 1)SAL*12+COMM ANNSAL  / 2)SAL*12+COMM "ANNSAL" / 3)SAL*12+COMM AS ANNSAL / 4)SAL*12+COMM AS "ANNSAL"

SELECT ENAME, SAL, SAL*12+COMM AS ANNSAL, COMM FROM EMP; -- COMM이 NULL인 사람 제외 연봉이 ANNSAL로 출력

--ex) String sql = "SELECT ENAME, SAL, SAL*12+COMM AS ANNSAL, COMM FROM EMP; 이런 형식으로 sql 명령문을 그대로 String해서 JAVA에 붙여넣는 경우가 많은데, 별칭 작성에 ""를 쓰면 오류가 발생하기 때문에 AS ~ 로 지정하는 경우가 많음.

SELECT * FROM EMP ORDER BY SAL; -- SELECT 선택한다, * 하부 전체의, EMP 테이블의, SAL의 오름차순 기준으로 (기본이 오름차순)

SELECT * FROM EMP ORDER BY SAL DESC; -- 위와 같은 조건이나 DESC 를 통해 내림차순 기준으로 정렬

SELECT * FROM EMP ORDER BY DEPTNO ASC, SAL DESC; -- 위의 두 코드를 응용한것으로 EMP테이블 전체를 불러오되 DEPTNO(사원번호)는 오름차순, SAL(급여)는 내림차순으로 정렬해서 출력

-- ORDER BY를 통한 정렬은 데이터를 확정한 상태에서 ASC, DESC기준에 따라 다시 정렬하게 되는 작업이므로 출력 시간이 더 오래걸리고 서비스 응답시간이 길어질 수 있어 자제하는것이 좋다.

SELECT DISTINCT JOB FROM EMP;
--92p Q2예제

SELECT EMPNO AS EMPLOYEE_NO, ENAME AS EMPLOYEE_NAME, MGR AS MANAGER, SAL AS SALARY, COMM AS COMMISSION, DEPTNO AS DEPARTMENT_NO FROM EMP ORDER BY DEPTNO DESC, ENAME ASC;
--92p 예제Q3

SELECT * FROM EMP; -- EMP테이블 전체 출력

-- SELECT 구문의 전반적인 형태 : SELECT (DISTINCT) COLUMN이름, ROW이름,... FROM 테이블 이름 (ORDER BY COLUMN|ROW ASC|DSC);

-- SELECT 이후 특정 행 또는 열 선택 없이 테이블 전체 출력 시 : SELECT * FROM EMP;

SELECT * FROM EMP WHERE DEPTNO = 30;

-- WHERE을 사용해서 COLUMN이나 ROW이름이 아닌 COLUMN이나 ROW의 값에 따라 추출 후 출력.

-- 영어 문법 구사 순서와 동일함을 알 수 있음.ORDER BY 또는 WHERE과 같은 절은 가장 끝에 등장.

-- WHERE 절은 BOOLEAN과 유사한 성격으로, 위의 예제에서는 DEPTNO = 30이 TRUE로 설정.

SELECT * FROM EMP WHERE DEPTNO = 30 AND JOB = 'SALESMAN';
-- Select all from EMP where(if) DEPTNO is 30 and JOB is SALESMAN.

SELECT * FROM EMP WHERE EMPNO = 7499 AND DEPTNO = 30;
-- Select all from EMP where(if) EMPNO is 7499 and DEPTNO is 30.

SELECT * FROM EMP WHERE DEPTNO = 30 OR JOB = 'CLERK';
-- AND와 같은 느낌임. Select all from EMP where(if) DEPTNO is 30 or Job is CLERK.

--WHERE절 뒤에 AND, OR을 덧붙여서 복수의 조건을 만족하는 형태를 많이 사용하나, 다양한 조건을 한번에 만족하기 위에 AND를 더 많이 씀.

SELECT * FROM EMP WHERE SAL * 12 = 36000;
-- Select all from EMP where(if) SAL*12 is 36000.

SELECT * FROM EMP WHERE SAL>=3000;

SELECT * FROM EMP WHERE ENAME >= 'F';
--유니코드상의 숫자값이 F와 같거나 F 숫자값 이상의 숫자값의 알파벳으로 시작하는 이름들 F,G,H,I, ...만 출력

SELECT * FROM EMP WHERE ENAME <= 'FORZ';
-- F O R Z 각각의 숫자값 보다 작거나 같은 이름들만 출력. 예를 들어 FIND라는 이름은 F는 같은값 I는 O 보다 작은값이라 출력인 것.

-- 즉, 각 자리 별 숫자값이 큰지 작은지를 비교해서 출력하는 것이므로 F I 가 앞에서 만족을 했기 때문에 뒷자리의 조건은 비교하지 않고 출력한것.

-- 만약 F O S Z라는 이름이 있으면 FORZ 뒤에 출력되는 형식

-- con.)첫 자리가 F보다 작거나 같으면 우선 출력은 되는 것이다. 그 뒤의 순서는 각 자리값의 대소 비교로 출력 순서가 정해짐.

SELECT * FROM EMP WHERE SAL != 3000;

SELECT * FROM EMP WHERE SAL <> 3000;

SELECT * FROM EMP WHERE SAL ^= 3000;

-- !=, <> , ^= 모두 같은 의미.

SELECT * FROM EMP WHERE NOT SAL = 3000;

-- AND, OR 같은 조건이 여러개가 묶여있는 조건식의 반대값을 구하는 경우에 NOT하나를 붙여서 반대 결과를 얻을 수 있는 편리함이 있음.

SELECT * FROM EMP WHERE JOB = 'MANAGER' OR JOB = 'SALESMAN' OR JOB = 'CLERK';

SELECT * FROM EMP WHERE JOB IN('MANAGER', 'SALESMAN', 'CLERK');
-- Select all from EMP where(if) job in(has) MANAGER, SALESMAN, CLERK.

SELECT * FROM EMP WHERE JOB != 'MANAGER' AND JOB <> 'SALESMAN' AND JOB ^= 'CLERK';
--Select all from EMP if job is not MANAGER and job is not SALESMAN and JOB is not CLERK.

SELECT * FROM EMP WHERE JOB NOT IN ('MANAGER', 'SALESMAN', 'CLERK');
--Select all from EMP if job doesn't have MANAGER, SALESMAN, CLERK.

SELECT * FROM EMP WHERE SAL>= 2000 AND SAL <= 3000;
-- Select all from EMP if sal is bigger than 2000 and sal is smaller than 3000.

SELECT * FROM EMP WHERE SAL BETWEEN 2000 AND 3000;
-- Select all from EMP if SAL between 2000 and 3000.

SELECT * FROM EMP WHERE SAL NOT BETWEEN 2000 AND 3000;
-- Select all from EMP if SAL is not between 2000 and 3000.

SELECT * FROM EMP WHERE ENAME LIKE 'S%';
-- Select all from EMP if ENAME looks like S~ (길이와 상관없이 s로 시작하는 문자열)

SELECT * FROM EMP WHERE ENAME LIKE '_L%';
-- Select all from EMP if ENAME looks like _L~ (앞에 한글자 있고, 두번째가 L로 시작하며 뒤에 길이 상관없는 문자열 조건)

SELECT * FROM EMP WHERE ENAME LIKE '%AM%';
-- Select all from EMP if ENAME looks like %AM% (이름 사이 AM이 들어간 사람들만)

SELECT * FROM EMP WHERE ENAME NOT LIKE '%AM%';
-- Select all from EMP if ENAME is not looks like %AM% (이름 사이 AM이 안들어간 사람만)

SELECT * FROM SOME_TABLE WHERE SOME_COLUMN LIKE 'A\_A%' ESCAPE '\';
-- Select all from SOME_TABLE if SOME_COLUMN looks like A(\)_A% ESCAPE \ => AA%


-- *****

-- NULL 시작

-- *****

SELECT * FROM EMP WHERE COMM = NULL;
-- 제대로 COMM항목 중 NULL값이 나오지 않음. NULL이 들어간 순간 조건식 OR 계산식이 무의미해져버리기 때문.

SELECT * FROM EMP WHERE COMM IS NULL;
-- Select all from EMP if COMM is null.

Select * FROM EMP WHERE MGR IS NOT NULL;
-- Select all from EMP if MGR is not null.

SELECT * FROM EMP WHERE SAL < NULL OR COMM IS NULL;
-- Select all from EMP if SAL is smaller than NULL or COMM is NULL.

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10 UNION SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 20;
-- Select EMPNO, ENAME, SAL, DEPTNO from EMP if DEPTNO is 10 + Select EMPNO, ENAME, SAL, DEPTNO from EMP IF DEPTNO is 20.

-- UNION을 이용해서 DEPTNO 10,20의 결과를 모두 출력했다.

-- 이 방법은 EMPNO, ENAME, SAL, DEPTNO 라는 4개의 열 개수와 자료형이 순서대로 일치하기 때문에 실행이 가능한 것이다.

-- 아래는 오류가 뜬 경우이다.

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10 UNION SELECT EMPNO, ENAME, SAL FROM EMP WHERE DEPTNO = 20;
-- 앞은 4개의 열 뒤는 3개의 열이기 때문에 불가능.

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10 UNION SELECT ENAME, EMPNO, DEPTNO, SAL FROM EMP WHERE DEPTNO = 20;
-- 4개 열의 순서가 맞지 않기 때문에 불가능.

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10 UNION SELECT SAL, JOB, DEPTNO, SAL FROM EMP WHERE DEPTNO = 20;
-- 아랫단은 EMPNO, ENAME, SAL DEPTNO=10 의 순서의 열이 붙었고, 윗단에는 SAL, JOB ,DEPTNO=20, SAL 의 값을 가진 열이 붙었으나 COLUMN이름은 첫 SELECT 절을 기준으로 붙음.


-- 합집합<중복 포함> ,합집합<중복 삭제>, 차집합<중복 삭제>, 교집합<중복 부분 만>

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10 UNION SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;
-- 같은 열 순서, 조건 UNION => 합집합<중복 삭제>

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10 UNION ALL SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;
-- 같은 열 순서, 조건 UNION ALL => 합집합<중복 포함>

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP MINUS SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;
-- 같은 열 순서, 다른 조건 MINUS => 차집합<중복 삭제> / 왼쪽 SELECT절 범주에서 오른쪽 범주(DEPTNO=10)를 뺀 값.

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP INTERSECT SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;

--125p 복습

SELECT * FROM EMP WHERE ENAME LIKE '%S';
--Q1

SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE DEPTNO = 30 AND JOB = 'SALESMAN';
--Q2

SELECT EMPNO, ENAME, JOB, SAL ,DEPTNO FROM EMP WHERE SAL>2000 AND (DEPTNO = 20 OR DEPTNO =30);
--Q3 (1)

SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE SAL>2000 AND DEPTNO = 20 UNION SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE SAL>2000 AND DEPTNO = 30;
--Q3 (2)

SELECT * FROM EMP WHERE NOT(SAL>=2000 AND SAL<=3000);
--Q4

SELECT ENAME, EMPNO, SAL, DEPTNO FROM EMP WHERE DEPTNO = 30 AND SAL NOT BETWEEN 1000 AND 2000;
--Q5

SELECT * FROM EMP WHERE COMM IS NULL AND MGR IS NOT NULL AND ENAME NOT LIKE '_L%' AND JOB IN('MANAGER', 'CLERK');
--Q6


-- join

-- ********

SELECT * FROM EMP ORDER BY DEPTNO;

SELECT * FROM EMP, DEPT ORDER BY EMPNO;

SELECT * FROM EMP, DEPT WHERE EMP.DEPTNO = DEPT.DEPTNO ORDER BY EMPNO DESC;

SELECT * FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO ORDER BY EMPNO;

SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, E.DEPTNO, D.DNAME, D.LOC FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO ORDER BY EMPNO;
-- 실무에서는 이렇게 하나씩 열거하는 경우가 많다.

SELECT E.EMPNO, D.DNAME FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO ORDER BY EMPNO;

-- 조인 시, 조인 조건이 있어야 정확하게 맞아 떨어지는 데이터가 나옴. 그렇지 않은 경우에는 모든 경우의 수를 포함한 결과를 받게 되니 주의.

-- 서로 다른 테이블에서 어떤 COLUMN 값의 갯수가 맞아 떨어지는지를 판단해서 그 기준으로 동등 비교를 하는 경우가 많음.(PK,FK의 이유)

SELECT EMPNO, ENAME, DEPTNO, DNAME, LOC FROM EMP E, DEPT D WHERE E.EMPNO = D.DEPTNO;
-- E테이블과 D테이블이 모두 DEPTNO를 갖고 있어서 SELECT 범위가 명확히 정의되지 않음.

SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME, D.LOC FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO ORDER BY D.DEPTNO, E.EMPNO;
-- EMPNO 와 DEPTNO 각각의 기준에 따라 테이블 정렬 후 출력이며, EMP의 EMPNO, ENAME DEPT의 DEPTNO, DNAME, LOC 를 가져옴

-- 현재는 출력 행의 조건이 WHERE 이하 (E.DEPTNO = D.DEPTNO)인데, 조건 추가를 하고싶다면 AND OR 이용해서 가능

SELECT E.EMPNO, E.ENAME, E.SAL, E.DEPTNO, D.DNAME, D.LOC FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO AND SAL>=3000 ORDER BY DEPTNO;

--  ** 등가 조인 구조 : SELECT (테이블1 별칭).(테이블1 열 이름), ... (1 or 2 별칭).(기준 열 이름),...,(테이블2 별칭).(테이블2 열 이름) FROM 테이블1 1별칭 , 테이블2 2별칭 WHERE 별칭1.기준열이름 = 별칭2.기준열이름 AND/OR 조건 ORDER BY 정렬 조건;


-- **** 비등가 조인 ****


SELECT * FROM EMP E, SALGRADE S WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;
-- EMP 와 SALGRADE를 조인하려 하면, SALGRADE 는 범위를 조건으로 EMP와 조인을 해야 가능 함. (사용 열이 일치하지 않기 때문)

-- 여기서 비교한 조건은 EMP SAL 의 범위가 SALGRADE의 LOSAL 과 HISAL 사이인 값을 기준으로 EMP에서 출력 + SALGRADE 상의 LOS HIS범위가 뒤에 조인해서 붙음.

-- WHERE 절 뒤의 조건을 삭제하면 EMP테이블의 행마다 SALGRADE 가 5개씩 다 붙어버리는 상황이 발생 -> SAL과 SALGRADE 범위가 차이나는 잘못된 출력 발생.

SELECT * FROM EMP E, COPY_EMP C WHERE E.MGR = C.EMPNO;
-- 강제로 WHERE 절 이하 에서 동등 비교를 위해 COPY 테이블을 만드는 방식은 데이터 용량이 2배가 된다는 점 + 원본 EMP 테이블이 수정될 때마다 COPY 테이블도 수정해야한다는 점이 있다.

SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME FROM EMP E1, EMP E2 WHERE E1.MGR = E2.EMPNO;
-- 같은 EMP 테이블 안에서도 MGR값을 기준으로  사번, 이름, 매니저 - 매니저번호, 매니저 이름 식으로 붙여서 표현한 것.

-- 이를 보면, 조인 방식은 크게 2개 

--1) 등가 조인 (기준열의 갯수가 같을 때)

-- (1) E.DEPT 와 D.DEPT 의 길이와 열의 이름, 길이, 내용이 같아 동등 비교로 조인한 CASE

--2) 비등가 조인 (기준열의 갯수가 다를 때)

-- (1) 정렬 기준이 범위 설정인 때. (SALGRADE에서 HISAL, LOWSAL 의 범위로 구분지어 조인한 CASE)

-- (2) 정렬 기준이 값의 동치인 때. (같은 EMP 테이블에서 E1의 MGR 값에 대해 E2에서 MGR_EMPNO, MGR_ENAME으로 별칭 설정 후 E1 MGR -> MGR_EMPNO ->MGR_ENAME 형태로 진행. 매니저 사번과 이름 추려서 E1을 기준으로 조인한 CASE)

-- 이런 방식의 경우 MGR 열의 값이 NULL 인 PRESIDENT 의 존재로 인해서 출력에 손실이 발생하는 경우가 생김.

-- 테이블 값에 NULL이 존재하더라도 전체 출력이 필요한 경우 외부 조인을 통해 출력함.

SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME FROM EMP E1, EMP E2 WHERE E1.MGR(+) = E2.EMPNO ORDER BY E1.EMPNO;

---230p 부터 복습 재개 예정

--- Create, Update, Delete 먼저.

--p 266


CREATE TABLE DEPT_TEMP AS SELECT * FROM DEPT;
-- 기존에 존재하는 테이블을 복사해서 새로운 테이블을 만들 때.

INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC) VALUES (50, 'DATABASE', 'SEOUL');

SELECT * FROM DEPT_TEMP;

-- INSERT 문 사용 구조 : INSERT INTO 테이블 명 OR 테이블 중에 특정 열 (열1, 열2, 열3) VALUES (열1 타입의 입력값, 열2 타입의 입력값, 열3 타입의 입력값)
-- 이후 SELECT * FROM 테이블 명으로 제대로 INSERT 되었는지 확인 가능. 두개를 붙여서 사용 XX 입력 명령 1줄, 출력 명령 1줄.
-- 각각의 INSERT 값의 타입과 형식이 각 열이 가진 형태와 맞게 입력해야 함.
-- EX) 열1 :숫자,2자리 까지 / 열 2 : 문자 / 열3 : 문자  ==> 열1에 문자가 들어가거나 열 2,3에 숫자가 들어가는 경우 또는 4번째 입력값을 넣거나 2번째 까지만 입력값을 넣어, 열 갯수랑 매칭이 안되는 경우 등에 대해 오류발생.

INSERT INTO DEPT_TEMP VALUES (60, 'NETWORK', 'BUSAN');

SELECT * FROM DEPT_TEMP;
-- 위에서 DEPT_TEMP를 (DEPTNO, DNAME, LOC)으로 잡았기 때문에 VALUES를 입력할 때 별도로 열을 지정하지 않고 입력한 경우.

-- NULL 데이터 입력하는 방법

-- 1)NULL값 명시적으로 지정하여 입력하기.

INSERT INTO DEPT_TEMP VALUES (80,'MOBILE',NULL);

SELECT * FROM DEPT_TEMP;

-- 2)빈 공백 문자열''을 통해 NULL 입력하기.

INSERT INTO DEPT_TEMP VALUES (80,'MOBILE', '');

SELECT * FROM DEPT_TEMP;

-- 3)열 데이터를 입력하지 않는 것으로 NULL 입력하기.

INSERT INTO DEPT_TEMP (DEPTNO, LOC) VALUES (90, 'INCHEON');

SELECT * FROM DEPT_TEMP;

-- DEPT_TEMP 가 가진 열 중 DNAME 파트를 뺀 나머지 범위 지정 및 값 입력으로 90행의 DNAME 값을 NULL로 처리.

-- ** 0은 0이라는 값을 가지는 것으로 NULL이 아님을 기억 ** --

-----------------------

CREATE TABLE EMP_TEMP AS SELECT * FROM EMP WHERE 1<>1;

-- EMP_TEMP라는 테이블을 AS SELECT * FROM EMP를 통해 EMP 전체를 복사했으나 WHERE 이하 값이 FALSE, 1 != 1 을 통해 테이블 아래 값들을 제외하고 COLUMN값(열 구조)만 복제된 상황이다.

SELECT * FROM EMP_TEMP;

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01',5000,1000,10);

SELECT * FROM EMP_TEMP;

--EMP를 복사한 EMP_TEMP안에 HIREDATE 는 날짜 값을 'YYYY/MM/DD' 또는 'YYYY-MM-DD'의 형식으로 입력할 수 있다.
-- DATE INSERT의 양식이 있기 때문에 순서를 DD-MM-YYYY로 입력했을 때에는 오류가 발생한다.

-- 위와 같이 기본 언어군이나 OS의 차이로인해 발생할 수 있는 표기방식 차이에 따른 오류를 극복하기 위해서는 TO_DATE 함수를 사용하는 것이 좋다.

-- TO_DATE 함수 사용 예제

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE,SAL,COMM,DEPTNO) VALUES (2111,'이순신','MANAGER',9999,TO_DATE('07-01-2001','DD-MM-YYYY'),4000,NULL,20);

SELECT * FROM EMP_TEMP;
-- TO_DATE('00-00-0000','DD-MM-YYYY')를 이용해서 입력 넣은 형식의 날짜가 TALBE상에 적용될 수 있도록 하였음.

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (3111,'심청이','MANAGER',9999,SYSDATE,4000,NULL,30);

SELECT * FROM EMP_TEMP;
-- SYSDATE를 이용하여 시스템 환경 시간을 입력되게 함.

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) SELECT E.EMPNO,E.ENAME,E.JOB,E.MGR,E.HIREDATE,E.SAL,E.COMM,E.DEPTNO FROM EMP E, SALGRADE S WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL AND S.GRADE = 1;

SELECT * FROM EMP_TEMP;
-- SUBQUERY 개념을 이용해서 여러 데이터를 한번에 추가하는 방식이다. 서브쿼리 공부 이후 알아보자.


-- ***** UPDATE ***** --

CREATE TABLE DEPT_TEMP2 AS SELECT * FROM DEPT;
-- DEPT 테이블을 복사

SELECT * FROM DEPT_TEMP2;

UPDATE DEPT_TEMP2 SET LOC = 'SEOUL';

SELECT * FROM DEPT_TEMP2;

ROLLBACK;

UPDATE DEPT_TEMP2 SET DNAME = 'DATABASE', LOC = 'SEOUL' WHERE DEPTNO = 40;

UPDATE DEPT_TEMP2 SET (DNAME,LOC) = (SELECT DNAME, LOC FROM DEPT WHERE DEPTNO = 40) WHERE DEPTNO = 40;
-- 1) DEPT_TEMP2 의 DNAME,LOC을 수정하기 위해 DEPT테이블에서 DEPTNO=40에 해당하는 DNAME,LOC값을 가져온 후, DEPT_TEMP2에 전체 적용할 것이 아니기 때문에 WHERE절로 DEPTNO=40행에만 적용하게 함.

-- 이 형식의 서브쿼리는 DEPT_TEMP2 의 DNAME,LOC을 변경할건데, DEPT 테이블의 DEPTNO=40에 있는 값의 DNAME, LOC 을 받아 본 테이블의 DEPTNO=40에 적용한다는 의미

UPDATE DEPT_TEMP2 SET DNAME = (SELECT DNAME FROM DEPT WHERE DEPTNO = 40), LOC = (SELECT LOC FROM DEPT WHERE DEPTNO = 40) WHERE DEPTNO=40;

-- 2) DEPT_TEMP2에 DNAME 따로, LOC 따로 DEPT에서 DEPTNO=40행의 값을 받아와서 DEPT_TEMP2의 DEPTNO=40에 하나씩 넣는다. (위에 실행한것과 결과가 같음)

-- 이 형식은 서브쿼리를 2번 사용한 형태로 DNAME값을 DEPT 테이블의 DEPTNO=40에서 받아서 한번 (조건만 기재) , LOC값을 DEPT테이블의 DEPT=40에서 받아서 한번 이후 본문 적용 한번에 WHERE절 이하.

-- 1), 2)의 특징은 DEPT_TEMP2에 수정할 내용을 DEPT 테이블이 가지고 있기 때문에 받아와서 SET 하면 끝인 경우이나 아래는 새로운 값을 서브쿼리를 통해 삽입하는 경우이다.

UPDATE DEPT_TEMP2 SET LOC ='SEOUL' WHERE DEPTNO = (SELECT DEPTNO FROM DEPT_TEMP2 WHERE DNAME = 'OPERATIONS');

-- DEPT_TEMP2를 업데이트 한다/ LOC을 서울로 / DEPTNO를 통해 / DEPT_TEMP2의 DEPTNO 중에 DNAME이 오퍼레이션즈인 곳

-- 서브쿼리의 핵심인 DEPTNO가 40인 곳을 수정한다 가 아닌, DNAME이 오퍼레이션즈를 가진 행을 먼저 정의하고 본문의 WHERE 절에서 DEPTNO = 정의된 조건 의 형식으로 진행.

-- LOC 값을 서울로 바꾸려할때, DEPTNO가 몇인지가 아닌 DEPTNO를 기준으로 할건데, 그 DEPTNO는 (DNAME이 OPERATIONS인 DEPTNO = 40)에! LOC 을 서울로 바꿀거다. 즉, WHERE을 서브쿼리로 이용.

-- 우리가 보통 LOC을 가지고 돌린다 하면 SET LOC = '~' WHERE LOC = '*' 로 가지만, 서브쿼리는 한번 더 꼬아서 DNAME에 ##값을 갖고있는~ 행의 LOC을 '*'로 바꿀거다 라는 의미로 해석.
UPDATE DEPT_TEMP2 SET DNAME = 'DATABASE', LOC = 'SEOUL' WHERE DEPTNO = 40;

SELECT * FROM DEPT_TEMP2 WHERE DEPTNO = 40;


-- ***** DELETE *****


CREATE TABLE EMP_TEMP3 AS SELECT * FROM EMP;

SELECT * FROM EMP_TEMP3;

DELETE FROM EMP_TEMP3 WHERE JOB = 'MANAGER';
--DLETE FROM 테이블 명 WHERE 조건.

DELETE FROM EMP_TEMP3 WHERE EMPNO IN(SELECT E.EMPNO FROM EMP_TEMP3 E, SALGRADE S WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL AND S.GRADE = 3 AND DEPTNO = 30);

SELECT * FROM EMP_TEMP3;
--서브쿼리 기능을 이용해서 일부 데이터만 삭제

-- EMP_TEMP3 테이블에서 EMPNO(PK로 사용)가 "SELECT과정 생략" (SAL이 LOSAL과 HISAL 사이 값, SALGRADE 3에서, 그리고 DEPTNO가 30인) 괄호 안의 조건을 만족하는 EMPNO 행을 삭제한다.

-- 287P 실습

CREATE TABLE CHAP10HW_EMP AS SELECT * FROM EMP;

CREATE TABLE CHAP10HW_DEPT AS SELECT * FROM DEPT;

CREATE TABLE CHAP10HW_SALGRADE AS SELECT * FROM SALGRADE;

INSERT INTO CHAP10HW_DEPT(DEPTNO, DNAME, LOC) VALUES(50,'ORACLE','BUSAN');

INSERT INTO CHAP10HW_DEPT VALUES(60,'SQL','ILSAN');

INSERT INTO CHAP10HW_DEPT VALUES(70,'SELECT','INCHEON');

INSERT INTO CHAP10HW_DEPT VALUES(80,'DML','BUNDANG');

SELECT * FROM CHAP10HW_DEPT ORDER BY DEPTNO;

DELETE FROM CHAP10HW_DEPT WHERE DEPTNO=60;

INSERT INTO CHAP10HW_EMP (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) VALUES(7201,'TEST_USER1','MANAGER',7788,'2016-01-02',4500,NULL,50);

INSERT INTO CHAP10HW_EMP VALUES (7202,'TEST_USER2','CLERK',7201,'2016-02-21',1800,NULL,50);

INSERT INTO CHAP10HW_EMP VALUES (7203,'TEST_USER3','ANALYST',7201,'2016-04-11',3400,NULL,60);

INSERT INTO CHAP10HW_EMP VALUES (7204,'TEST_USER4','SALESMAN',7201,'2016-05-31',2700,300,60);

INSERT INTO CHAP10HW_EMP VALUES (7205,'TEST_USER5','CLERK',7201,'2016-07-20',2600,NULL,70);

INSERT INTO CHAP10HW_EMP VALUES (7206,'TEST_USER6','CLERK',7201,'2016-09-08',2600,NULL,70);

INSERT INTO CHAP10HW_EMP VALUES (7207,'TEST_USER7','LECTURER',7201,'2016-10-28',2300,NULL,80);

INSERT INTO CHAP10HW_EMP VALUES (7208,'TEST_USER8','STUDENT',7201,'2018-03-09',1200,NULL,80);

SELECT * FROM CHAP10HW_EMP WHERE DEPTNO = 50;
--AVG함수를 이용해서 평균값 내야하지만, 우선은 직접 계산해서 진행.

UPDATE CHAP10HW_EMP SET DEPTNO = 70 WHERE SAL > 3150;

SELECT * FROM CHAP10HW_EMP ORDER BY DEPTNO;

--------------------------------------- SYSTEM 계정 사용 ------------------------------


CREATE TABLE EMP_DDL (
EMPNO NUMBER(4),
ENAME VARCHAR2(10),
JOB VARCHAR2(9),
MGR NUMBER(4),
HIREDATE DATE,
SAL NUMBER(7,2),
COMM NUMBER (7,2),
DEPTNO NUMBER(2)
);

DESC EMP_DDL;

---- CREATE 이용해서 각 COLUMN 이름 설정 + 각 COLUMN의 데이터 타입 및 길이 설정 , (CONSTRAINT는 현재 생략됨)  ..1) 테이블 새로 생성

CREATE TABLE DEPT_DDL AS SELECT * FROM DEPT;

DESC DEPT_DDL;

SELECT * FROM DEPT_DDL;

---- CREATE 이용해서 기존의 DEPT 테이블 복사해서 새로 생성.                                               ..2) 기존 테이블 복사해서 새로 생성

CREATE TABLE EMP_DDL_30 AS SELECT * FROM EMP WHERE DEPTNO = 30;

SELECT * FROM EMP_DDL_30;

-- 테이블 일부(DEPTNO=30)만 복사해서 테이블 생성                                                         ..3) 기존 테이블의 일부만 복사해서 새로 생성

CREATE TABLE EMPDEPT_DDL AS SELECT E.EMPNO, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, D.DEPTNO, D.DNAME, D.LOC FROM EMP E, DEPT D WHERE 1<>1;

SELECT * FROM EMPDEPT_DDL;

-- 기존 테이블의 열구조 (COLUMN 구조 + COLUMN 이름)만 복사하여 새 테이블 생성.                               ..4) 기존 테이블의 (열 구조+열 이름)만 복사해서 새로 생성. 

-- 위 생성문에서는 EMP에서 EMPNO,JOB,MGR,HIREDATE,SAL,COMM 을, DEPT에서 DEPTNO, DNAME, LOC을 받아옴.

-- 1<>1 의 FALSE 값을 이용해서 아랫단에 붙는 모든 행의 데이터를 제거함.

CREATE TABLE EMP_ALTER AS SELECT * FROM EMP;

SELECT * FROM EMP_ALTER;
-- EMP_ALTER라는 EMP 복사 테이블 생성.

ALTER TABLE EMP_ALTER ADD HP VARCHAR2(20);

SELECT * FROM EMP_ALTER;

-- EMP_ALTER 테이블에 HP(COLUMN명)/ VARCHAR2(타입명) / 20 데이터 용량  을 ADD 한다

ALTER TABLE EMP_ALTER RENAME COLUMN HP TO TEL;

SELECT * FROM EMP_ALTER;

-- 위에서 HP라는 이름으로 ADD 한 COLUMN명을 TEL로 바꿈.




-- ***** p398 사용자 계정 설정 (SYSTEM이용)


-- 유저 이름(ID) 설정, IDENTIFIED BY [PW] 설정.

-- 계정 생성 + DB 연결 권한 부여 = 한번에.

-- ALTER USER [유저이름] IDENTIFIED BY [변경할 PW] 로 유저의 비밀번호 변경 가능.

-- DROP USER [유저이름] 으로 해당 계정 삭제 가능.

CREATE USER ORCLSTUDY IDENTIFIED BY ORACLE;
-- 유저 이름 ORCLSTUDY / PW ORACLE 로 계정 생성

GRANT CREATE SESSION TO ORCLSTUDY;
-- ORCLSTUDY에 데이터베이스 연결 권한 부여. (GRANT 허가, CREATE SESSION 을 ORCLSTUDY에게 )

SELECT * FROM ALL_USERS WHERE USERNAME = 'ORCLSTUDY';
-- ALL_USERS의 테이블(모든 유저 이름 가진 테이블)에서 ORCLSTUD 객체 조회.

SELECT * FROM DBA_USERS WHERE USERNAME = 'ORCLSTUDY';
--DBA_USERS 테이블에서 ORCLSTUDY 조회

SELECT * FROM DBA_OBJECTS WHERE OWNER = 'ORCLSTUDY';

ALTER USER ORCLSTUDY IDENTIFIED BY ORCL;
-- ORCLSTUDY 의 비밀번호를 ORACLE 에서 ORCL로 변경.

DROP USER ORCLSTUDY;
-- 설정했던 ORCLSTUDY 유저를 삭제.

DROP USER ORCLSTUDY CASCADE;
-- 사용자 + 객체 모두 삭제하기. (윗 단에서 DROP 해서 이미 정보가 없음.)

-- CASCADE 경우 해당 사용자가 생성했던 객체들까지 모두 지우는 것으로, TABLE의 데이터에 영향을 미칠 수 있기 때문에 사용을 지양하는 편이다.

CREATE USER ORCLSTUDY IDENTIFIED BY ORACLE;

