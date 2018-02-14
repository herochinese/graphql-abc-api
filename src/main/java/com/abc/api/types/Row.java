package com.abc.api.types;

import java.util.List;

public class Row {
    private List<Seat> seatList;

    public Row(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
