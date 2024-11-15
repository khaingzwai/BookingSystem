package com.codetest.bookingsystem.service;

import com.codetest.bookingsystem.dto.ScheduleClassDTO;
import com.codetest.bookingsystem.interfaces.ScheduleClassService;
import com.codetest.bookingsystem.mapper.SchedulerClassMapper;
import com.codetest.bookingsystem.model.ScheduleClass;
import com.codetest.bookingsystem.repository.ScheduleClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleClassServiceImpl implements ScheduleClassService {

    @Autowired
    private ScheduleClassRepository scheduleClassRepository;


    @Override
    public ScheduleClassDTO getScheduleClassById(Long id) {
        try {
            ScheduleClass scEntity = scheduleClassRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Schedule not found"));
            return SchedulerClassMapper.toDTO(scEntity);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ScheduleClassDTO createScheduleClass(ScheduleClassDTO scheduleClassDTO) {
        try {
            ScheduleClass scheduleClass = SchedulerClassMapper.toModel(scheduleClassDTO);
            scheduleClass = scheduleClassRepository.save(scheduleClass);
            return SchedulerClassMapper.toDTO(scheduleClass);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ScheduleClassDTO> getAllScheduleClass() {
        try {
            List<ScheduleClass> scheduleClasses = scheduleClassRepository.findAll();
            return scheduleClasses.stream().map(SchedulerClassMapper::toDTO).collect(Collectors.toList());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ScheduleClassDTO updateScheduleClass(Long id, ScheduleClassDTO scheduleClassDTO) {
        try {
            ScheduleClass scheduleClass = scheduleClassRepository.findById(id).orElse(null);
            assert scheduleClass != null;
            scheduleClass = scheduleClassRepository.save(scheduleClass);
            return SchedulerClassMapper.toDTO(scheduleClass);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ScheduleClassDTO> findUpcomingClasses() {
        try {
            List<ScheduleClass> scheduleClasses = scheduleClassRepository.findUpcomingClasses();
            return scheduleClasses.stream().map(SchedulerClassMapper::toDTO).collect(Collectors.toList());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
