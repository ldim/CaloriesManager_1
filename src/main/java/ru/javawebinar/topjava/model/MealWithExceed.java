package ru.javawebinar.topjava.model;
/**
 * bin который будет передаваться на клиента и у которого есть поле exceed которое показывает превышает ли сумма калорий в день за одно значение
 */

import java.time.LocalDateTime;

public class MealWithExceed {
    private final LocalDateTime dateTime; // хранится время без тайм зоны, составной класс из LocalTime и DateTime

    private final String description;

    private final int calories;

    private final boolean exceed;

    public MealWithExceed(LocalDateTime dateTime, String description, int calories, boolean exceed) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.exceed = exceed;
    }

    @Override
    public String toString() {
        return "MealWithExceed{" +
                "dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                ", exceed=" + exceed +
                '}';
    }
}