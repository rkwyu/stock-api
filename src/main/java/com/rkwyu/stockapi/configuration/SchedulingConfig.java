package com.rkwyu.stockapi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class SchedulingConfig {
    /*
	 * cron format:
	 * - Seconds
	 * - Mintutes
	 * - Hours
	 * - Day of Month
	 * - Month
	 * - Day of Week
    */

    /*
    @Scheduled(cron = "* * * * * *")
    public void cronExecutor() {
    }

    // every n millisecond, after last exection is finished
    @Scheduled(fixedDelay = 3000)
	public void fixedDelayExecutor() {
    }

    // every n millisecond, regardless last execution is finished
    @Scheduled(fixedRate = 3000)
	public void fixedRateExecutor() {
    }
    */
}
