package com.arc.excel.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/17 22:13
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Employee {
    private String name;
    private Integer age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //
    double f = 111231.5585;

    public void m1() {
        BigDecimal bg = new BigDecimal(f);
        double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
    }

    /**
     * DecimalFormat转换最简便
     */
    public void m2() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(f));
    }

    /**
     * String.format打印最简便
     */
    public void m3() {
        System.out.println(String.format("%.2f", f));
    }

    public void m4() {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(f));
    }

    public static void main(String[] args) {
        Employee f = new Employee();
        f.m1();
        f.m2();
        f.m3();
        f.m4();

    }
}

