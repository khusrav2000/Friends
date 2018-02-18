1.Simple data selects from tables
  1) Выдать содержимое всех столбцов таблицы Н_УЧЕБНЫЕ_ГОДА
      select * from Н_УЧЕБНЫЕ_ГОДА;
  2) Выдать содержимое столбца(ов) ид, когда_создал, короткое_имя, кто_создал для таблицы Н_ДИСЦИПЛИНЫ
      select ИД, КОГДА_СОЗДАЛ, КОРОТКОЕ_ИМЯ, КТО_СОЗДАЛ from Н_ДИСЦИПЛИНЫ;
  3) Вывести полные наименования циклов дисциплин учебного процесса
      select НАИМЕНОВАНИЕ from Н_ЦИКЛЫ_ДИСЦИПЛИН;

2.Excluding dublicates
  4) Вывести только уникальные сокращенные названия дисциплин, по которым предусмотрены занятия в университете

3.Derived and computed data
  5) Вычислить количество времени с даты рождения человека до 1.05.2013 в секундах
  6) Вывести в один столбец текст, содержащий фамилию, имя и год рождения людей в формате 'Уникальный идентификатор 99ПетрПетров'
4.Selecting with WHERE clause and ordering
  7) Выдать идентификатор и короткое наименование дисциплин, содержащих в названии 'кт'
  8) Выдать идентификатор и наименование дисциплин, содержащих в названии 'инженер', отсортированые по столбцу 'идентификатор'
  9) Выдать наименования и идентификатор дисциплин, заканичивающихся на 'ики', отсортированые используя номера столбцов, по столбцам 2,1
  10) Вывести фамилии, отчества и даты рождения для имен София, Ольга,
5.Data aggregation
  11) Вывести количество студенческих групп начинающихся на 110. Ответ выдать в виде 'Групп на 110 - 1000'
  12) Определить количество различных отчеств людей. Результат расположить по убыванию. Привести 5 первых результатов запроса.

  http://bdis.umeta.ru/db/db_course/labs/SQLpHTM/02.htm


https://docs.microsoft.com/ru-ru/sql/t-sql/functions/datediff-transact-sql

