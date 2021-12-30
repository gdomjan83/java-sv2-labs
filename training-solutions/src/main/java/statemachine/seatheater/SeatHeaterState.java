package statemachine.seatheater;

public enum SeatHeaterState {
    THREE {
        public SeatHeaterState changeHeating() {
            return SeatHeaterState.TWO;
        }
    },
    TWO {
        public SeatHeaterState changeHeating() {
            return SeatHeaterState.ONE;
        }
    },
    ONE {
        public SeatHeaterState changeHeating() {
            return SeatHeaterState.OFF;
        }
    }
    ,
    OFF {
        public SeatHeaterState changeHeating() {
            return SeatHeaterState.THREE;
        }
    };

    abstract SeatHeaterState changeHeating();
}
