package Contests.Week12;

public class Con12_04 {
    public static void main(String[] args) {
        EventOrganizer organizer = new EventOrganizer(5);
        organizer.addEvent("Music Festival", "2023-07-15", "Central Park");
        organizer.addEvent("Art Exhibition", "2023-08-21", "City Gallery");

        EventViewer viewer = new EventViewer();
        for (int i = 0; i < organizer.getEventCount(); i++) {
            viewer.displayEvent(organizer.getEvent(i));
        }
    }
}

class EventOrganizer{
    private Event[] events;
    private static int eventCount = 0;

    class Event{
        private String name;
        private String date;
        private String location;

        public String toString(){
            return "Event Name: "+name+"\n" +
                    "Date: "+date+"\n" +
                    "Location: "+location;
        }
    }

    public EventOrganizer(int capacity){
        events = new Event[capacity];
    }

    public void addEvent(String name, String date, String location){
        events[eventCount] = new Event();
        events[eventCount].name = name;
        events[eventCount].date = date;
        events[eventCount].location = location;
        eventCount++;
    }

    public Event getEvent(int index){
        if (0 <= index && index <eventCount){
            return events[index];
        } else {
            return null;
        }
    }

    public int getEventCount(){
        return eventCount;
    }
}


class EventViewer {

    public void displayEvent(EventOrganizer.Event event){
        System.out.println(event.toString());
    }

}