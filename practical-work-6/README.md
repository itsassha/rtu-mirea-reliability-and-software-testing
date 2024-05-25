# Результаты работы

## Пример результатов тестирования

```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running ru.example.statistic.StatisticsServiceTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in ru.example.statistic.StatisticsServiceTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] -------------------------------------------------------
```

## Пример ошибки, при недостаточном покрытии

```
[INFO] --- jacoco-maven-plugin:0.8.5:check (check) @ statistic ---
[INFO] Analyzed bundle 'statistic' with 1 classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.345 s
[INFO] Finished at: 2024-05-25T10:15:42+00:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.jacoco:jacoco-maven-plugin:0.8.5:check (check) on project statistic: Coverage checks have not been met. See log for details. -> [Help 1]
```
