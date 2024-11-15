package com.codetest.bookingsystem.interfaces;

import com.codetest.bookingsystem.dto.ScheduleClassDTO;

import java.util.List;

public interface ScheduleClassService {

    ScheduleClassDTO getScheduleClassById(Long id);

    ScheduleClassDTO createScheduleClass(ScheduleClassDTO scheduleClassDTO);

    List<ScheduleClassDTO> getAllScheduleClass();

    ScheduleClassDTO updateScheduleClass(Long id,ScheduleClassDTO scheduleClassDTO);

    List<ScheduleClassDTO> findUpcomingClasses();
}
