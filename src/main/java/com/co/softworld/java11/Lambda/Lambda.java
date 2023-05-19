package com.co.softworld.java11.Lambda;

import com.co.softworld.java11.constants.Number;
import lombok.extern.slf4j.Slf4j;

import static com.co.softworld.java11.constants.Number.EVEN;
import static com.co.softworld.java11.constants.Number.ODD;
import static java.lang.String.format;
import static java.util.stream.IntStream.of;

@Slf4j
public class Lambda {

    void numberSelection(Number number) {
        log.info("numberSelection...");
        switch (number) {
            case EVEN:
                of(1, 2, 3, 4, 5, 6).filter((var i) -> i % 2 == 0).forEach(even -> log.info("Even: " + even));
                break;
            case ODD:
                of(1, 2, 3, 4, 5, 6).filter((var a) -> a % 2 != 0).forEach(odd -> log.info("Odd: " + odd));
                break;
            default:
                log.info("No valid");
        }
    }

    void sum(double n1, double n2) {
        log.info("sum...");
        IOperation sum = Double::sum;
        log.info(format("%s + %s = %s", n1, n2, sum.calculate(n1, n2)));
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.numberSelection(EVEN);
        lambda.numberSelection(ODD);
        lambda.sum(2, 4);
        lambda.sum(-1, 3);
    }

}
