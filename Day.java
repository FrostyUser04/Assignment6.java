public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekday() {
        throw new UnsupportedOperationException("Unimplemented method 'isWeekday'");
    }

    boolean isWeekend() {
        throw new UnsupportedOperationException("Unimplemented method 'isWeekend'");
    }

    Object nextDay() {
        throw new UnsupportedOperationException("Unimplemented method 'nextDay'");
    }

    Object previousDay() {
        throw new UnsupportedOperationException("Unimplemented method 'previousDay'");
    }
}
