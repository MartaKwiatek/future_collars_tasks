package org.Marta;

import org.Marta.externalServices.BaseSalaryService;
import org.Marta.externalServices.SaturdayBonusService;

import java.math.BigDecimal;

public class SalaryCalculator {
    private final SaturdayBonusService saturdayBonusService;
    private final BaseSalaryService baseSalaryService;

    public SalaryCalculator(SaturdayBonusService saturdayBonusService, BaseSalaryService baseSalaryService) {
        this.saturdayBonusService = saturdayBonusService;
        this.baseSalaryService = baseSalaryService;
    }

    private BigDecimal calculateTotalBonus(int howManySaturdays, BigDecimal oneTimeBonus) {
        BigDecimal saturdayBonus = new BigDecimal(howManySaturdays).multiply(saturdayBonusService.getSaturdayBonus());
        return oneTimeBonus.add(saturdayBonus);
    }

    public BigDecimal calculateSalary(int howManySaturdays, BigDecimal oneTimeBonus) {
        BigDecimal baseSalary = baseSalaryService.getBaseSalary();
        return baseSalary.add(calculateTotalBonus(howManySaturdays, oneTimeBonus));
    }
}
