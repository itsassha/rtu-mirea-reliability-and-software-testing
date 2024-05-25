@Test
void findMaxWithSingleElement() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12};
    long expected = 12;
    long actual = service.findMax(incomesInBillions);
    Assertions.assertEquals(expected, actual);
}

@Test
void findMaxWithAllEqualElements() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {7, 7, 7, 7, 7, 7, 7, 7};
    long expected = 7;
    long actual = service.findMax(incomesInBillions);
    Assertions.assertEquals(expected, actual);
}

@Test
void findMaxWithDescendingOrder() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    long expected = 12;
    long actual = service.findMax(incomesInBillions);
    Assertions.assertEquals(expected, actual);
}

@Test
void findMaxWithNegativeValues() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {-3, -8, -2, -5, -7};
    long expected = -2;
    long actual = service.findMax(incomesInBillions);
    Assertions.assertEquals(expected, actual);
}
