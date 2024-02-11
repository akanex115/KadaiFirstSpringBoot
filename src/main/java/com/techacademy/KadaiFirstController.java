package com.techacademy;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val}")
    public String dispDayOfWeek(@PathVariable String val) {
        int year = Integer.parseInt(val.substring(0, 4));
        int month = Integer.parseInt(val.substring(4, 6));
        int day = Integer.parseInt(val.substring(6, 8));
        // 年月日から曜日を取得
        LocalDate localDate = LocalDate.of(year, month, day);

        return localDate.getDayOfWeek().toString();
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = val1 + val2;
        return String.valueOf(res);
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = val1 - val2;
        return String.valueOf(res);
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = val1 * val2;
        return String.valueOf(res);
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        if (val2 == 0) {
            return "0で割る事はできません";
        }
        double res = val1 / val2;
        return String.valueOf(res);
    }

}
