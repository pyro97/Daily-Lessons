package pyroapp.myapplication.utils;

public enum WeekDaysEnum {
    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday");

    public String value;

    public String getText() {
        return this.value;
    }

    public static WeekDaysEnum fromString(String text) {
        for (WeekDaysEnum b : WeekDaysEnum.values()) {
            if (b.value.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return MONDAY;
    }

    WeekDaysEnum(String value) {
        this.value = value;
    }

}
