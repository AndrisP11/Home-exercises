package io.codelex.enums.practice;

public enum NorthSouthEastWest {
    NORTH("North", "up", 0),
    SOUTH("South", "down", 1),
    EAST("East", "right", 2),
    WEST("West", "left", 3);

    private final String direction;
    private final String way;
    private final int id;

    NorthSouthEastWest(String direction, String way, int id) {
        this.direction = direction;
        this.way = way;
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public String getWay() {
        return way;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return direction + ":" +
                way + ":" +
                id;
    }
}
