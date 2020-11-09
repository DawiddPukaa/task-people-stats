
package task.people.stats

class Main {
    public static void main(String[] args) {
        PeopleStats peopleStats = new PeopleStats(Paths.get("śćieżka", "do", "pliku"));
        System.out.println(String.format("Liczba osób: %d", peopleStats.count()));
        System.out.println(String.format("Liczba osób z unikalnymi nazwiskami: %d", peopleStats.countUniqueLastNames()));
        System.out.println("Hello world");
    }
}



