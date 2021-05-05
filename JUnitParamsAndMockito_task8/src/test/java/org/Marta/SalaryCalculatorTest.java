package org.Marta;

import org.Marta.externalServices.BaseSalaryService;
import org.Marta.externalServices.SaturdayBonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

class SalaryCalculatorTest {

    @Test
    void calculateSalary() {
        //given
        int howManySaturdays = 2;
        BigDecimal oneTimeBonus = new BigDecimal("100.0");

        SaturdayBonusService saturdayBonusServiceMock = Mockito.mock(SaturdayBonusService.class);
        BaseSalaryService baseSalaryServiceMock = Mockito.mock(BaseSalaryService.class);

        Mockito.when(saturdayBonusServiceMock.getSaturdayBonus()).thenReturn(new BigDecimal("1000.0"));
        Mockito.when(baseSalaryServiceMock.getBaseSalary()).thenReturn(new BigDecimal("5000.0"));

        SalaryCalculator salaryCalculator = new SalaryCalculator(saturdayBonusServiceMock, baseSalaryServiceMock);

        //when
        BigDecimal salary = salaryCalculator.calculateSalary(howManySaturdays, oneTimeBonus);

        //then
        Assertions.assertEquals(new BigDecimal("7100.0"), salary);
    }
}