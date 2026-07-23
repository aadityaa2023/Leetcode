SELECT w2.id
FROM Weather w1
JOIN Weather w2
ON SUBDATE(w2.recordDate, 1) = w1.recordDate
WHERE w2.temperature > w1.temperature;