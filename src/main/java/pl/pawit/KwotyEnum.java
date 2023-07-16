package pl.pawit;

import java.math.BigDecimal;

public enum KwotyEnum {
    Q1(1, new BigDecimal(500), false),
    Q2(2, new BigDecimal(1000), true),
    Q3(3, new BigDecimal(2000), false),
    Q4(4, new BigDecimal(5000), false),
    Q5(5, new BigDecimal(10000), false),
    Q6(6, new BigDecimal(20000), false),
    Q7(7, new BigDecimal(32000), true);

    public final int questionNr;
    public final BigDecimal price;
    public final boolean isGuaranteed;


    KwotyEnum(int questionNr, BigDecimal price, boolean isGuaranteed) {
        this.questionNr = questionNr;
        this.price = price;
        this.isGuaranteed = isGuaranteed;
    }
}
