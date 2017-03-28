package seedu.geekeep.model.util;

import seedu.geekeep.commons.exceptions.IllegalValueException;
import seedu.geekeep.model.GeeKeep;
import seedu.geekeep.model.ReadOnlyGeeKeep;
import seedu.geekeep.model.tag.UniqueTagList;
import seedu.geekeep.model.task.DateTime;
import seedu.geekeep.model.task.Location;
import seedu.geekeep.model.task.Task;
import seedu.geekeep.model.task.Title;
import seedu.geekeep.model.task.UniqueTaskList.DuplicateTaskException;

public class SampleDataUtil {
    public static ReadOnlyGeeKeep getSampleGeeKeep() {
        try {
            GeeKeep sampleAB = new GeeKeep();
            for (Task sampleTask : getSampleTasks()) {
                sampleAB.addTask(sampleTask);
            }
            return sampleAB;
        } catch (DuplicateTaskException e) {
            throw new AssertionError("sample data cannot contain duplicate tasks", e);
        }
    }

    //TODO to add floating tasks and deadlines
    public static Task[] getSampleTasks() {
        try {
            return new Task[] {
                new Task(new Title("GeeKeep Demo"), new DateTime("01-04-17 1630"),
                        new DateTime("01-04-17 1830"),
                        new Location("Blk 30 Geylang Street 29, #06-40"),
                        new UniqueTagList("CS2101"),
                        false),
                new Task(new Title("GeeKeep Release"), new DateTime("02-04-17 1630"),
                        new DateTime("02-04-17 1830"),
                        new Location("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                        new UniqueTagList("CS2103T", "friends"),
                        false),
                new Task(new Title("Labor Day"), new DateTime("01-05-17 0000"),
                        new DateTime("01-05-17 2359"),
                        new Location("Earth"),
                        new UniqueTagList("holiday"),
                        false),
                new Task(new Title("Summar Vacation"), new DateTime("27-04-17 0000"),
                        new DateTime("28-04-17 2359"),
                        new Location("Mars"),
                        new UniqueTagList("holiday"),
                        false),
                new Task(new Title("Internship"), new DateTime("02-05-17 0000"),
                        new DateTime("08-05-17 2359"),
                        new Location("Blk 47 Tampines Street 20, #17-35"),
                        new UniqueTagList("work"),
                        false),
                new Task(new Title("Sleep"), new DateTime("01-04-17 0000"),
                        new DateTime("01-04-27 2359"),
                        new Location("Bed"),
                        new UniqueTagList("health"),
                        false),


                new Task(new Title("Flight to NYC"), null,
                        new DateTime("08-08-17 2359"),
                        new Location("Changi Airport"),
                        new UniqueTagList("travel"),
                        false),
                new Task(new Title("Flight to Singapore"), null,
                        new DateTime("20-08-17 2359"),
                        new Location("JFK Airport"),
                        new UniqueTagList("travel"),
                        false),
                new Task(new Title("CS2101 OP2"), null,
                        new DateTime("01-04-17 2359"),
                        new Location("com2-0108"),
                        new UniqueTagList("school"),
                        false),
                new Task(new Title("CS2103T final"), null,
                        new DateTime("25-04-17 1300"),
                        new Location("MPSH"),
                        new UniqueTagList("finals"),
                        false),
                new Task(new Title("CS3230 final"), null,
                        new DateTime("26-04-17 1300"),
                        new Location("MPSH"),
                        new UniqueTagList("finals"),
                        false),
                new Task(new Title("CS3218 final"), null,
                        new DateTime("03-05-17 0900"),
                        new Location("MPSH"),
                        new UniqueTagList("finals"),
                        false),
                new Task(new Title("CS3247 finals"), null,
                        new DateTime("26-04-17 1700"),
                        new Location("MPSH"),
                        new UniqueTagList("finals"),
                        false),
                new Task(new Title("Flight to Santigo"), null,
                        new DateTime("10-09-17 1300"),
                        new Location("Changi Airport"),
                        new UniqueTagList("travel"),
                        false),
                new Task(new Title("Packing"), null,
                        null,
                        new Location("Home"),
                        new UniqueTagList("trivia"),
                        false),
                new Task(new Title("Landray"), null,
                        null,
                        new Location("Home"),
                        new UniqueTagList("trivia"),
                        false),
                new Task(new Title("Buy Pens"), null,
                        null,
                        new Location("FairPrice"),
                        new UniqueTagList("Shopping"),
                        false),
                new Task(new Title("Buy Shirts"), null,
                        null,
                        new Location("G2000"),
                        new UniqueTagList("Shopping"),
                        false),
                new Task(new Title("Buy Socks"), null,
                        null,
                        new Location("Uniqlo"),
                        new UniqueTagList("Shopping"),
                        false),
                new Task(new Title("Buy Pants"), null,
                        null,
                        new Location("H&M"),
                        new UniqueTagList("Shopping"),
                        false),
                new Task(new Title("Learn Spanish"), null,
                        null,
                        null,
                        new UniqueTagList("Life"),
                        false),
                new Task(new Title("Buy Coffee"), null,
                        null,
                        new Location("Nespresso"),
                        new UniqueTagList("Shopping"),
                        false),
                new Task(new Title("Google Internship"), new DateTime("02-05-17 0000"),
                        new DateTime("08-08-17 2359"),
                        new Location("Google Headquater"),
                        new UniqueTagList("work"),
                        false),
                new Task(new Title("Career Talk"), new DateTime("03-05-17 1300"),
                        new DateTime("03-05-17 1500"),
                        new Location("Cerebro"),
                        new UniqueTagList("school"),
                        false),
                new Task(new Title("STEPS"), new DateTime("20-04-17 1300"),
                        new DateTime("20-04-17 2200"),
                        new Location("Com1"),
                        new UniqueTagList("school"),
                        false),
                new Task(new Title("Watch Movie Spiderman"), new DateTime("08-05-17 1900"),
                        new DateTime("08-05-17 2100"),
                        new Location("JCube"),
                        new UniqueTagList("leisure"),
                        false),
                new Task(new Title("Hangout with friends"), new DateTime("08-05-17 1300"),
                        new DateTime("08-05-17 1800"),
                        new Location("ION"),
                        new UniqueTagList("leisure"),
                        false),
                new Task(new Title("Meeting for project"), new DateTime("05-04-17 1000"),
                        new DateTime("05-04-17 1200"),
                        new Location("Biz Lib"),
                        new UniqueTagList("school"),
                        false),
                new Task(new Title("Meeting for another project"), new DateTime("05-04-17 1200"),
                        new DateTime("05-04-17 1400"),
                        new Location("Com2"),
                        new UniqueTagList("school"),
                        false),
                new Task(new Title("Internship Interview"), new DateTime("09-04-17 1400"),
                        new DateTime("09-04-17 1600"),
                        new Location("Fusionopolis"),
                        new UniqueTagList("work"),
                        false),
                };
        } catch (IllegalValueException e) {
            throw new AssertionError("sample data cannot be invalid", e);
        }
    }
}
