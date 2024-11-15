package com.codetest.bookingsystem.interfaces;

import com.codetest.bookingsystem.dto.BookingCancel;
import com.codetest.bookingsystem.dto.BookingDTO;
import com.codetest.bookingsystem.dto.BookingRequest;
import com.codetest.bookingsystem.dto.BookingResponse;

import java.util.List;

public interface BookingService {

    BookingResponse addBooking(BookingRequest bookingRequest);

    BookingResponse cancelBooking(BookingCancel bookingCancel);

    List<BookingDTO> getAllBookingsByUserId(Long userId);
}
