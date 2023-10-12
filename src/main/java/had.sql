""" 키, 몸무게, 체지방 구하는 공식을 적용한 후 가장 큰 사람 구하기"""
SELECT
    name,
    height,
    weight,
    fat
FROM
    person
WHERE
    fat = (SELECT MAX(fat) FROM person)
""" 키, 몸무게, 체지방 구하는 공식을 적용한 후 가장 작은 사람 구하기"""
SELECT
    name,
    height,
    weight,
    fat
FROM
    person
WHERE
    fat = (SELECT MIN(fat) FROM person)
""" 키, 몸무게, 체지방 구현하기"""
SELECT
    name,
    height,
    weight,
    (weight / (height * height)) * 10000 AS fat
FROM
    person
""" 회원 등록 및 삭제 구현"""
INSERT INTO person (name, height, weight) VALUES ('김철수', 180, 80)
DELETE FROM person WHERE name = '김철수'


