# 최솟값 구하기 : 동물 보호소에 가장 먼저 들어온 동물의 들어온 날 구하기
# SELECT DATETIME AS 시간
# FROM ANIMAL_INS
# ORDER BY DATETIME ASC
# LIMIT 1;

SELECT MIN(DATETIME) AS 시간
FROM ANIMAL_INS;